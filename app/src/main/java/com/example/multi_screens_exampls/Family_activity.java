package com.example.multi_screens_exampls;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Family_activity extends AppCompatActivity implements product_adapter.oncatclick{



    model model;
    MediaPlayer mediaPlayer;
    ArrayList<model> words = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_activity);


       RecyclerView recyclerView=  findViewById(R.id.recycly);



        model  = new model("Father","أب" , R.drawable.father);
        words.add(model);


        model mode2  = new model("Mother", "أم" , R.drawable.mother);
        words.add(mode2);
        model mode3  = new model("G_Father", "جد" ,R.drawable.fooo);
        words.add(mode3);
        model mode4  = new model("G_Mother", "جدة",R.drawable.mooo);
        words.add(mode4);
        model mode5  = new model("Uncle","خال",R.drawable.auncle);
        words.add(mode5);
        model mode6  = new model( "aunt","خالة",R.drawable.aunt2);
        words.add(mode6);
        model mode8  = new model( "uncle","عم ",R.drawable.uncle2);
        words.add(mode8);
        model modem  = new model( "aunt","عمة ",R.drawable.unnt2);
        words.add(modem);
        model mode9  = new model("Brother","أخ",R.drawable.brotheri);
        words.add(mode9);
        model mode10  = new model("Sister","أخت",R.drawable.sisteri);
        words.add(mode10);


        product_adapter product_adapter = new product_adapter(words,this);
        recyclerView.setAdapter(product_adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Family_activity.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        release();
    }

    private void release() {

        if (mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer=null;

        }
    }


    @Override
    public void onitemclick(int s) {
        if (s==0){
            Toast.makeText(this,"Father",Toast.LENGTH_SHORT).show();
             mediaPlayer = MediaPlayer.create(this,R.raw.father);
            mediaPlayer.start();
        }else  if (s==1){
            Toast.makeText(this,"Mother",Toast.LENGTH_SHORT).show();
             mediaPlayer = MediaPlayer.create(this,R.raw.mother);
            mediaPlayer.start();
        }else if (s==2){
            Toast.makeText(this,"Grand_Father",Toast.LENGTH_SHORT).show();
             mediaPlayer = MediaPlayer.create(this,R.raw.grandfather);
            mediaPlayer.start();

        }else if (s==3){
            Toast.makeText(this,"Grand_Mother",Toast.LENGTH_SHORT).show();
             mediaPlayer = MediaPlayer.create(this,R.raw.grandmother);
            mediaPlayer.start();

        }else if (s==4){
            Toast.makeText(this,"Uncle",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.uncle);
            mediaPlayer.start();

        }else if (s==5||s==7){
            Toast.makeText(this,"Aunt",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.aunt);
            mediaPlayer.start();

        }else if (s==6){
            Toast.makeText(this,"Uncle",Toast.LENGTH_SHORT).show();
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.uncle);
            mediaPlayer.start();
        }else if (s==8){
            Toast.makeText(this,"Brother",Toast.LENGTH_SHORT).show();
             mediaPlayer = MediaPlayer.create(this,R.raw.brother);
            mediaPlayer.start();
        }else if (s==9) {
            Toast.makeText(this, "Sister", Toast.LENGTH_SHORT).show();
             mediaPlayer = MediaPlayer.create(this, R.raw.sister);
            mediaPlayer.start();
        }

    }


}

