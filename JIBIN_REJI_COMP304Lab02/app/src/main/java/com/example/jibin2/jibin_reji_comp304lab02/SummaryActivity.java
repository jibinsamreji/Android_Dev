package com.example.jibin2.jibin_reji_comp304lab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {
    String stuff,number,chk1,chk2,chk3,ChkBx1Name,ChkBx2Name,ChkBx3Name,ChkBx4Name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        Bundle bundle = getIntent().getExtras();

//Extract the data…
        stuff = bundle.getString("selR");
        number = bundle.getString("flag");
        chk1=bundle.getString("cb1");
        chk2=bundle.getString("cb2");
        chk3=bundle.getString("cb3");
        ChkBx1Name=bundle.getString("userN");
        ChkBx2Name=bundle.getString("userAd");
        ChkBx3Name=bundle.getString("userCr");
        ChkBx4Name=bundle.getString("userFav");
        TextView contEdit1= (TextView) findViewById(R.id.textViewGetUserName);
        contEdit1.setText(ChkBx1Name);
        TextView contEdit2= (TextView) findViewById(R.id.textViewGetUserAddress);
        contEdit2.setText(ChkBx2Name);
        TextView contEdit3= (TextView) findViewById(R.id.textViewGetCuisineType);
        switch (number)
        {
            case "1":
                contEdit3.setText("American");
                break;
            case "2":
                contEdit3.setText("Indian");
                break;
            case "3":
                contEdit3.setText("Chinese");
                break;
            case "4":
                contEdit3.setText("Italian");
                break;



        }
        TextView contEdit4= (TextView) findViewById(R.id.textViewFoodOne);
        contEdit4.setText(chk1);
        TextView contEdit5= (TextView) findViewById(R.id.textViewFoodTwo);
        contEdit5.setText(chk2);
        TextView contEdit6= (TextView) findViewById(R.id.textViewFoodThree);
        contEdit6.setText(chk3);
    }
}
