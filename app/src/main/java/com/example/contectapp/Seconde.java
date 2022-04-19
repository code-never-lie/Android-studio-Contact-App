package com.example.contectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Seconde extends AppCompatActivity
{
    TextInputEditText t1,t2,t3,t4;
    ImageView i1,i2,i3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);
        t1 = findViewById(R.id.textInputEditText);
        t2 = findViewById(R.id.textInputEditText2);
        t3 = findViewById(R.id.textInputEditText3);
        t4 = findViewById(R.id.textInputEditText4);
        i1 = findViewById(R.id.imageView);
        i2 = findViewById(R.id.imageView2);
        i3 = findViewById(R.id.imageView3);
        i1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() ||
                        t3.getText().toString().isEmpty() || t4.getText().toString().isEmpty())
                {
                    Toast.makeText(Seconde.this, "fulfill all fields ", Toast.LENGTH_SHORT).show();
                } else
                    {
                    String name = t1.getText().toString().trim();
                    String contact = t2.getText().toString().trim();
                    String website = t3.getText().toString().trim();
                    String adress = t4.getText().toString().trim();
                    String a = "smile";
                    Intent intent = new Intent(Seconde.this, Third.class);
                    intent.putExtra("name", name);
                    intent.putExtra("contact", contact);
                    intent.putExtra("website", website);
                    intent.putExtra("adress", adress);
                    intent.putExtra("face", a);
                    startActivity(intent);

                }
            }

        });
        i2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() || t3.getText().toString().isEmpty() || t4.getText().toString().isEmpty()) {
                    Toast.makeText(Seconde.this, "fulfill all fields ", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                    String name = t1.getText().toString().trim();
                    String contact = t2.getText().toString().trim();
                    String website = t3.getText().toString().trim();
                    String adress = t4.getText().toString().trim();
                    String a = "normal";
                    Intent intent = new Intent(Seconde.this, Third.class);
                    intent.putExtra("name", name);
                    intent.putExtra("contact", contact);
                    intent.putExtra("website", website);
                    intent.putExtra("adress", adress);
                    intent.putExtra("face", a);
                    startActivity(intent);

                }
            }

        });
        i3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if (t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty()
                        || t3.getText().toString().isEmpty() || t4.getText().toString().isEmpty()) {
                    Toast.makeText(Seconde.this, "fulfill all fields ", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                    String name = t1.getText().toString().trim();
                    String contact = t2.getText().toString().trim(); // for finsh spece
                    String website = t3.getText().toString().trim();// for finsh spece
                    String adress = t4.getText().toString().trim();// for finsh spece
                    String a = "angry";
                    Intent intent = new Intent(Seconde.this, Third.class);
                    intent.putExtra("name", name);
                    intent.putExtra("contact", contact);
                    intent.putExtra("website", website);
                    intent.putExtra("adress", adress);
                    intent.putExtra("face", a);
                    startActivity(intent);

                }
            }

        });
    }}