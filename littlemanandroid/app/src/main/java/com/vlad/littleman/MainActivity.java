package com.vlad.littleman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button nes = findViewById(R.id.button);

        nes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_nes();
            }
        });
    }

        public void openactivity_nes(){
            Intent intent = new Intent(this, activity_NES.class);
            startActivity(intent);
    }

}
