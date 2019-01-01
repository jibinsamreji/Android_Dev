package com.example.jibin.jibin_reji_comp304_001_hands_on_test_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup=(RadioGroup) findViewById(R.id.radioButtonGrpContacts);
        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {


                RadioButton rb1 = (RadioButton) findViewById(R.id.radioButtonJame);
                RadioButton rb2 = (RadioButton) findViewById(R.id.radioButtonJames);
                RadioButton rb3 = (RadioButton) findViewById(R.id.radioButtonJibin);
                RadioButton rb4 = (RadioButton) findViewById(R.id.radioButtonJohn);

                if (rb1.isChecked()) {
                    flag = 1;
                } else if (rb2.isChecked()) {
                    flag = 2;
                } else if (rb3.isChecked()) {
                    flag = 3;
                } else if (rb4.isChecked()) {
                    flag = 4;
                }
            }
        });




    }
    public void onContactBtnClick(View view)
    {


            Intent i=new Intent(this,selected_contact_activity.class);
            Integer flagNumber=Integer.valueOf(flag);

            //create the bundle
            Bundle bundle=new Bundle();

            //Add data to bundle
            bundle.putInt("flagNum",flagNumber);
            i.putExtras(bundle);


            //Fire the next desired activity
            startActivity(i);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
