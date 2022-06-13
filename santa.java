import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class santa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
