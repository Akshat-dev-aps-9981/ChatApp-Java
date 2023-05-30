package com.kappaapps.kappachat.Activities;

import android.content.Intent;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.itsaky.androidide.logsender.LogSender;
import com.kappaapps.kappachat.Activities.OTPActivity;
import com.kappaapps.kappachat.Activities.PhoneNumberActivity;
import com.kappaapps.kappachat.Activities.MainActivity;
import com.kappaapps.kappachat.databinding.ActivityPhoneNumberBinding;

public class PhoneNumberActivity extends AppCompatActivity {
    ActivityPhoneNumberBinding binding;
    FirebaseAuth auth;
    
  @Override
  protected void onCreate(Bundle savedInstanceState) {
      LogSender.startLogging(this);
    super.onCreate(savedInstanceState);
    binding = ActivityPhoneNumberBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());
    auth = FirebaseAuth.getInstance();

        if(auth.getCurrentUser() != null) {
            Intent intent = new Intent(PhoneNumberActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        getSupportActionBar().hide();

        binding.phoneBox.requestFocus();

        binding.continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneNumberActivity.this, OTPActivity.class);
                intent.putExtra("phoneNumber", binding.phoneBox.getText().toString());
                startActivity(intent);
            }
        });

    }
  }

