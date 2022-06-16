import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOverScreen extends World
{
    Label restart = new Label ("Play Again", 40);
    Label difficulty = new Label ("Change Difficulty", 40);
    /**
    GreenfootImage pinkWins = new GreenfootImage("images/pinkyetis/pinkwins.png");
    GreenfootImage pinkDies = new GreenfootImage("images/pinkyetis/pinkdies.png");
    GreenfootImage whiteWins = new GreenfootImage("images/whiteyetis/whitewins.png");
    GreenfootImage whiteDies = new GreenfootImage("images/whiteyetis/whitedies.png");
    
    /**
     * Constructor for objects of class gameOverScreen.
     * 
     */
    public gameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(restart, 140, 140);
        
        addObject(difficulty, 430, 140);
        
        Label winner = new Label(PinkYeti.winner + " wins!", 65);
        addObject(winner, 300, 60);
        winPink wp = new winPink();
        winWhite ww = new winWhite();
        deadPink dp = new deadPink();
        deadWhite dw = new deadWhite();
        if(PinkYeti.winner == "pink")
        {
            addObject(wp, 390, 300);
            addObject(dw, 220, 350);
        }
        if(PinkYeti.winner == "white")
        {
            addObject(ww, 390, 300);
            addObject(dp, 220, 350);
        }
        
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
