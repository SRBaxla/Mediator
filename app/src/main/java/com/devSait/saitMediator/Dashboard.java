package com.devSait.saitMediator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }
        public void logout(View view){
            FirebaseAuth.getInstance().signOut();//logout
            startActivity(new Intent(getApplicationContext(), login_page.class));
            finish();
        }

}