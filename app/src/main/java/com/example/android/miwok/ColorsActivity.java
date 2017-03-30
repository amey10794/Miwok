package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        final ArrayList<Words> words=new ArrayList<Words>();
        //words.add("one");

        words.add(new Words("red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        words.add(new Words("green","chokokki",R.drawable.color_green,R.raw.color_green));
        words.add(new Words("brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Words("gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Words("black","kululli",R.drawable.color_black,R.raw.color_black));
        words.add(new Words("white","kelelli",R.drawable.color_white,R.raw.color_white));
        words.add(new Words("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Words("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        //LinearLayout rootView=(LinearLayout) findViewById(R.id.rootView);

        /*for(int index=0;index<words.size();index++){
            TextView wordView=new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);*/
        WordAdapter adapter= new WordAdapter(this,words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Words word=words.get(i);
                Toast.makeText(ColorsActivity.this,"Hello  "+word+"  World",Toast.LENGTH_SHORT).show();
                media= MediaPlayer.create(ColorsActivity.this,word.getAudioResourceId());
                media.start();
            }
        });
    }
}
