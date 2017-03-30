package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        final ArrayList<Words> words=new ArrayList<Words>();
        //words.add("one");

        words.add(new Words("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        words.add(new Words("What is your name?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        words.add(new Words("My name is..","oyaaset...",R.raw.phrase_my_name_is));
        words.add(new Words("How are you feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        words.add(new Words("I'm feeling good","kuchi achit",R.raw.phrase_im_feeling_good));
        words.add(new Words("Are you coming?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        words.add(new Words("Yes, I am coming","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        words.add(new Words("I'm coming","әәnәm",R.raw.phrase_im_coming));
        words.add(new Words("Let's go","yoowutis",R.raw.phrase_lets_go));
        words.add(new Words("Come here","әnni'nem",R.raw.phrase_come_here));
        //LinearLayout rootView=(LinearLayout) findViewById(R.id.rootView);

        /*for(int index=0;index<words.size();index++){
            TextView wordView=new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);*/
        WordAdapter adapter= new WordAdapter(this,words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Words word=words.get(i);
                Toast.makeText(PhrasesActivity.this,"Hello  "+word+"  World",Toast.LENGTH_SHORT).show();
                media= MediaPlayer.create(PhrasesActivity.this,word.getAudioResourceId());
                media.start();
            }
        });
    }
}
