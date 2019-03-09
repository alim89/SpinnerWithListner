package com.example.a20140550.spinnerwithlistner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Spinner spinner;
    private String[] countryName;
    private String[] population;
 int[] flags={R.drawable.bicon,R.drawable.iicon,R.drawable.picon,R.drawable.nicon,R.drawable.bhicon};
    private boolean firstSelect=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryName=getResources().getStringArray(R.array.country_name);
        population=getResources().getStringArray(R.array.population);
        spinner= (Spinner) findViewById(R.id.spinerID);

        CustomAdapter customAdapter=new CustomAdapter(this,flags,countryName,population);
        spinner.setAdapter(customAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

                if(firstSelect==true)
                {

                    firstSelect=false;
                }
                else
                {
                    Toast.makeText(getApplicationContext(), countryName[i]+"is Selected",Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
