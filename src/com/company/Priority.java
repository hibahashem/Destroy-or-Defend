package com.company;

import java.util.ArrayList;

public class Priority extends  Tactic {
    @Override
    public Unit DoTactic(ArrayList<Unit> Obj) {
        System.out.println(Obj);
        if(!Obj.isEmpty()){
            int h=Obj.get(0).UT.ordinal();
            Unit text=Obj.get(0);

            for(int i=0;i<Obj.size();i++)
            {
                if(Obj.get(i).UT.ordinal()<h)
                {
                    h=   Obj.get(i).UT.ordinal();
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
