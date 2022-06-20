import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * game world that users can play the game on
 * 
 * @author (Raina and Jaden) 
 * @version (22.06.20)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int pengX = Greenfoot.getRandomNumber(1000);
    public int pengY = Greenfoot.getRandomNumber(600);
    
    public int PengX = Greenfoot.getRandomNumber(1000);
    public int PengY = Greenfoot.getRandomNumber(600);
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1, true);
        PinkYeti poe = new PinkYeti();
        addObject(poe, 40, 90);
        WhiteYeti moe = new WhiteYeti();
        addObject(moe, 965, 565);
        onePeng doe = new onePeng();
        addObject(doe, pengX, pengY);
        santa santa = new santa();
        addObject(santa,500,300);
        
        onePeng soe = new onePeng();
        addObject(soe, PengX, PengY);
        
    }

}
