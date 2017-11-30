package com.example.android.whois;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int count =0;
    TextView TXScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TXScore =(TextView)findViewById(R.id.score);


    }

    public void theWritePlayer(View view) {
        count++;
        Toast.makeText(this, "Right Go To next Player", Toast.LENGTH_SHORT).show();
    }

    public void theFinalWritePlayer(View view) {
        count++;
        Toast.makeText(this, "Click The Button", Toast.LENGTH_SHORT).show();
    }

    public void Result(View view) {
        Toast.makeText(this, "Your Result is : "+String.valueOf(count), Toast.LENGTH_LONG).show();
        count=0;

    }

    public void theWrongPlayer(View view) {
        Toast.makeText(this, "wrong Go To next Player", Toast.LENGTH_SHORT).show();
    }
}
