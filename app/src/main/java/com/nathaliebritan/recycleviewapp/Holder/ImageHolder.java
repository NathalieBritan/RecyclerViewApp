package com.nathaliebritan.recycleviewapp.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nathaliebritan.recycleviewapp.R;

import org.w3c.dom.Text;

public class ImageHolder extends RecyclerView.ViewHolder
{
    private ImageView img;
    private TextView time;

    public ImageHolder(View item) {

        super(item);
        img = (ImageView)item.findViewById(R.id.img_item);
        time = (TextView) item.findViewById(R.id.txt_time);
    }

    public void setImage(int resId){
        img.setImageResource(resId);
    }

    public void setTime(String timeValue){
        time.setText(timeValue);
    }
}
