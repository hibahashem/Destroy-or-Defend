package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AirforceMovment extends MOVMENT{
    int cnt=0;
    int n;
    int m;
    private final static Logger logunit=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Override
    public boolean move(Unit unit) throws InterruptedException {
        int x, y;

        boolean test = false;
        cnt++;

        if(cnt%2!=0) {

            n=unit.position.getX();
            m=unit.position.getY();
            while (true) {

                if (unit.getPosition().getX()< unit.getBase().getXbase() - unit.getBase().getRadius()) {
                    x = unit.position.getX()+ unit.getSize();

                    unit.position.setX(x);
                    logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                    Thread.sleep( 1000/unit.speed );

                }
                else if (unit.getPosition().getY()< unit.getBase().getYbase() -unit.getBase().getRadius()) {
                    y = unit.position.getY() + unit.getSize();
                    unit.position.setY(y);
                    logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                    Thread.sleep( 1000/unit.speed );
                }
                else if (unit.getPosition().getX()> unit.getBase().getXbase() + unit.getBase().getRadius()) {
                    x = unit.position.getX() - unit.getSize();
                    unit.position.setX(x);
                    logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                    Thread.sleep( 1000/unit.speed );

                }
                else if (unit.getPosition().getY()  > unit.getBase().getYbase() +unit.getBase().getRadius()) {
                    y = unit.position.getY() - unit.getSize();
                    unit.position.setY(y);
                    logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                    Thread.sleep(1000/unit.speed );

                }
                else
                    break;
            }
        }
        if(cnt%2==0) {
            while (true) {
                if (unit.getPosition().getX() < n ) {
                    x = unit.position.getX() + 1;
                    unit.position.setX(x);
                    logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                    Thread.sleep( 1000/unit.speed);

                } else if (unit.getPosition().getY() < m) {
                    y = unit.position.getY() + 1;
                    unit.position.setY(y);
                    logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                    Thread.sleep( 1000/unit.speed);
                } else if (unit.getPosition().getX() > n ) {
                    x = unit.position.getX() - 1;

                    unit.position.setX(x);
                    logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                    Thread.sleep( 1000/unit.speed);

                }
                else if (unit.getPosition().getY()  >m) {
                    y = unit.position.getY()- 1;

                    unit.position.setY(y);
                    logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                    Thread.sleep(1000/unit.speed);
                }
                else {

                    break;
                }
            }
        }
        return false;}
}
