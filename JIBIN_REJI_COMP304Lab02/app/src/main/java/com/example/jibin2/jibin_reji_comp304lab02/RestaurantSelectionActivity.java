package com.example.jibin2.jibin_reji_comp304lab02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.checked;

public class RestaurantSelectionActivity extends AppCompatActivity  {
    String stuff,number;
    String ChkBxData1,ChkBxData2,ChkBxData3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_selection);

        Bundle bundle = getIntent().getExtras();

//Extract the data…
        stuff = bundle.getString("selR");
         number = bundle.getString("flag");
        TextView txt=(TextView)findViewById(R.id.textViewFoodSelectio);
       // Toast.makeText(getApplicationContext(),stuff+number, Toast.LENGTH_SHORT).show();
        ((CheckBox)findViewById(R.id.checkBxOne)).setText("");
        ((CheckBox)findViewById(R.id.checkBxTwo)).setText("");
        ((CheckBox)findViewById(R.id.checkBxThree)).setText("");
        if(stuff.equals("DQ Grills"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Chicken Sandwich Grilled");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("DQ Special SteakSandwich");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Potatoe Wedges");
//            //findViewById(R.id.checkBoxFirst)="ddd";
//            String[] foodTypes = getResources().getStringArray(R.array.DQ_Food_Menu);
//            ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, foodTypes);
//            GridView gridView = (GridView) findViewById(R.id.gridViewFoodList);
//            gridView.setAdapter(adapter2);
//            for (int i = 0; i < adapter2.getCount(); i++) {
//                gridView.setItemChecked(i,true);
//
//            }
        }
        else if(stuff.equals("Mc Donalds"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Junior Chicken");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Big Mac Sandwich");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Potatoe Wedges");

        }
        else if(stuff.equals("Johns Hotel"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Chicken Salad Sandwich");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Steak Filled Wrap");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Bacon Filled Wrap");

        }
        else if(stuff.equals("ITC Hotel"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Tandoori Chicken");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Chicken 65");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Chapati");

        }
        else if(stuff.equals("The Indian Cuisine"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Meals");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Parotta");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Masala Dosa");

        }
        else if(stuff.equals("J and E Food Chain"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Vegetable Biriyani");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Chicken Biriyani");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Tomatoe Soup");

        }
        else if(stuff.equals("Lee Hotels"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Spicy Chicken Sprinkels");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Bacon Rice");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Steak Rice");

        }
        else if(stuff.equals("The Chinese Cuisine"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Sea Fish ");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Chicken Nuggets");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Noodles");

        }
        else if(stuff.equals("Hong-Lee Cuisine"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Chicken Soup");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Steak Noodles");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Potatoe Bacon");

        }
        else if(stuff.equals("La-Fete Cuisine"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Calzoni");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Pasta");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Pizza Marinara");

        }
        else if(stuff.equals("Italianao Hotel"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Taralli");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Chicken Burger");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Tortano");

        }
        else if(stuff.equals("Tasty Buds Hotel"))
        {
            ((CheckBox)findViewById(R.id.checkBxOne)).setText("Chicken Nuggets");
            ((CheckBox)findViewById(R.id.checkBxTwo)).setText("Agnolotti");
            ((CheckBox)findViewById(R.id.checkBxThree)).setText("Eliche");

        }

    }
    public void onSelectFoodButtonClick(View v)
    {
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBxOne);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBxTwo);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.checkBxThree);
        if(checkBox1.isChecked()||checkBox2.isChecked()||checkBox3.isChecked())
        {
            Intent i = new Intent(this, CustomerDetails.class);
            String flagNumber=number;
            String selRest=stuff;
            if(checkBox1.isChecked())
            {
               ChkBxData1=checkBox1.getText().toString();
            }
            if(checkBox2.isChecked())
            {
               ChkBxData2=checkBox2.getText().toString();
            }

            if(checkBox3.isChecked())
            {
               ChkBxData3=checkBox3.getText().toString();
            }


//Create the bundle
            Bundle bundle = new Bundle();

//Add your data to bundle
            bundle.putString("selR",selRest);
            bundle.putString("flag",flagNumber);
            bundle.putString("cb1",ChkBxData1);
            bundle.putString("cb2",ChkBxData2);
            bundle.putString("cb3",ChkBxData3);
//Add the bundle to the intent
            i.putExtras(bundle);

//Fire that second activity
            startActivity(i);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Please Make a Selection ", Toast.LENGTH_SHORT).show();
        }
    }


}
