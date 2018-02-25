package com.example.android.giftcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //A global variable for sender name
    private String mSenderName;

    //A global variable for reciver name
    private String mReceiverName;

    //A global variable for position of selection
    private int mSelector = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set items for Spinner

        final List<String> cards = new ArrayList<String>();

        cards.add("Select Card");
        cards.add("Congratulation");
        cards.add("Thanks");
        cards.add("Happy Birthday");

        //define spinner element

        Spinner spinner = (Spinner) findViewById(R.id.card_spinner_view);
        spinner.setOnItemSelectedListener(this);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, cards);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        mSelector = i ;

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void selectCard(View view){

        //get the name of sender from user
        EditText senderText = (EditText) findViewById(R.id.sender_text_view);

        mSenderName = senderText.getText().toString();

        //get the name of sender from user
        EditText receiverText = (EditText) findViewById(R.id.receiver_text_view);

        mReceiverName = receiverText.getText().toString();

        //make the suitable action when select a card from user
        switch (mSelector){
            case 1:

                //open congrate card and send names to it
                Intent intent = new Intent(this , CongratActivity.class);
                intent.putExtra("sender" , mSenderName);
                intent.putExtra("receiver" , mReceiverName);
                startActivity(intent);
                break;

            case 2:

                //open Thanks card and send names to it
                Intent intent2 = new Intent(this , ThanksActivity.class);
                intent2.putExtra("sender" , mSenderName);
                intent2.putExtra("receiver" , mReceiverName);
                startActivity(intent2);
                break;

            case 3:

                //open Birthday card and send names to it
                Intent intent3 = new Intent(this , BirthdayActivity.class);
                intent3.putExtra("sender" , mSenderName);
                intent3.putExtra("receiver" , mReceiverName);
                startActivity(intent3);
                break;

        }
    }
}
