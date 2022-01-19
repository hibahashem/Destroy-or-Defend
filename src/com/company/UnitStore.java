package com.company;


import java.util.ArrayList;


public class UnitStore {
    ArrayList<Unit> AttakerUnit = new ArrayList<Unit>();
    ArrayList<Unit> DefenderUnit = new ArrayList<Unit>();
    ArrayList<Unit> StructureUnit = new ArrayList<Unit>();

    public UnitStore() {
        Grid g = Grid.getObj();
        ArrayList<UnitType> sold = new ArrayList<UnitType>();
        sold.add(UnitType.Tanks);
        sold.add(UnitType.Soldiers);
        ArrayList<UnitType> teslatank = new ArrayList<UnitType>();
        teslatank.add(UnitType.Tanks);
        teslatank.add(UnitType.Soldiers);

        ArrayList<UnitType> sniper = new ArrayList<UnitType>();
        sniper.add(UnitType.Soldiers);
        ArrayList<UnitType> miragetank = new ArrayList<UnitType>();
        miragetank.add(UnitType.Tanks);
        miragetank.add(UnitType.Soldiers);
        miragetank.add(UnitType.Structure);
        ArrayList<UnitType> infin = new ArrayList<UnitType>();
        infin.add(UnitType.Soldiers);
        ArrayList<UnitType> grizzlytank = new ArrayList<UnitType>();
        grizzlytank.add(UnitType.Tanks);
        grizzlytank.add(UnitType.Soldiers);
        grizzlytank.add(UnitType.Structure);

        ArrayList<UnitType> navyseal = new ArrayList<UnitType>();
        navyseal.add(UnitType.Tanks);
        navyseal.add(UnitType.Soldiers);
        ArrayList<UnitType> tandestroy = new ArrayList<UnitType>();
        tandestroy.add(UnitType.Tanks);
        ArrayList<UnitType> prismtank = new ArrayList<UnitType>();
        prismtank.add(UnitType.Tanks);
        prismtank.add(UnitType.Soldiers);
        prismtank.add(UnitType.Structure);
        ArrayList<UnitType> pillbox = new ArrayList<UnitType>();
        pillbox.add(UnitType.Soldiers);
        ArrayList<UnitType> prismtower = new ArrayList<UnitType>();
        prismtower.add(UnitType.Tanks);
        prismtower.add(UnitType.Soldiers);
        ArrayList<UnitType> grandcannon = new ArrayList<UnitType>();
        grandcannon.add(UnitType.Tanks);
        grandcannon.add(UnitType.Soldiers);
        ArrayList<UnitType> blackeagle = new ArrayList<UnitType>();
        blackeagle.add(null);
        ArrayList<UnitType> airforce = new ArrayList<UnitType>();
        airforce.add(UnitType.Airplane);
        ArrayList<UnitType> pms = new ArrayList<UnitType>();
        pms.add(UnitType.Airplane);


        Unit soliderinfin = new Unit(g, 50, (float) 0.2, 250, 10, (float) 1.5, 20, 3, 50, UnitType.Soldiers, unitname.infantry, infin, AttackDefender.Attacker, new Highiestdamage(), new AttackerMovement());
        Unit solidersnip = new Unit(g, 75, (float) 0.1, 250, 10, (float) 0.4, 5, 3, 700, UnitType.Soldiers, unitname.sniper, sniper, AttackDefender.Attacker, new Highiestdamage(), new AttackerMovement());
        Unit solidernafy = new Unit(g, 60, (float) 0.2, 400, 20, (float) 2, 10, 3, 50, UnitType.Soldiers, unitname.navyseal, navyseal, AttackDefender.Attacker, new Highiestdamage(), new AttackerMovement());
        Unit tanktsla = new Unit(g, 300, (float) 0.5, 1000, 30, (float) 0.6, 50, 20, 250, UnitType.Tanks, unitname.teslaTank, teslatank, AttackDefender.Attacker, new Highiestdamage(), new AttackerMovement());
        Unit tankemerge = new Unit(g, 1000, (float) 0.1, 750, 60, (float) 1, 70, 15, 15, UnitType.Tanks, unitname.miragetank, miragetank, AttackDefender.Attacker, new Highiestdamage(), new AttackerMovement());
        Unit tankdesrtoy = new Unit(g, 400, (float) 0.5, 1000, 20, (float) 0.6, 50, 20, 150, UnitType.Tanks, unitname.tankdestroy, tandestroy, AttackDefender.Attacker, new Highiestdamage(), new AttackerMovement());
        Unit tankeprism = new Unit(g, 300, (float) 0.35, 1000, 20, (float) 0.6, 60, 20, 150, UnitType.Tanks, unitname.prismtank, prismtank, AttackDefender.Attacker, new Highiestdamage(), new AttackerMovement());
        Unit tankegizzly = new Unit(g, 250, (float) 0.4, 1000, 30, (float) 0.6, 50, 20, 250, UnitType.Tanks, unitname.grizzlytank, grizzlytank, AttackDefender.Attacker, new Highiestdamage(), new AttackerMovement());
        Unit airplaneblack = new Unit(g, 400, (float) 0.0, 1500, 100, (float) 0.5, 75, 2, 30, UnitType.Airplane, unitname.blackeagle, blackeagle, AttackDefender.Attacker, new Highiestdamage(), new AirforceMovment());
        AttakerUnit.add(soliderinfin);
        AttakerUnit.add(solidersnip);
        AttakerUnit.add(solidernafy);
        AttakerUnit.add(tanktsla);
        AttakerUnit.add(tankemerge);
        AttakerUnit.add(tankdesrtoy);
        AttakerUnit.add(tankeprism);
        AttakerUnit.add(tankegizzly);
        AttakerUnit.add(airplaneblack);




        Unit dsoliderinfin = new Unit(g, 50, (float) 0.2, 250, 10, (float) 1.5, 20, 3, 50, UnitType.Soldiers, unitname.infantry, infin, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit dsolidersnip = new Unit(g, 75, (float) 0.1, 250, 10, (float) 0.4, 5, 3, 700, UnitType.Soldiers, unitname.sniper, sniper, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit dsolidernafy = new Unit(g, 60, (float) 0.2, 400, 20, (float) 2, 10, 3, 50, UnitType.Soldiers, unitname.navyseal, navyseal, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit dtanktsla = new Unit(g, 300, (float) 0.5, 1000, 30, (float) 0.6, 50, 20, 250, UnitType.Tanks, unitname.teslaTank, teslatank, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit dtankemerge = new Unit(g, 1000, (float) 0.1, 750, 60, (float) 1, 70, 15, 15, UnitType.Tanks, unitname.miragetank, miragetank, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit dtankdesrtoy = new Unit(g, 400, (float) 0.5, 1000, 20, (float) 0.6, 50, 20, 150, UnitType.Tanks, unitname.tankdestroy, tandestroy, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit dtankeprism = new Unit(g, 300, (float) 0.35, 1000, 20, (float) 0.6, 60, 20, 150, UnitType.Tanks, unitname.prismtank, prismtank, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit dtankegizzly = new Unit(g, 250, (float) 0.4, 1000, 30, (float) 0.6, 50, 20, 250, UnitType.Tanks, unitname.grizzlytank, grizzlytank, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit airdefuce = new Unit(g, 400, (float) 0.0, 1500, 100, (float) 0.5, 75, 15, 30, UnitType.Airplane, unitname.airdefuce, airforce, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit pilbox = new Unit(g, 100, (float) 0.7, 4000, 0, (float) 0.7, 150, 40, 200, UnitType.Structure, unitname.pillbox, pillbox, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit prsmtower = new Unit(g, 100, (float) 0.7, 4000, 0, (float) 0.5, 150, 30, 200, UnitType.Structure, unitname.prismtower, prismtower, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit grandcanon = new Unit(g, 150, (float) 0.3, 6500, 0, (float) 0.9, 200, 40, 400, UnitType.Structure, unitname.gradcannon, grandcannon, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit pmss = new Unit(g, 50, (float) 0.2, 2500, 0, (float) 0.9, 175, 40, 400, UnitType.Structure, unitname.patriotmissilesystem, pms, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        DefenderUnit.add(dsoliderinfin);
        DefenderUnit.add(dsolidersnip);
        DefenderUnit.add(dsolidernafy);
        DefenderUnit.add(dtanktsla);
        DefenderUnit.add(dtankemerge);
        DefenderUnit.add(dtankdesrtoy);
        DefenderUnit.add(dtankeprism);
        DefenderUnit.add(dtankegizzly);
        DefenderUnit.add(airdefuce);
        DefenderUnit.add(pilbox);
        DefenderUnit.add(prsmtower);
        DefenderUnit.add(grandcanon);
        DefenderUnit.add(pmss);

        Unit bridge = new Unit(g, 0, (float) 0, 500, 0, (float) 0, 0, 5, 0, UnitType.Structure, unitname.bridge, null, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit river = new Unit(g, 0, (float) 0, 0, 0, (float) 0, 0,10, 0, UnitType.River, unitname.River_r, null, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        Unit vale = new Unit(g, 0, (float) 0, 0, 0, (float) 0, 0, 5, 0, UnitType.Vale, unitname.Valy_v, null, AttackDefender.defender, new Highiestdamage(), new DefenderMovement());
        StructureUnit.add(bridge);
        StructureUnit.add(river);
        StructureUnit.add(vale);
    }
    public Unit BuyAttaker(int index){
        return AttakerUnit.get(index);

    }
    public Unit BuyDefender(int index){
        return DefenderUnit.get(index);
    }
    public Unit Structure(int index){
        return StructureUnit.get(index);
    }


}