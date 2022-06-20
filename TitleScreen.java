import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Penguin Dinner", 80);
    GreenfootSound soundTrack = new GreenfootSound("backgroundmusic.mp3");
    static String choice = ("about");
    playButton p = new playButton();
    aboutButton a = new aboutButton();
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        addObject(titleLabel, getWidth()/2, 80);
        soundTrack.playLoop();
        titlePenguin roe = new titlePenguin();
        addObject(roe, getWidth()/2, 200);
        addObject(p, 150, 320);
        addObject(a, 450, 320);
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
        if(Greenfoot.mousePressed(p) == true)
        {
            DifficultyScreen screen = new DifficultyScreen();
            Greenfoot.setWorld(screen);
            choice = ("p");
        }
        if(Greenfoot.mousePressed(a) == true)
        {
            About screen = new About();
            Greenfoot.setWorld(screen);
            choice = ("about");
        }
    }
}
