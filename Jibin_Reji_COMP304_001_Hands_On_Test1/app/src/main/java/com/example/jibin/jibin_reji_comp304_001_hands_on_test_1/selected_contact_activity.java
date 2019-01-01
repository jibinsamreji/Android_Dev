package com.example.jibin.jibin_reji_comp304_001_hands_on_test_1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class selected_contact_activity extends AppCompatActivity {
    Integer fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_contact_activity);

        //Extracting Bundle data
        Bundle bundle = getIntent().getExtras();

        fl=bundle.getInt("flagNum");

        switch (fl)
        {
            case 1:

                getSupportActionBar().setTitle(R.string.radioButtonJame);
                getSupportActionBar().setCustomView(R.layout.activity_selected_contact_activity);
                break;
            case 2:

                getSupportActionBar().setTitle(R.string.radioButtonJames);
                getSupportActionBar().setCustomView(R.layout.activity_selected_contact_activity);
                break;
            case 3:

                getSupportActionBar().setTitle(R.string.radioButtonJibin);
                getSupportActionBar().setCustomView(R.layout.activity_selected_contact_activity);
                break;
            case 4:

                getSupportActionBar().setTitle(R.string.radioButtonJohn);
                getSupportActionBar().setCustomView(R.layout.activity_selected_contact_activity);
                break;



        }


    }
    public void onSendBtnClick(View view)
    {
        EditText edttxt=(EditText)findViewById(R.id.editTextMessage);
        String msg=edttxt.getText().toString();
        if(msg.isEmpty()|| msg.equals(""))
        {
            Toast.makeText(getApplicationContext(),"Message Box is Empty!",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),"Message: "+msg,Toast.LENGTH_SHORT).show();

        }
    }




}

