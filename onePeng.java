import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class onePeng here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class onePeng extends Actor
{
    /**
     * Act - do whatever the onePeng wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //move(1);
    }
    public onePeng()
    {
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);
    }
}
