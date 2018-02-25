package com.example.android.giftcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);

        //receive Information From Main activity about sender and receiver name's
        Intent intent = getIntent();
        String sender = intent.getStringExtra("sender");
        String receiver = intent.getStringExtra("receiver");

        TextView thankText = (TextView) findViewById(R.id.thank_text_view);

        thankText.setText("Thank You ," + receiver);

        TextView fromText = (TextView) findViewById(R.id.from_thank_text);

        fromText.setText("From ," + sender);
    }
}
