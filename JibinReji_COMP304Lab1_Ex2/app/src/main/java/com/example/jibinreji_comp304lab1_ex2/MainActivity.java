package com.example.jibinreji_comp304lab1_ex2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessageInput(View view)
    {

        Intent intent = new Intent(this,DisplayMessageActivityPage.class);
      //  TextView textv = (TextView)findViewById(R.id.textv);
       // textv.setText(R.string.name+" "+R.string.program_name+" "+R.string.sem+" "+R.string.course_name+" ");
        String msg= "FULL NAME: "+getResources().getString(R.string.name)+""+"\n"+"PROGRAM NAME: "+getResources().getString(R.string.program_name)+"\n"+"SEMESTER: "+""+getResources().getString(R.string.sem)+"\n"+"COURSE NAME: "+getResources().getString(R.string.course_name);
        Intent intent1 = intent.putExtra(EXTRA_MESSAGE,msg);
        startActivity(intent);}
}
