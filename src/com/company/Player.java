package com.company;

import java.util.ArrayList;

public  class  Player {
    public  ArrayList<Unit> units=new ArrayList<>();
    public  int points;
    public  int team_id;
    public  int player_id;
    public  Player(int points,int team_id,int player_id)
    {
        this.team_id=team_id;
        this.points=points;
        this.player_id=player_id;
    }

    public int getPoints() {
        return points;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }
    public  Unit  buyunit(int index ) {
        UnitStore unitStore=new UnitStore();
        Unit unit;
        if(this.team_id==1)
        {
            unit= unitStore.BuyAttaker(index);
            if(this.points>=unit.unitprice )
            {
                return unit;
            }

        }
        if(this.team_id==2)
        {
            unit= unitStore.BuyDefender(index);
            if(this.points>=unit.unitprice)
            {
                return unit;
            }

        }
        return null;
    }
}
