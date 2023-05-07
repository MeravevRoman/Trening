package com.example.prilogenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ThirdActivity extends AppCompatActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_third);

        final Button Button = (Button) findViewById(R.id.button18);
        Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent activityChangeIntent = new Intent(ThirdActivity.this, FifthActivity.class);


                ThirdActivity.this.startActivity(activityChangeIntent);
            }
        });
        Button button = (Button)findViewById(R.id.button9);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThirdActivity.this, FifthActivity.class));
            }
        });
        Button btn = (Button)findViewById(R.id.button10);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThirdActivity.this, FifthActivity.class));
            }
        });
        Button button4 = (Button)findViewById(R.id.button11);

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThirdActivity.this, FifthActivity.class));
            }
        });
        Button button3 = (Button)findViewById(R.id.button12);

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThirdActivity.this, FifthActivity.class));
            }
        });
        Button button2 = (Button)findViewById(R.id.button13);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThirdActivity.this, FifthActivity.class));
            }
        });
        Button button1 = (Button)findViewById(R.id.button26);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThirdActivity.this, FifthActivity.class));
            }
        });
    }
}