import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PinkYeti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinkYeti extends Actor
{
    /**
     * Act - do whatever the PinkYeti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] moveLeft = new GreenfootImage[4];  
    GreenfootImage[] moveRight = new GreenfootImage[4];
    SimpleTimer animation = new SimpleTimer();
    String facing = "left";
    public PinkYeti()
    {
        for(int i = 0; i < 4; i++)
        {
            moveLeft[i] = new GreenfootImage("images/pinkyetis/p.move" + i + ".png");
        }
        for(int i = 0; i < 4; i++)
        {
            moveRight[i] = new GreenfootImage("images/pinkyetis/p.move" + i + ".png");
            moveRight[i].mirrorHorizontally();
        }
        setImage(moveLeft[0]);
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
        if(facing.equals("right"))
        {
            setImage(moveLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % moveLeft.length;
        }
        else
        {
            setImage(moveRight[imageIndex]);
            imageIndex = (imageIndex + 1) % moveRight.length;
        }
        
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+5);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            facing = "right";
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            facing = "left";
            setLocation(getX()+5, getY());
        }
        animate();
    }
}
