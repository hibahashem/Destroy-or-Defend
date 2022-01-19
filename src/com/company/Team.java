package com.company;

import java.util.ArrayList;


public abstract class Team {

    ArrayList<Player> players=new ArrayList<>();
    ArrayList<UnitPosition> teamunitposition=new ArrayList<>();

    public boolean Acceptposition(int x,int y)
    {
        for (int i=0;i<teamunitposition.size();i++)
        {
            if (teamunitposition.get(i).Issqaure(x,y))
                return false;
        }
        return true;
    }
    public ArrayList <Unit> getunits()
    {
        ArrayList<Unit> units=new ArrayList<>();
        for (int i=0;i<this.players.size();i++)
        {
            units.addAll(this.players.get(i).getUnits());
        }
        return units;
    }
    public abstract int numofunit();
}
