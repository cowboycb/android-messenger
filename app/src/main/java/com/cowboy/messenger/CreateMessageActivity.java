package com.cowboy.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

    }

    public void  onClickSendMessage(View view){
        //
        EditText txtMessage = (EditText) findViewById(R.id.etxtMessage);
        //Intent intent = new Intent(this, RecieveMessageActivity.class);
        //intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE, txtMessage.getText().toString());

        String messageText = txtMessage.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);

        String chsTitle = getString(R.string.strChooseAppTitle);
        Intent chosenIntent = Intent.createChooser(intent, chsTitle);
        startActivity(chosenIntent);
        // seçimli pencere açılır.
    }

}
