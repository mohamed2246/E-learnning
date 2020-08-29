package com.example.multi_screens_exampls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class members_activity extends AppCompatActivity implements product_adapter.oncatclick {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members_activity);

        RecyclerView recyclerView =  findViewById(R.id.rere1);
        ImageView imageView = findViewById(R.id.photo);
        ArrayList <model> words = new ArrayList<>();

        model model  = new model("One","واحد" , R.drawable.one1);
        words.add(model);
        model mode2  = new model("Two", "أثنين" , R.drawable.two);
        words.add(mode2);
        model mode3  = new model("Three", "ثلاثة" ,R.drawable.three3);
        words.add(mode3);
        model mode4  = new model("Four", "أربعة",R.drawable.four);
        words.add(mode4);
        model mode5  = new model("Five","خمسة",R.drawable.five);
        words.add(mode5);
        model mode6  = new model( "Six","ستة",R.drawable.six);
        words.add(mode6);
        model mode8  = new model( "Seven","سبعة",R.drawable.seven);
        words.add(mode8);
        model mode9  = new model("Eight","تمانية",R.drawable.eight);
        words.add(mode9);
        model mode10  = new model("Nine","تسعة",R.drawable.nine);
        words.add(mode10);

        product_adapter product_adapter = new product_adapter(words ,this);
        recyclerView.setAdapter(product_adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(members_activity.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);


    }



    @Override
    public void onitemclick(int s) {
        if (s==0){
            Toast.makeText(this,"One",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.one);
            mediaPlayer.start();
        }else  if (s==1){
            Toast.makeText(this,"Two",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.two);
            mediaPlayer.start();
        }else if (s==2){
            Toast.makeText(this,"Three",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.three);
            mediaPlayer.start();

        }else if (s==3){
            Toast.makeText(this,"Four",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.four);
            mediaPlayer.start();

        }else if (s==4){
            Toast.makeText(this,"Five",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.five);
            mediaPlayer.start();

        }else if (s==5){
            Toast.makeText(this,"Six",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.six);
            mediaPlayer.start();

        }else if (s==6){
            Toast.makeText(this,"Seven",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.seven);
            mediaPlayer.start();
        }else if (s==7){
            Toast.makeText(this,"Eight",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.eight);
            mediaPlayer.start();
        }else if (s==8){
            Toast.makeText(this,"Nine",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.nine);
            mediaPlayer.start();
    }

    }
}
