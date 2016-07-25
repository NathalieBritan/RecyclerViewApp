package com.nathaliebritan.recycleviewapp.Item;

import com.nathaliebritan.recycleviewapp.Item.BaseItem;

/**
 * Created by Nathalie Britan on 22.07.2016.
 */
public class ImageItem extends BaseItem {
    private int bitmapId;

    public ImageItem(String time, int bitmapId) {
        super(time);
        this.bitmapId = bitmapId;
    }

    public int getImage(){
        return bitmapId;
    }
}
