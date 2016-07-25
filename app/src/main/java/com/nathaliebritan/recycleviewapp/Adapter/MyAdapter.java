package com.nathaliebritan.recycleviewapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nathaliebritan.recycleviewapp.Holder.ImageHolder;
import com.nathaliebritan.recycleviewapp.Holder.TextHolder;
import com.nathaliebritan.recycleviewapp.Item.BaseItem;
import com.nathaliebritan.recycleviewapp.Item.ImageItem;
import com.nathaliebritan.recycleviewapp.Item.TextItem;
import com.nathaliebritan.recycleviewapp.R;

import java.util.ArrayList;

/**
 * Created by Nathalie Britan on 22.07.2016.
 */
public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private static int IMAGE_ITEM = 0;
    private static int TEXT_ITEM = 1;

    private ArrayList <BaseItem> mDataset;

    public MyAdapter(ArrayList<BaseItem> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public int getItemViewType(int position)
    {
        if (mDataset.get(position) instanceof ImageItem)
        {
            return IMAGE_ITEM;
        }
        else
        {
            return TEXT_ITEM;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        RecyclerView.ViewHolder vh = null;
        View itemLayoutView;

        switch (viewType)
        {
            case 0:
                itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_holder, parent, false);
                vh = new ImageHolder(itemLayoutView);
                break;
            case 1:
                itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_holder, parent, false);
                vh = new TextHolder(itemLayoutView);
                break;
        }
        return vh;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position)
    {
        switch (this.getItemViewType(position))
        {
            case 0:
                ImageHolder imgHolder = (ImageHolder) holder;
                ImageItem imgItem = (ImageItem) mDataset.get(position);
                imgHolder.setImage(imgItem.getImage());
                imgHolder.setTime(imgItem.getTime());
                break;
            case 1:
                TextHolder txtHolder = (TextHolder) holder;
                TextItem txtItem = (TextItem) mDataset.get(position);
                txtHolder.setText(txtItem.getText());
                txtHolder.setTime(txtItem.getTime());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}