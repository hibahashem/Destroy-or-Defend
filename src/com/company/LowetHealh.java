package com.company;

import java.util.ArrayList;

public class LowetHealh extends  Tactic{

    @Override
    public Unit DoTactic(ArrayList<Unit> Obj) {
        int h = Obj.get(0).health;
        Unit text = Obj.get(0);
        if (!Obj.isEmpty()) {
            for (int i = 0; i < Obj.size(); i++) {
                if (Obj.get(i).health <= h) {
                    h = Obj.get(i).health;
                    text = Obj.get(i);
                }

            }
            return text;
        } else {
            return null;
        }
    }
}
