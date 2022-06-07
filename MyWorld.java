import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int pengX = Greenfoot.getRandomNumber(1000);
    public int pengY = Greenfoot.getRandomNumber(600);
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1, false);
        PinkYeti poe = new PinkYeti();
        addObject(poe, 40, 40);
        WhiteYeti moe = new WhiteYeti();
        addObject(moe, 965, 565);
        onePeng doe = new onePeng();
        addObject(doe, pengX, pengY);
        santa santa = new santa();
        addObject(santa,500,300);
        
        
    }

}
