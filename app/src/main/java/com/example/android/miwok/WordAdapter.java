package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jose on 5/23/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {



    public WordAdapter(Context context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;

        if(listItem == null){
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTV = (TextView) listItem.findViewById(R.id.miwok_text_view);
        miwokTV.setText(currentWord.getMiwokTranslation());


        TextView englishTV = (TextView) listItem.findViewById(R.id.default_text_view);
        englishTV.setText(currentWord.getDefaultTranslation());

        ImageView icon = (ImageView) listItem.findViewById(R.id.icon);
        icon.setImageResource(currentWord.getResourceid());

        return listItem;
    }


}
