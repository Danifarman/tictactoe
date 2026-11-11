package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Switch mySwitch;
    ToggleButton myToggle;

    LinearLayout root;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySwitch = findViewById(R.id.mySwitch);
        myToggle = findViewById(R.id.myToggle);
        root = findViewById(R.id.root);


        // --- 1. Switch Logic ---
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // isChecked = true (agar ON hai)
                // isChecked = false (agar OFF hai)

                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Wi-Fi ON", Toast.LENGTH_SHORT).show();
                    root.setBackgroundColor(getResources().getColor(R.color.yellow));
                } else {
                    Toast.makeText(MainActivity.this, "Wi-Fi OFF", Toast.LENGTH_SHORT).show();
                    root.setBackgroundColor(getResources().getColor(R.color.white));
                }
            }
        });

        // --- 2. Toggle Button Logic (Bilkul Same) ---
        myToggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // Agar ON hai
                Toast.makeText(MainActivity.this, "Sound Enabled", Toast.LENGTH_SHORT).show();
            } else {
                // Agar OFF hai
                Toast.makeText(MainActivity.this, "Sound Muted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}