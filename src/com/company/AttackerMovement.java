package com.company;


import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AttackerMovement extends    MOVMENT {
    private final static Logger logunit=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    @Override
    public boolean move(Unit unit) throws InterruptedException {
        int x, y;
        boolean test = false;

        ArrayList<Unit> all = new ArrayList<Unit>();
        ArrayList<Unit> rang = new ArrayList<Unit>();
        while (true) {

            if (unit.getPosition().x+unit.getPosition().radius < unit.getBase().xbase-unit.getBase().radius) {
                x = unit.position.x + unit.size;
                rang=unit.range(unit.g.getArray());
                if (!rang.isEmpty())
                {
                    return true;
                }
                all = unit.allrange(unit.g.getArray());
                for (int i = 0; i < all.size(); i++) {
                    if (all.get(i).position.Issqaure( x+unit.getPosition().radius, unit.position.y)&& all.get(i).LD==LiveDead.IsLive && all.get(i).UT!=UnitType.Airplane&& all.get(i).UT!=UnitType.River) {

                        return true;

                    }
                    if(all.get(i).position.Issqaure(x+unit.getPosition().radius , unit.position.y)&& all.get(i).UT==UnitType.River)
                    {
                        Thread.sleep(1000/unit.speed);
                        break;
                    }

                }

                unit.position.x=x;
                logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                //   unit.g.printzoomgrid(0,70,0,70);
                //   System.out.println(unit.position.x+"---"+ unit.position.y);

                Thread.sleep(1000/unit.speed);
            }

            else if (unit.getPosition().y+unit.getPosition().radius < unit.getBase().ybase-unit.getBase().radius) {
                y = unit.position.y + unit.size;
                rang=unit.range(unit.g.getArray());
                if (!rang.isEmpty())
                {
                    return true;
                }

                all = unit.allrange(unit.g.getArray());
                for (int i = 0; i < all.size(); i++) {

                    if (all.get(i).position.Issqaure( unit.position.x,y+unit.getPosition().radius) && all.get(i).LD==LiveDead.IsLive&& all.get(i).UT!=UnitType.Airplane&&all.get(i).UT!=UnitType.River) {
                        return true;

                    }
                    if(all.get(i).position.Issqaure(unit.position.x,y+unit.getPosition().radius)&& all.get(i).UT==UnitType.River)
                    {
                        Thread.sleep(1000/unit.speed);
                        break;
                    }

                }

                unit.position.y=y;
                logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                // unit.g.printzoomgrid(0,70,0,70);
                // System.out.println(unit.position.x+"---"+ unit.position.y);

                Thread.sleep(1000/unit.speed);
            }


            else if (unit.getPosition().x-unit.getPosition().radius > unit.getBase().xbase+unit.getBase().radius) {
                x = unit.position.x - unit.size;
                rang=unit.range(unit.g.getArray());
                if (!rang.isEmpty())
                {
                    return true;
                }

                all = unit.allrange(unit.g.getArray());
                for (int i = 0; i < all.size(); i++) {
                    if (all.get(i).position.Issqaure( x-unit.getPosition().radius , unit.position.y)&& all.get(i).LD==LiveDead.IsLive&& all.get(i).UT!=UnitType.Airplane&&all.get(i).UT!=UnitType.River) {

                        return true;

                    }
                    if(all.get(i).position.Issqaure( x-unit.getPosition().radius , unit.position.y)&& all.get(i).UT==UnitType.River)
                    {
                        Thread.sleep(1000/unit.speed);
                        break;
                    }

                }

                unit.position.x=x;
                logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                // unit.g.printzoomgrid(0,70,0,70);
                // System.out.println(unit.position.x+"---"+  unit.position.y);

                Thread.sleep(1000/unit.speed);

            }
            else if (unit.getPosition().y-unit.getPosition().radius > unit.getBase().ybase+unit.getBase().radius) {
                y = unit.position.y - unit.size;
                rang=unit.range(unit.g.getArray());
                if (!rang.isEmpty())
                {
                    return true;
                }

                all = unit.allrange(unit.g.getArray());
                for (int i = 0; i < all.size(); i++) {

                    if (all.get(i).position.Issqaure( unit.position.x,y-unit.getPosition().radius) && all.get(i).LD==LiveDead.IsLive&& all.get(i).UT!=UnitType.Airplane&&all.get(i).UT!=UnitType.River) {
                        return true;

                    }
                    if(all.get(i).position.Issqaure(unit.position.x,y-unit.getPosition().radius)&& all.get(i).UT==UnitType.River)
                    {
                        Thread.sleep(1000/unit.speed);
                        break;
                    }

                }

                unit.position.y=y;
                logunit.log(Level.INFO, String.valueOf(unit.UT) + "/" + unit.un + "/" +unit.AD + " move to => (" +unit.position.x+","+unit.position.y+")");
                // unit.g.printzoomgrid(0,70,0,70);
                // System.out.println(unit.position.x+"---"+ unit.position.y);

                Thread.sleep(1000/unit.speed);
            }
            else
                break;

        }
        return false;}

}
