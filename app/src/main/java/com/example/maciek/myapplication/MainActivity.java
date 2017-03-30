package com.example.maciek.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button p1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = (Button) findViewById(R.id.przejscie);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), mowa.class);
                startActivity(i);
            }
        });

        Log.d("Test : ", "ala ma kota");

        int liczba1 = 1;
        int liczba2 = 1;
        int wynik ;

        double libcz1 = 1.67;
        double liczb2 = 2.67;
        double wynk;

        float ko11







        wynk = liczba1 * liczba2;
        wynik = liczba1 + liczba2;

        Log.d("Wynik :", String.valueOf(wynik)) ;



    }
}
