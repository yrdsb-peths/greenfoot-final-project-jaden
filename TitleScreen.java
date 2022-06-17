import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Penguin Dinner", 80);;
    GreenfootSound soundTrack = new GreenfootSound("backgroundmusic.mp3");
    Label play = new Label("Play", 50);
    Label help = new Label("Help", 50);
    static String choice = ("help");
    //GreenfootImage pb = new GreenfootImage("images/playButton.
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        addObject(titleLabel, getWidth()/2, 80);
        addObject(play, 150, 300);
        addObject(help, 450, 300);
        soundTrack.playLoop();
        titlePenguin roe = new titlePenguin();
        addObject(roe, getWidth()/2, 200);
    
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
        if(Greenfoot.mousePressed(play) == true)
        {
            DifficultyScreen screen = new DifficultyScreen();
            Greenfoot.setWorld(screen);
            choice = ("play");
        }
        if(Greenfoot.mousePressed(help) == true)
        {
            Help screen = new Help();
            Greenfoot.setWorld(screen);
            choice = ("help");
        }
    }
}
