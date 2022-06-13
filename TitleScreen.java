import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Penguin Dinner", 50);
    Label start = new Label("<click space to start>", 30);
    GreenfootSound soundTrack = new GreenfootSound("backgroundmusic.mp3");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, 100);
        addObject(start, getWidth()/2,350);
        soundTrack.playLoop();
    }
    public void stopped()
    {
         soundTrack.pause();
    }
     
    public void started()
    {
        soundTrack.playLoop();
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            DifficultyScreen gameWorld = new DifficultyScreen();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
