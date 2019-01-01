package com.example.jibinreji_comp304lab1_ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "JUST A MESSAGE :-) ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessageInput(View view)
    {
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText=(EditText) findViewById(R.id.editTextBox_Input);
        String message = String.valueOf(editText.getText());
        intent.putExtra(EXTRA_MESSAGE,message);
    startActivity(intent);}


}
