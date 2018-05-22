package com.example.ahmed.twitterlogin;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Homepage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Toast.makeText(this, "Welcome to your Homepage !", Toast.LENGTH_SHORT).show();
        String username = getIntent().getStringExtra("username");
        TextView uname = findViewById(R.id.TV_username);
        uname.setText(username);
    }
}
