import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Jaden and Raina
 * @version (22.06.20)
 */
public class santa extends Actor
{
    /**
     * Act - do whatever the santa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your action code here.
        movement();
        
    }
    public void movement()
    {
        
        if(DifficultyScreen.difficulty == ("easy"))
        {
            move(2);
        }
        if(DifficultyScreen.difficulty == ("medium"))
        {
            move(5);
        }
        if(DifficultyScreen.difficulty == ("hard"))
        {
            move(10);
        }
        if (Greenfoot.getRandomNumber(100) < 15) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(179);
        }
    }
    
    
}
