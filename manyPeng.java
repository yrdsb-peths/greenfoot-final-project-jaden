import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class manyPeng here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class manyPeng extends Actor
{
    /**
     * Act - do whatever the manyPeng wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(2);
    }
    public manyPeng()
    {
        GreenfootImage image = getImage();  
        image.scale(40, 40);
        setImage(image); 
    }
}
