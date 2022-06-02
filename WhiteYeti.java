import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteYeti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteYeti extends Actor
{
    GreenfootImage[] move = new GreenfootImage[4];
    SimpleTimer animation = new SimpleTimer();
    /**
     * Act - do whatever the WhiteYeti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WhiteYeti()
    {
        
        for(int i = 0; i < 4; i++)
        {
            move[i] = new GreenfootImage("images/whiteyetis/w.move" + i + ".png");
        }
        setImage(move[0]);     
        animation.mark();
    }
    int imageIndex = 0;
    public void animate()
    {
        if(animation.millisElapsed() < 500)
        {
            return;
        }
        animation.mark();
        setImage(move[imageIndex]);
        imageIndex = (imageIndex + 1) % move.length;
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+5);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
        }
        animate();
    }
}
