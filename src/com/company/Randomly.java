package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Randomly extends  Tactic{
    @Override
    public Unit DoTactic(ArrayList<Unit> Obj) {

            Random rand=new Random();
         int i= Obj.indexOf(Obj.get(rand.nextInt(Obj.size())));
            return Obj.get(i);



    }
}
