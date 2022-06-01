import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PinkYeti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinkYeti extends Actor
{
    /**
     * Act - do whatever the PinkYeti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] move = new GreenfootImage[4];
    
    public PinkYeti()
    {
        for(int i = 0; i < 4; i++)
        {
            move[i] = new GreenfootImage("images/pinkyetis/p.move" + i);
        }
        setImage(move[0]);
    }
    
    public void act()
    {
        // Add your action code here.
        move(1);
    }
}
