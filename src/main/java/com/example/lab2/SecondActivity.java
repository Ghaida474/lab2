package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity {

    TextView receiver_msg = (TextView) findViewById(R.id.received_value_id);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        receiver_msg.setText("hello,"+ str+"!");

    }
}