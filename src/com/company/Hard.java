package com.company;

import java.util.ArrayList;

public class Hard {

    ArrayList<Unit> obstacles=new ArrayList();
    public Hard()
    {
        this.creatobs();
    }
    public void creatobs()
    {
        Unit newobs;
        UnitStore store = new UnitStore();
        //
        newobs=store.Structure(0);
        newobs.setxy(550,2650);
        this.obstacles.add(newobs);
        //
        newobs=store.Structure(1);
        newobs.setxy(1000,70);
        this.obstacles.add(newobs);
        //
        newobs=store.Structure(2);
        newobs.setxy(121,200);
        this.obstacles.add(newobs);


    }

    public ArrayList<Unit> getObstacles() {
        return obstacles;
    }
}


