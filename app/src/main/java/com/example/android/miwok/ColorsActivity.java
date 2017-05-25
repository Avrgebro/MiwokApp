package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red", "Weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("Green", "Chokokki", R.drawable.color_green));
        words.add(new Word("Brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new Word("Gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new Word("Black", "Kululli", R.drawable.color_black));
        words.add(new Word("White", "Kelelli", R.drawable.color_white));
        words.add(new Word("Dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("Mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        WordAdapter wordAdptr = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.colors_list);
        listView.setAdapter(wordAdptr);
    }
}
