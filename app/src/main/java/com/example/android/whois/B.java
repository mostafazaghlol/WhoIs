package com.example.android.whois;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mostafa on 12/3/17.
 */

public class B extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.finallayout);
        Intent intent = getIntent();
        int number=intent.getIntExtra("count",0);
        TextView txRe=(TextView)findViewById(R.id.score);
        txRe.setText(String.valueOf(number));
        }
}
