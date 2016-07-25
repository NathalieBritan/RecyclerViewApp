package com.nathaliebritan.recycleviewapp.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.nathaliebritan.recycleviewapp.R;

public class TextHolder extends RecyclerView.ViewHolder
{
    private TextView txt;
    private TextView time;

    public TextHolder(View item) {

        super(item);
        txt = (TextView) item.findViewById(R.id.txt_item);
        time = (TextView) item.findViewById(R.id.txt_time);
    }

    public void setText(int resId){
        txt.setText(resId);
    }

    public void setTime(String timeValue){
        time.setText(timeValue);
    }
}
