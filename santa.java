import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class santa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class santa extends Actor
{
    GreenfootImage[] santaDie = new GreenfootImage[17];
    
    public santa()
    {
        for(int i = 1; i < santaDie.length; i++)
        {
            santaDie[i] = new GreenfootImage("images/santa/Dead (" + i + ").png");
        }
        setImage(santaDie[15]);
        GreenfootImage santaDie = getImage();
        santaDie.scale(200, 200);
        setImage (santaDie);
    }
    /**
     * Act - do whatever the santa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        move(-5);
        setLocation(getX(), getY()-5);
        setLocation(getX(), getY()+5);
        turn(2);
    }

}
