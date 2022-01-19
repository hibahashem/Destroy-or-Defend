package com.company;

import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Unit extends Thread implements Itactic ,IMOVMENT{
    private final static Logger logunit=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public int damage;
    public float armour;
    public int health;
    public float attackspeed;
    public int speed;
    public int unitprice;
    public int size;
    public int range;
    public UnitPosition position=new UnitPosition();
    public UnitType UT;
    public ArrayList<UnitType> target;
    public AttackDefender AD;
    public LiveDead LD=LiveDead.IsLive;
    public unitname un;
    public Grid g;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public MOVMENT m;
    public Tactic t;
    Base base;
    FileHandler fh;


    public Base getBase() {
        return base;
    }

    public  Unit()
    {}
    @Override
    public  Itactic Accepttactic(Tactic obj)

    {
        return  null;
    }

    @Override
    public IMOVMENT AcceptMOVMENT(MOVMENT obj) {
        return null;
    }
    public void setxy(int x,int y)
    {
        this.position.x=x;
        this.position.y=y;
    }

    public Unit(Grid grid,int damage,float armour,int health,int speed,float attackspeed,int unitprice ,int radius,int range
            ,UnitType UT,unitname un,ArrayList <UnitType> target,AttackDefender AD,Tactic objT,MOVMENT objM)
    {
        this.damage=damage;
        this.armour=armour;
        this.health=health;
        this.speed=speed;
        this.attackspeed=attackspeed;
        this.unitprice=unitprice;
        this.position.radius=radius;
        this.range=range;
        this.size=radius*2;
        this.target=target;
        this.un=un;
        this.UT=UT;
        this.AD=AD;
        this.AcceptMOVMENT(objM);
        this.Accepttactic(objT);
        this.g=grid;
        m=objM;
        t=objT;
        this.base=Base.getObj();
    }

    public UnitPosition getPosition() {
        return position;
    }

    public void setPosition(UnitPosition position) {
        this.position = position;
    }

    public LiveDead getLD() {
        return LD;
    }

    public void setLD(LiveDead LD) {
        this.LD = LD;
    }

    public AttackDefender getAD() {
        return AD;
    }

    public void setAD(AttackDefender AD) {
        this.AD = AD;
    }

    public  void DoAttackinUnit(Unit Obj) throws InterruptedException {
        if (Obj != null) {
            logunit.log(Level.INFO, String.valueOf(this.UT) + "/" + this.un + "/" +this.AD + " attack =>  " + Obj.UT + "/" + Obj.un + "/" +Obj.AD );
            while (Obj.health > 0 && this.health > 0) {
                int totaldamage = (int) (this.damage - (this.damage * Obj.armour));
                Obj.health = Obj.health - totaldamage;

                Thread.sleep((long) (1000/this.attackspeed));
            }

            if (Obj.health <= 0) {
                Obj.LD = LiveDead.IsDead;
            }
            if (this.health <= 0) {

                this.LD = LiveDead.IsDead;
            }

        }


    }
    public  void DoAttackAirplan(Base Obj) throws InterruptedException {

        int totaldamage= (int) (this.damage-(this.damage*Obj.armour));
        Obj.health=Obj.health-totaldamage;
        Thread.sleep((long) (1000/this.attackspeed));

        if(Obj.health<=0)
        {
            Obj.LD = LiveDead.IsDead;
            logunit.log(Level.INFO,    "<<<<<<<<< the Base >>>>>>>>"+Obj.LD);
            startgame.state=GameState.AttakerWon;
            startgame.gamestate(startgame.state);
        }


    }
    public ArrayList<Unit> range(ArrayList<Unit> array){
        int xr=this.position.x+this.position.radius+this.range;
        int yu=this.position.y+this.position.radius+this.range;
        int xl=this.position.x-this.position.radius-this.range;
        int yd=this.position.y-this.position.radius-this.range;
        ArrayList<Unit> unitrange=new ArrayList<Unit>();
        for(int i=0;i<array.size();i++) {
            if (array.get(i).getPosition().x+array.get(i).getPosition().radius<xr  &&  array.get(i).getPosition().x-array.get(i).getPosition().radius>xl && array.get(i).getPosition().y+array.get(i).getPosition().radius<yu &&
                    array.get(i).getPosition().y-array.get(i).getPosition().radius>yd && array.get(i).getLD()==LiveDead.IsLive  && this.target.contains(array.get(i).UT)){
                if(this.getAD()!=array.get(i).getAD()){
                    unitrange.add(array.get(i));
                }
            }
        }
        return unitrange;
    }

    public ArrayList<Unit> allrange(ArrayList<Unit> array){
        int xr=this.position.x+this.position.radius+this.range;
        int yu=this.position.y+this.position.radius+this.range;
        int xl=this.position.x-this.position.radius-this.range;
        int yd=this.position.y-this.position.radius-this.range;
        ArrayList<Unit> unitrange=new ArrayList<Unit>();

        for(int i=0;i<array.size();i++) {

            if (array.get(i).getPosition().x+array.get(i).getPosition().radius<xr  &&  array.get(i).getPosition().x-array.get(i).getPosition().radius>xl &&  array.get(i).getPosition().y+array.get(i).getPosition().radius<yu &&
                    array.get(i).getPosition().y-array.get(i).getPosition().radius>yd && array.get(i).getLD()==LiveDead.IsLive){

                unitrange.add(array.get(i));
            }

        }
        return unitrange;
    }
    public void DoAttackinBase(Base Obj) throws InterruptedException {
        while(Obj.health>0 && this.health > 0){
            int totaldamage= (int) (this.damage-(this.damage*Obj.armour));
            Obj.health=Obj.health-totaldamage;
            Thread.sleep((long) (1000/this.attackspeed));
        }

        if(Obj.health<=0)
        { Obj.LD=LiveDead.IsDead;
            startgame.state=GameState.AttakerWon;
            System.out.println("dead base");
            startgame.gamestate(startgame.state);
        }

    }
//    public boolean baseinrang()
//    {
//        int xr=this.position.x+this.position.radius+this.range;
//        int yu=this.position.y+this.position.radius+this.range;
//        int xl=this.position.x-this.position.radius-this.range;
//        int yd=this.position.y-this.position.radius-this.range;
//            if( base.getPosition().x+base.getPosition().radius<xr  ||  base.getPosition().x-base.getPosition().radius>xl ||  base.getPosition().y+base.getPosition().radius<yu ||
//                    base.getPosition().y-base.getPosition().radius>yd){
//                return false;
//            }
//            return true;
//    }


    public void run(){
        logunit.log(Level.INFO, String.valueOf(this.UT) + "/" + this.un + "/" +this.AD);
  /*  try {
        fh=new FileHandler("Detiales Units");
    } catch (IOException e) {
        e.printStackTrace();
    }
    logunit.addHandler(fh);*/
        startgame.state=GameState.Running;
        if (this.AD==AttackDefender.Attacker)
        {
            try {
                if(this.LD==LiveDead.IsLive &&this.UT!=UnitType.Airplane) {
                    while (this.LD==LiveDead.IsLive && m.move(this) != false && startgame.state==GameState.Running ) {
                        DoAttackinUnit(t.DoTactic(this.range(this.g.getArray())));
                        if (this.LD==LiveDead.IsDead)
                        {  logunit.log(Level.INFO, this.UT + "/" + this.un + "/" +this.AD +  "/" +"<<the unit >>"+this.LD);
                            startgame.reammeningattackunit--;
                        }
                    }

                    if (startgame.reammeningattackunit==0)
                    {
                        startgame.state=GameState.DefenderWon;
                        startgame.gamestate(startgame.state);

                    }
                    if(this.LD==LiveDead.IsLive &&this.UT!=UnitType.Airplane) {
                        System.out.println("false1");
                        DoAttackinBase(this.base);

                    }
                    if(this.base.LD==LiveDead.IsDead) {
                        logunit.log(Level.INFO,    "<<<<<<<<< the Base >>>>>>>>"+this.base.LD);
                    }


                }


                if(this.LD==LiveDead.IsLive&&this.UT==UnitType.Airplane)
                {
                    while (this.LD==LiveDead.IsLive && this.base.LD==LiveDead.IsLive && startgame.state==GameState.Running) {
                        m.move(this);
                        DoAttackAirplan(this.base);
                        m.move(this);
                    }
                    if(this.LD==LiveDead.IsDead) {
                        logunit.log(Level.INFO, this.UT + "/" + this.un + "/" + this.AD + "/" + "<<the unit >>" + this.LD);
                    }

                }



            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.AD==AttackDefender.defender)
        {
            try {
                while (this.LD==LiveDead.IsLive && startgame.state==GameState.Running) {

                    if(!this.range(this.g.getArray()).isEmpty()) {
                        DoAttackinUnit(t.DoTactic(this.range(this.g.getArray())));
                    }
                }
                logunit.log(Level.INFO, this.UT + "/" + this.un + "/" +this.AD +  "/" +"<<the unit >>"+this.LD);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}