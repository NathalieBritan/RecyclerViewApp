package com.nathaliebritan.recycleviewapp.Item;

/**
 * Created by Nathalie Britan on 22.07.2016.
 */
public abstract class BaseItem {
    private String timeCreated;

    public BaseItem (String time){
        this.timeCreated = time;
    }

    public String getTime(){
        return timeCreated;
    }
}
