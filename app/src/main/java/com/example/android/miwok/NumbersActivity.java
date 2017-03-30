package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Words> words=new ArrayList<Words>();
        //words.add("one");

        words.add(new Words("one","lutti",R.drawable.number_one,R.raw.number_one));
        words.add(new Words("two","otiiko",R.drawable.number_two,R.raw.number_two));
        words.add(new Words("three","tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add(new Words("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new Words("five","massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new Words("six","temmokka",R.drawable.number_six,R.raw.number_six));
        words.add(new Words("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Words("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Words("nine","wo'e",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Words("ten","na'aacha",R.drawable.number_ten,R.raw.number_ten));
        //LinearLayout rootView=(LinearLayout) findViewById(R.id.rootView);

        /*for(int index=0;index<words.size();index++){
            TextView wordView=new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);*/
        final WordAdapter adapter= new WordAdapter(this,words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Words word=words.get(i);
                Toast.makeText(NumbersActivity.this,"Hello  "+word+"  World",Toast.LENGTH_SHORT).show();
                media=MediaPlayer.create(NumbersActivity.this,word.getAudioResourceId());
                media.start();
            }
        });

        }

    }

