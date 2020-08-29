package com.example.multi_screens_exampls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView family;
    TextView member;
    TextView color;
    TextView phase , textm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intial();

    }

    public void intial() {
        family = findViewById(R.id.family);
        member = findViewById(R.id.members);
        color = findViewById(R.id.colors);
        phase = findViewById(R.id.phases);
        family.setOnClickListener(this);
        phase.setOnClickListener(this);
        color.setOnClickListener(this);
        member.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.family:
                Intent intent = new Intent(MainActivity.this , Family_activity.class);
                intent.putExtra("name","mohamed");
                startActivity(intent);
                break;

            case R.id.members:
                Intent intent1 = new Intent(MainActivity.this , members_activity.class);
                startActivity(intent1);
                break;

            case R.id.phases:
                Intent intent2= new Intent(MainActivity.this , phase_activite.class);
                startActivity(intent2);
                break;

            case R.id.colors:
                Intent intent3 = new Intent(MainActivity.this , color_activity.class);
                startActivity(intent3);
                break;
        }


    }
}
