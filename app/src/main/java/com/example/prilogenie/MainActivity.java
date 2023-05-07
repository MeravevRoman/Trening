package com.example.prilogenie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton$InspectionCompanion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButton15;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        final ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton15);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent activityChangeIntent = new Intent(MainActivity.this, SecondActivity.class);


                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton4);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, ThirdActivity.class));

            }
        });
        ImageButton button = (ImageButton)findViewById(R.id.imageButton5);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, FourActivity.class));
            }
        });
    }
}
