package com.example.contectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Third extends AppCompatActivity
{
    String Face,Contact,Website,location;
    ImageView a,b,c,d;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        a=findViewById(R.id.imageView4);
        b=findViewById(R.id.imageView5);
        c=findViewById(R.id.imageView6);
        d=findViewById(R.id.imageView7);
        btn=findViewById(R.id.btn2);
        Bundle bundle=getIntent().getExtras();
        Face=bundle.getString("face");
        Contact=bundle.getString("contact");
        Website=bundle.getString("website");
        location=bundle.getString("adress");

        if(Face.contentEquals("normal"))
        {
            a.setImageResource(R.drawable.ic_sentiment_neutral_black_24dp);
        }
        if(Face.contentEquals("smile"))
        {
            b.setImageResource(R.drawable.ic_sentiment_satisfied_black_24dp);
        }
        if(Face.contentEquals("angry"))
        {
            c.setImageResource(R.drawable.ic_sentiment_dissatisfied_black_24dp);
        }
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+Contact));
                startActivity(intent);

            }
        });
        c.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+Website));
                startActivity(intent);

            }
        });
        d.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+location));
                startActivity(intent);

            }
        });
        a.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent =new Intent(Third.this,Seconde.class);
                startActivity(intent);
            }
        });
    }
}
