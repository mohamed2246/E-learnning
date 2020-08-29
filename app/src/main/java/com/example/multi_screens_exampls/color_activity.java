package com.example.multi_screens_exampls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class color_activity extends AppCompatActivity implements product_adapter.oncatclick {
ArrayList<model> words = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_activity);

        RecyclerView recyclerView=  findViewById(R.id.rere);
        ImageView imageView = findViewById(R.id.photo);


        model model  = new model("Red","أحمر" , R.drawable.red);
        words.add(model);
        model mode2  = new model("Blue", "أزرق" , R.drawable.blue);
        words.add(mode2);
        model mode3  = new model("Green", "أخضر" ,R.drawable.green);
        words.add(mode3);
        model mode4  = new model("Yellow", "أصفر",R.drawable.yellow);
        words.add(mode4);
            model mode5  = new model("Black","أسود",R.drawable.black);
        words.add(mode5);
        model mode6  = new model( "Purple","بنفسجي",R.drawable.ber);
        words.add(mode6);
        model mode8  = new model( "Gold","دهبي",R.drawable.orange);
        words.add(mode8);
        model mode9  = new model("white","ابيض",R.drawable.white);
        words.add(mode9);

        product_adapter product_adapter = new product_adapter(words,this);
        recyclerView.setAdapter(product_adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(color_activity.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);





    }



    @Override
    public void onitemclick(int s) {
        if (s==0){
            Toast.makeText(this,"Red",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.red);
            mediaPlayer.start();
        }else  if (s==1){
            Toast.makeText(this,"Blue",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.blue);
            mediaPlayer.start();
        }else if (s==2){
            Toast.makeText(this,"Grean",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.green);
            mediaPlayer.start();

        }else if (s==3){
            Toast.makeText(this,"Yellow",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.yellow);
            mediaPlayer.start();

        }else if (s==4){
                Toast.makeText(this,"Black",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.black);
            mediaPlayer.start();

        }else if (s==5){
            Toast.makeText(this,"Purple",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.purble);
            mediaPlayer.start();

        }else if (s==6){
            Toast.makeText(this,"Gold",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.gold);
            mediaPlayer.start();
        }else if (s==7){
            Toast.makeText(this,"White",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.white);
            mediaPlayer.start();
        }
    }
}
