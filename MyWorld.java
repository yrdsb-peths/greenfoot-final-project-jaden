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
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        PinkYeti poe = new PinkYeti();
        addObject(poe, 200, 200);
        WhiteYeti moe = new WhiteYeti();
        addObject(moe, 400, 200);
        onePeng doe = new onePeng();
        addObject(doe, 200, 50);
        manyPeng roe = new manyPeng();
        addObject(roe, 400, 50);
        
    }

}
