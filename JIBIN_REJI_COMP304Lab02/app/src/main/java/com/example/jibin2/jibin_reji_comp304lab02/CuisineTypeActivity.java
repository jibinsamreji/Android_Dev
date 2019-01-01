package com.example.jibin2.jibin_reji_comp304lab02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CuisineTypeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
        int flag=0;
        Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine_type);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.cuisineTypeRadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rb1 = (RadioButton) findViewById(R.id.radioBtnAmerican);
                RadioButton rb2 = (RadioButton) findViewById(R.id.radioBtnIndian);
                RadioButton rb3 = (RadioButton) findViewById(R.id.radioBtnChinese);
                RadioButton rb4 = (RadioButton) findViewById(R.id.radioBtnItalian);
                if (rb1.isChecked())
                {

                    DisplayToast("Cuisine Type : American Selected!");
                    flag=1;

                }
                else if(rb2.isChecked())
                {

                    DisplayToast("Cuisine Type : Indian Selected!");
                    flag=2;
                }
                else if(rb3.isChecked())
                {

                    DisplayToast("Cuisine Type : Chinese Selected!");
                    flag=3;
                }
                else if(rb4.isChecked())
                {

                    DisplayToast("Cuisine Type : Italian Selected!");
                    flag=4;
                }
            }
        });

    }

    private void DisplayToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void onCuisineBtnClick(View view) {
        spinner=(Spinner) findViewById(R.id.spinnerMenu);
        spinner.setAdapter(null);
        ArrayAdapter arrayMenu,arrayMenu1,arrayMenu2,arrayMenu3;
        int n=flag;

        switch(n)
        {

            case 1:
              //  DisplayToast("American Test is Ok");
                arrayMenu=ArrayAdapter.createFromResource(this,R.array.AmericanRestaurants,android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(arrayMenu);
                spinner.setOnItemSelectedListener(this);
                break;
            case 2:
              //  DisplayToast("Indian Test is Ok");

                arrayMenu1=ArrayAdapter.createFromResource(this,R.array.IndianRestaurants,android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(arrayMenu1);
                spinner.setOnItemSelectedListener(this);
                break;
            case 3:
               // DisplayToast("Chinese Test is Ok");
                arrayMenu2=ArrayAdapter.createFromResource(this,R.array.ChineseRestaurants,android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(arrayMenu2);
                spinner.setOnItemSelectedListener(this);

                break;
            case 4:
                //DisplayToast("Italian Test is Ok");
                arrayMenu3=ArrayAdapter.createFromResource(this,R.array.ItalianRestaurants,android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(arrayMenu3);
                spinner.setOnItemSelectedListener(this);
                break;
            default:
                DisplayToast("Select a Cuisine From The Above");
                break;
        }


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView myText=(TextView) view;
        DisplayToast("You Selected "+myText.getText());

    }



    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void onFoodBtnSelcClick(View v)
    {
        if(flag==0)
        {
            DisplayToast("Select a Cuisine From The Above");
        }
        else
        {
            Intent i = new Intent(this, RestaurantSelectionActivity.class);
            String flagNumber=String.valueOf(flag);
            String selRest=spinner.getSelectedItem().toString();

//Create the bundle
            Bundle bundle = new Bundle();

//Add your data to bundle
            bundle.putString("selR",selRest);
            bundle.putString("flag",flagNumber);

//Add the bundle to the intent
            i.putExtras(bundle);

//Fire that second activity
            startActivity(i);
        }

    }


}

