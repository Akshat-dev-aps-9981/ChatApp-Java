// Generated by view binder compiler. Do not edit!
package com.kappaapps.kappachat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kappaapps.kappachat.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView attachment;

  @NonNull
  public final ImageView camera;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final EditText messageBox;

  @NonNull
  public final TextView name;

  @NonNull
  public final CircleImageView profile;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final ImageView sendBtn;

  @NonNull
  public final TextView status;

  @NonNull
  public final Toolbar toolbar;

  private ActivityChatBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView attachment,
      @NonNull ImageView camera, @NonNull CardView cardView, @NonNull ImageView imageView2,
      @NonNull EditText messageBox, @NonNull TextView name, @NonNull CircleImageView profile,
      @NonNull RecyclerView recyclerView, @NonNull ImageView sendBtn, @NonNull TextView status,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.attachment = attachment;
    this.camera = camera;
    this.cardView = cardView;
    this.imageView2 = imageView2;
    this.messageBox = messageBox;
    this.name = name;
    this.profile = profile;
    this.recyclerView = recyclerView;
    this.sendBtn = sendBtn;
    this.status = status;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.attachment;
      ImageView attachment = ViewBindings.findChildViewById(rootView, id);
      if (attachment == null) {
        break missingId;
      }

      id = R.id.camera;
      ImageView camera = ViewBindings.findChildViewById(rootView, id);
      if (camera == null) {
        break missingId;
      }

      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.messageBox;
      EditText messageBox = ViewBindings.findChildViewById(rootView, id);
      if (messageBox == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.profile;
      CircleImageView profile = ViewBindings.findChildViewById(rootView, id);
      if (profile == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.sendBtn;
      ImageView sendBtn = ViewBindings.findChildViewById(rootView, id);
      if (sendBtn == null) {
        break missingId;
      }

      id = R.id.status;
      TextView status = ViewBindings.findChildViewById(rootView, id);
      if (status == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityChatBinding((ConstraintLayout) rootView, attachment, camera, cardView,
          imageView2, messageBox, name, profile, recyclerView, sendBtn, status, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}