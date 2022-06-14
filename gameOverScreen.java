import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOverScreen extends World
{
    Label restart = new Label ("Play Again", 50);
    Label difficulty = new Label ("Change Difficulty", 50);
    /**
     * Constructor for objects of class gameOverScreen.
     * 
     */
    public gameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(restart, 100, 200);
        
        addObject(difficulty, 500, 200);
    }
    public void act()
    {
        if(Greenfoot.mousePressed(restart) == true)
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            
        }
        
        if(Greenfoot.mousePressed(difficulty) == true)
        {
            DifficultyScreen difficultyScreen = new DifficultyScreen();
            Greenfoot.setWorld(difficultyScreen);
           
        }
    }
}
