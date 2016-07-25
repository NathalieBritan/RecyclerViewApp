package com.nathaliebritan.recycleviewapp.Item;

import com.nathaliebritan.recycleviewapp.Item.BaseItem;

/**
 * Created by Nathalie Britan on 22.07.2016.
 */
public class TextItem extends BaseItem {
    private int textId;

    public TextItem(String time, int textId){
        super(time);
        this.textId = textId;
    }

    public int getText(){
        return textId;
    }
}
