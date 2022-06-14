import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class titlePenguin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class titlePenguin extends Actor
{
    /**
     * Act - do whatever the titlePeng wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] walk = new GreenfootImage[9];
    SimpleTimer animation = new SimpleTimer();
    public titlePenguin()
    {
        for(int i = 0; i < 9; i++)
        {
            walk[i] = new GreenfootImage("images/titlePengs/walk" + i + ".png"); 
            walk[i].scale(200, 200);
        }
        setImage(walk[0]);
        animation.mark();
    }
    int imageIndex = 0;
    public void animate()
    {
        if(animation.millisElapsed() < 200)
        {
            return;
        }
        animation.mark();
        setImage(walk[imageIndex]);
        imageIndex = (imageIndex + 1) % walk.length;
    }
    public void act()
    {
        animate();
    }
    
}
