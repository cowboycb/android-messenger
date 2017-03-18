package com.cowboy.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        Intent intent = getIntent();
        String gelenMessage = intent.getStringExtra(EXTRA_MESSAGE);

        TextView txtMessage = (TextView) findViewById(R.id.txtMessage);
        txtMessage.setText(gelenMessage);

    }

}
