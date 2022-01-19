package com.company;

public class Base {
    int damage,health,speed,unitprice,range;
    float armour,attackspeed;
    int xbase,ybase,radius;

    LiveDead LD;
    private static Base x = null;

    public Base(){

        this.damage = 0;
        this. armour = (float) 0.0;
        this. health = 10000;
        this. speed = 0;
        this. unitprice = 0;
        this.radius = 50;
        this. range = 0;
        this.attackspeed= (float) 0.00;
        this.LD=LiveDead.IsLive;
        this.xbase=4500;
        this.ybase=2500;
    }

    public int getXbase() {
        return xbase;
    }

    public int getYbase() {
        return ybase;
    }

    public int getRadius() {
        return radius;
    }

    public static Base getObj()
    { if (Base.x == null)

        Base.x = new Base();
        return Base.x;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getArmour() {
        return armour;
    }

    public void setArmour(float armour) {
        this.armour = armour;
    }
    public  boolean Issqaure(int xnew,int ynew)
    {
        int xr=this.xbase+this.radius;
        int xl=this.xbase-this.radius;
        int yu=this.ybase+this.radius;
        int yd=this.ybase-this.radius;

        if (xnew>xl && xnew<=xr && ynew>yd && ynew<=yu ){
            return true;
        }

        return false;
    }

}
