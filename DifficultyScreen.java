import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DifficultyScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DifficultyScreen extends World
{
    Label easy = new Label ("Easy", 50);
    Label medium = new Label ("Medium", 50);
    Label hard = new Label ("Hard", 50);
    Label select = new Label ("Pick a difficulty", 50);
    static String difficulty = ("easy");
    /**
     * Constructor for objects of class DifficultyScreen.
     * 
     */
    public DifficultyScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(easy, 70, 200);
        addObject(medium, 300, 200);
        addObject(hard, 520, 200);
        addObject(select, 300, 100);
        
    }
    public void act()
    {
        if(Greenfoot.mousePressed(easy) == true)
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            difficulty = ("easy");
        }
        if(Greenfoot.mousePressed(medium) == true)
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            difficulty = ("medium");
        }
        if(Greenfoot.mousePressed(hard) == true)
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            difficulty = ("hard");
        }
    }
}
