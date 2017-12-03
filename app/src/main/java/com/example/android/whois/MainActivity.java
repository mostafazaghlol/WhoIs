package com.example.android.whois;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
        ImageView imMessi=(ImageView)findViewById(R.id.MessiPicture);
        ImageView imAtia=(ImageView)findViewById(R.id.aitaPic);
        ImageView imRonaldo=(ImageView)findViewById(R.id.RonaldoPic);
        ImageView imRobben=(ImageView)findViewById(R.id.RobbenPic);
        ImageView imKross=(ImageView)findViewById(R.id.KrossPic);
        ImageView imAtia2=(ImageView)findViewById(R.id.Atia2);
        ImageView imSalah=(ImageView)findViewById(R.id.salahPic);
        ImageView imhenderson=(ImageView)findViewById(R.id.hendersonPic);
        ImageView imbale=(ImageView)findViewById(R.id.BalePic);
        ImageView imkaka=(ImageView)findViewById(R.id.kakaPic);
        ImageView imNeymar=(ImageView)findViewById(R.id.NeymarPic);
        ImageView imdani=(ImageView)findViewById(R.id.daniPic);
        final LinearLayout LmMessi=(LinearLayout)findViewById(R.id.MessiLayout);
        final LinearLayout LmRonaldo=(LinearLayout)findViewById(R.id.RonaldoLinearlayout);
        final LinearLayout LmKross=(LinearLayout)findViewById(R.id.KrossLinearlayout);
        final LinearLayout Lmsalah=(LinearLayout)findViewById(R.id.salahLinearlayout);
        final LinearLayout Lmbale=(LinearLayout)findViewById(R.id.BaleLinearLayout);
        final LinearLayout LmNeymar=(LinearLayout)findViewById(R.id.NeymarLinearlayout);

        Button result=(Button)findViewById(R.id.resultbt);



        setTrue(imMessi,LmMessi);
        setFalse(imAtia,LmMessi);
        setTrue(imRonaldo,LmRonaldo);
        setFalse(imRobben,LmRonaldo);
        setTrue(imKross,LmKross);
        setFalse(imAtia2,LmKross);
        setTrue(imSalah,Lmsalah);
        setFalse(imhenderson,Lmsalah);
        setTrue(imbale,Lmbale);
        setFalse(imkaka,Lmbale);
        setTrue(imNeymar,LmNeymar);
        setFalse(imdani,LmNeymar);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,B.class);
                i1.putExtra("count",count);
                startActivity(i1);
            }
        });




    }

    public void setTrue(ImageView im, final LinearLayout lm){
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                lm.setVisibility(View.GONE);
               // Toast.makeText(MainActivity.this, "Count "+count, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void setFalse(ImageView im, final LinearLayout lm){
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                lm.setVisibility(View.GONE);

            }
        });

    }



    public void Result(View view) {
        Toast.makeText(this, "Your Result is : "+String.valueOf(count), Toast.LENGTH_LONG).show();
        count=0;

    }


}
