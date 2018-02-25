package com.example.android.giftcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        //receive Information From Main activity about sender and receiver name's
        Intent intent3 = getIntent();
        String sender = intent3.getStringExtra("sender");
        String receiver = intent3.getStringExtra("receiver");


        TextView happyText = (TextView) findViewById(R.id.happy_text_view);

        happyText.setText("Happy Birhday To You ," + receiver);

        TextView fromText = (TextView) findViewById(R.id.from_birthday_text);

        fromText.setText("From ," + sender);
    }


}
