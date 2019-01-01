package com.example.jibin2.jibin_reji_comp304lab02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CustomerDetails extends AppCompatActivity {
    String stuff,number,chk1,chk2,chk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);

        Bundle bundle = getIntent().getExtras();

//Extract the data…
        stuff = bundle.getString("selR");
        number = bundle.getString("flag");
        chk1=bundle.getString("cb1");
        chk2=bundle.getString("cb2");
        chk3=bundle.getString("cb3");

       // Toast.makeText(getApplicationContext(),stuff+number+chk1, Toast.LENGTH_SHORT).show();
    }
    public void onOrderButtonClick(View v)
    {
       EditText contEdit= (EditText)findViewById(R.id.editTextUserName);
        EditText contEdit1= (EditText)findViewById(R.id.editTextAddress);
        EditText contEdit2= (EditText)findViewById(R.id.editTextCreditCard);
        EditText contEdit3= (EditText)findViewById(R.id.editTextFavFood);
        String ChkBx1Name=contEdit.getText().toString();
        String ChkBx2Name=contEdit1.getText().toString();
        String ChkBx3Name=contEdit2.getText().toString();
        String ChkBx4Name=contEdit3.getText().toString();

        if(ChkBx1Name.length()==0)
        {
            Toast.makeText(getApplicationContext(),"User Name Required ", Toast.LENGTH_SHORT).show();
        }

        if(ChkBx2Name.length()==0)
            {
                Toast.makeText(getApplicationContext(),"Address Required ", Toast.LENGTH_SHORT).show();

            }
        if(ChkBx3Name.length()==0)
            {
                Toast.makeText(getApplicationContext(),"Credit Card details Required ", Toast.LENGTH_SHORT).show();

            }
        if(ChkBx4Name.length()==0)
            {
                Toast.makeText(getApplicationContext(),"Please Enter Your Favourite Food Item ", Toast.LENGTH_SHORT).show();

            }
           if(ChkBx2Name.length()!=0&&ChkBx3Name.length()!=0&&ChkBx4Name.length()!=0&&ChkBx4Name.length()!=0)
            {
                Intent i = new Intent(this, SummaryActivity.class);
                String flagNumber=number;
                String selRest=stuff;
                String ChkBxData1=chk1;
                String ChkBxData2=chk2;
                String ChkBxData3=chk3;
                String userN=ChkBx1Name;
                String userAd=ChkBx2Name;
                String userCr=ChkBx3Name;
                String userFav=ChkBx4Name;


//Create the bundle
                Bundle bundle = new Bundle();

//Add your data to bundle
                bundle.putString("selR",selRest);
                bundle.putString("flag",flagNumber);
                bundle.putString("cb1",ChkBxData1);
                bundle.putString("cb2",ChkBxData2);
                bundle.putString("cb3",ChkBxData3);
                bundle.putString("userN",userN);
                bundle.putString("userAd",userAd);
                bundle.putString("userCr",userCr);
                bundle.putString("userFav",userFav);
//Add the bundle to the intent
                i.putExtras(bundle);

//Fire that second activity
                startActivity(i);
            }






    }
}
