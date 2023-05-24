package com.example.prilogenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThemActivity extends AppCompatActivity {

    //кнопки перехода на запись тренировки
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_them);

        final Button Button = (Button) findViewById(R.id.button);
        Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent activityChangeIntent = new Intent(ThemActivity.this, FifthActivity.class);


                ThemActivity.this.startActivity(activityChangeIntent);
            }
        });
        Button button = (Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, FifthActivity.class));
            }
        });
        Button btn = (Button)findViewById(R.id.button9);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, FifthActivity.class));
            }
        });
        Button button4 = (Button)findViewById(R.id.button10);

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, FifthActivity.class));
            }
        });
        Button button3 = (Button)findViewById(R.id.button11);

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, FifthActivity.class));
            }
        });
        Button button2 = (Button)findViewById(R.id.button12);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, FifthActivity.class));
            }
        });
        Button button1 = (Button)findViewById(R.id.button13);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, FifthActivity.class));
            }
        });


        //СОЗДАТЬ НОВУЮ АКТИВНОСТЬ

        //кнопки перехода на редактирование тренировки

        Button button14 = (Button)findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, SixthActivity.class));
            }
        });
        Button button15 = (Button)findViewById(R.id.button15);

        button15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, SixthActivity.class));
            }
        });
        Button button16 = (Button)findViewById(R.id.button16);

        button16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, SixthActivity.class));
            }
        });
        Button button17 = (Button)findViewById(R.id.button17);

        button17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, SixthActivity.class));
            }
        });
        Button button18 = (Button)findViewById(R.id.button18);

        button18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, SixthActivity.class));
            }
        });
        Button button19 = (Button)findViewById(R.id.button19);

        button19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, SixthActivity.class));
            }
        });
        Button button20 = (Button)findViewById(R.id.button20);

        button20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(ThemActivity.this, SixthActivity.class));
            }
        });

    }
}