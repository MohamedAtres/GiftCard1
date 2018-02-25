package com.example.android.giftcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CongratActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulation);

        //receive Information From Main activity about sender and receiver name's
        Intent intent2 = getIntent();
        String sender = intent2.getStringExtra("sender");
        String receiver = intent2.getStringExtra("receiver");

        TextView congrateText = (TextView) findViewById(R.id.congrate_text_view);

        congrateText.setText("Congratulation ," + receiver);

        TextView fromText = (TextView) findViewById(R.id.from_congrate_text);

        fromText.setText("From ," + sender);
    }
}
