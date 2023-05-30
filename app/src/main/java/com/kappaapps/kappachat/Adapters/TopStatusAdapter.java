package com.kappaapps.kappachat.Adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kappaapps.kappachat.Activities.MainActivity;
import com.kappaapps.kappachat.Models.Messages;
import com.kappaapps.kappachat.Models.User;
import com.kappaapps.kappachat.Models.Status;
import com.kappaapps.kappachat.Models.UserStatus;
import com.kappaapps.kappachat.R;
import com.kappaapps.kappachat.databinding.DeleteDialogBinding;
import com.kappaapps.kappachat.databinding.ItemReceiveBinding;
import com.kappaapps.kappachat.databinding.ItemSentBinding;
import com.kappaapps.kappachat.databinding.ItemReceiveGroupBinding;
import com.kappaapps.kappachat.databinding.ItemSentGroupBinding;
import com.kappaapps.kappachat.databinding.ItemStatusBinding;
import java.util.ArrayList;

import omari.hamza.storyview.StoryView;
import omari.hamza.storyview.callback.StoryClickListeners;
import omari.hamza.storyview.model.MyStory;

public class TopStatusAdapter extends RecyclerView.Adapter<TopStatusAdapter.TopStatusViewHolder> {
  Context context;
  ArrayList<UserStatus> userStatuses;

  public TopStatusAdapter(Context context, ArrayList<UserStatus> userStatuses) {
    this.context = context;
    this.userStatuses = userStatuses;
  }

  @NonNull
  @Override
  public TopStatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_status, parent, false);
    return new TopStatusViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull TopStatusViewHolder holder, int position) {

	UserStatus userStatus = userStatuses.get(position);
    
    try {
      Status lastStatus = userStatus.getStatuses().get(userStatus.getStatuses().size() - 1);

      Glide.with(context).load(lastStatus.getImageUrl()).into(holder.binding.image);
    } catch (IndexOutOfBoundsException e) {
      AlertDialog.Builder builder = new AlertDialog.Builder(context);
      builder.setTitle("IndexOutOfBoundsException");
      builder.setMessage(e.getLocalizedMessage());
      builder.setCancelable(false);
      builder.setPositiveButton(
          "Ok",
          new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int i) {
                
                dialog.dismiss();
            }
          });
          AlertDialog dialog = builder.create();
          dialog.show();
      e.printStackTrace();
    }
    holder.binding.circularStatusView.setPortionsCount(userStatus.getStatuses().size());

    holder.binding.circularStatusView.setOnClickListener(
        new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            ArrayList<MyStory> myStories = new ArrayList<>();
            for (Status status : userStatus.getStatuses()) {
              myStories.add(new MyStory(status.getImageUrl()));
            }

            new StoryView.Builder(((MainActivity) context).getSupportFragmentManager())
                .setStoriesList(myStories) // Required
                .setStoryDuration(5000) // Default is 2000 Millis (2 Seconds)
                .setTitleText(userStatus.getName()) // Default is Hidden
                .setSubtitleText("") // Default is Hidden
                .setTitleLogoUrl(userStatus.getProfileImage()) // Default is Hidden
                .setStoryClickListeners(
                    new StoryClickListeners() {
                      @Override
                      public void onDescriptionClickListener(int position) {
                        // your action
                      }

                      @Override
                      public void onTitleIconClickListener(int position) {
                        // your action
                      }
                    }) // Optional Listeners
                .build() // Must be called before calling show method
                .show();
          }
        });
  }

  @Override
  public int getItemCount() {
    return userStatuses.size();
  }

  public class TopStatusViewHolder extends RecyclerView.ViewHolder {

    ItemStatusBinding binding;

    public TopStatusViewHolder(@NonNull View itemView) {
      super(itemView);
      binding = ItemStatusBinding.bind(itemView);
    }
  }
}
