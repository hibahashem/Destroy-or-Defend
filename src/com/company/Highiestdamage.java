package com.company;

import java.util.ArrayList;

public class Highiestdamage  extends  Tactic{
    @Override
    public Unit DoTactic(ArrayList<Unit> Obj) {
        if(!Obj.isEmpty()){
            int h=Obj.get(0).damage;
            Unit text=Obj.get(0);
            for(int i=0;i<Obj.size();i++)
            {
                if(Obj.get(i).damage>=h) {
                    h = Obj.get(i).damage;
                    text = Obj.get(i);
                }

            }
            return text;
        }
        else {
            return null;
        }
    }
}
