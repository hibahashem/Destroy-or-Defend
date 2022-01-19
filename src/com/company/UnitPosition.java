package com.company;

public class UnitPosition {
    int x;
    int y;
    int radius;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public  boolean Issqaure(int xnew, int ynew)
    {
        int xr=this.x+this.radius;
        int xl=this.x-this.radius;
        int yu=this.y+this.radius;
        int yd=this.y-this.radius;

            if (xnew>xl && xnew<xr && ynew>yd && ynew<yu ){
               return true;
                }

        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
}
