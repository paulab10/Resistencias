package com.paulabetancur.resistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {


    private Spinner Sband1, Sband2, Sband3, Sband4;
    private TextView showVal1, showVal2;
    double digit1=10, digit2=0, multipl=1, toler=0.01, delta, val1, val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sband1 = (Spinner) findViewById(R.id.band1Spinner);
        Sband2 = (Spinner) findViewById(R.id.band2Spinner);
        Sband3 = (Spinner) findViewById(R.id.band3Spinner);
        Sband4 = (Spinner) findViewById(R.id.band4Spinner);
        showVal1 =(TextView) findViewById(R.id.ShowVal1);
        showVal2 =(TextView) findViewById(R.id.ShowVal2);


        delta=(digit1+digit2)*multipl*toler;
        val1=((digit1+digit2)*multipl)-delta;
        val2=((digit1+digit2)*multipl)+delta;
        showVal1.setText(Double.toString(val1));
        showVal2.setText(Double.toString(val2));

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.banda1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Sband1.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.banda2, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Sband2.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.banda3, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Sband3.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.banda4, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Sband4.setAdapter(adapter4);

        Sband1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        digit1=10;
                        break;
                    case 1:
                        digit1=20;
                        break;
                    case 2:
                        digit1=30;
                        break;
                    case 3:
                        digit1=40;
                        break;
                    case 4:
                        digit1=50;
                        break;
                    case 5:
                        digit1=60;
                        break;
                    case 6:
                        digit1=70;
                        break;
                    case 7:
                        digit1=80;
                        break;
                    case 8:
                        digit1=90;
                        break;
                }
                delta=(digit1+digit2)*multipl*toler;
                val1=((digit1+digit2)*multipl)-delta;
                val2=((digit1+digit2)*multipl)+delta;
                showVal1.setText(Double.toString(val1));
                showVal2.setText(Double.toString(val2));
                //Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio
            }
        });

        Sband2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        digit2=0;
                        break;
                    case 1:
                        digit2=1;
                        break;
                    case 2:
                        digit2=2;
                        break;
                    case 3:
                        digit2=3;
                        break;
                    case 4:
                        digit2=4;
                        break;
                    case 5:
                        digit2=5;
                        break;
                    case 6:
                        digit2=6;
                        break;
                    case 7:
                        digit2=7;
                        break;
                    case 8:
                        digit2=8;
                        break;
                    case 9:
                        digit2=9;
                        break;
                }
                delta=(digit1+digit2)*multipl*toler;
                val1=((digit1+digit2)*multipl)-delta;
                val2=((digit1+digit2)*multipl)+delta;
                showVal1.setText(Double.toString(val1));
                showVal2.setText(Double.toString(val2));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio
            }
        });

        Sband3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        multipl=Math.pow(10,0);
                        break;
                    case 1:
                        multipl=Math.pow(10,1);
                        break;
                    case 2:
                        multipl=Math.pow(10,2);
                        break;
                    case 3:
                        multipl=Math.pow(10,3);
                        break;
                    case 4:
                        multipl=Math.pow(10,4);
                        break;
                    case 5:
                        multipl=Math.pow(10,5);
                        break;
                    case 6:
                        multipl=Math.pow(10,6);
                        break;
                    case 7:
                        multipl=Math.pow(10,7);
                        break;
                    case 8:
                        multipl=Math.pow(10,8);
                        break;
                    case 9:
                        multipl=Math.pow(10,9);
                        break;
                    case 10:
                        multipl=Math.pow(10,-1);
                        break;
                    case 11:
                        multipl=Math.pow(10,-2);
                        break;
                }
                delta=(digit1+digit2)*multipl*toler;
                val1=((digit1+digit2)*multipl)-delta;
                val2=((digit1+digit2)*multipl)+delta;
                showVal1.setText(Double.toString(val1));
                showVal2.setText(Double.toString(val2));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio
            }
        });

        Sband4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                switch (position){
                    case 0:
                        toler=0.01;
                        break;
                    case 1:
                        toler=0.02;
                        break;
                    case 2:
                        toler=0.005;
                        break;
                    case 3:
                        toler=0.0025;
                        break;
                    case 4:
                        toler=0.001;
                        break;
                    case 5:
                        toler=0.0005;
                        break;
                    case 6:
                        toler=0.05;
                        break;
                    case 7:
                        toler=0.1;
                        break;
                    case 8:
                        toler=0.2;
                        break;
                }
                delta=(digit1+digit2)*multipl*toler;
                val1=((digit1+digit2)*multipl)-delta;
                val2=((digit1+digit2)*multipl)+delta;
                showVal1.setText(Double.toString(val1));
                showVal2.setText(Double.toString(val2));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio
            }
        });


    }
}
