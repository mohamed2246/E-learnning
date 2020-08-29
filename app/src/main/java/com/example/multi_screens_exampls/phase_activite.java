package com.example.multi_screens_exampls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class phase_activite extends AppCompatActivity implements  product_adapter.oncatclick {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phase_activite);

        RecyclerView recyclerView =  findViewById(R.id.rere1);
        ImageView imageView = findViewById(R.id.photo);
        ArrayList<model> words = new ArrayList<>();

        model model  = new model("What's your name ?","ما اسمك ؟" , R.drawable.questuin);
        words.add(model);
        model mode2  = new model("How old are you ?", "ما سنك ؟" , R.drawable.question2);
        words.add(mode2);
        model mode3  = new model("Where are you from ?", "من اين انت ؟" ,R.drawable.questuin);
        words.add(mode3);
        model mode4  = new model("When did you born ?", "متي ولدت ؟",R.drawable.question2);
        words.add(mode4);
        model mode5  = new model("How are you ?","كيف حالك ؟",R.drawable.questuin);
        words.add(mode5);
        model mode6  = new model( "What is your favorate subject ?","ما هي مادتك المفضلة ؟",R.drawable.question2);
        words.add(mode6);
        model mode8  = new model( "What is the name of your school ?","ما اسم مدرستك ؟",R.drawable.questuin);
        words.add(mode8);
        model mode9  = new model("How many friends do you have ?","كم عدد الاصدقاء لديك ؟",R.drawable.question2);
        words.add(mode9);
        model mode10  = new model("Do you need any help from me ?","هل تريد اي مساعدة مني ؟ ",R.drawable.questuin);
        words.add(mode10);

        product_adapter product_adapter = new product_adapter(words ,this);
        recyclerView.setAdapter(product_adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(phase_activite.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

    }


    @Override
    public void onitemclick(int s) {
        if (s==0){
            Toast.makeText(this,"What's your name ?",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.name);
            mediaPlayer.start();
        }else  if (s==1){
            Toast.makeText(this,"How old are you ?",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.old);
            mediaPlayer.start();
        }else if (s==2){
            Toast.makeText(this,"Where are you from ?",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.from);
            mediaPlayer.start();

        }else if (s==3){
            Toast.makeText(this,"When did you born ?",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.born);
            mediaPlayer.start();

        }else if (s==4){
            Toast.makeText(this,"How are you ?",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.are);
            mediaPlayer.start();

        }else if (s==5){
            Toast.makeText(this,"What is your favorate subject",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.fav);
            mediaPlayer.start();

        }else if (s==6){
            Toast.makeText(this,"What is the name of your school ?",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.sc);
            mediaPlayer.start();
        }else if (s==7){
            Toast.makeText(this,"How many friends do you have ?",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.fri);
            mediaPlayer.start();
        }else if (s==8){
            Toast.makeText(this,"Do you need any help from me ?",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.help);
            mediaPlayer.start();}
    }
}
