import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteYeti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteYeti extends Actor
{
    GreenfootImage[] moveLeft = new GreenfootImage[4];
    GreenfootImage[] moveRight = new GreenfootImage[4];
    SimpleTimer animation = new SimpleTimer();
    String facing = "left";
    /**
     * Act - do whatever the WhiteYeti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WhiteYeti()
    {
        
        for(int i = 0; i < 4; i++)
        {
            moveLeft[i] = new GreenfootImage("images/whiteyetis/w.move" + i + ".png");
        }
        for(int i = 0; i < 4; i++)
        {
            moveRight[i] = new GreenfootImage("images/whiteyetis/w.move" + i + ".png");
            moveRight[i].mirrorHorizontally();
        }
        setImage(moveLeft[0]);     
        animation.mark();
        GreenfootImage image = getImage();  
        image.scale(70, 70);
        setImage(image);
    }
    int imageIndex = 0;
    public void animate()
    {
        if(animation.millisElapsed() < 500)
        {
            return;
        }
        animation.mark();
        if(facing.equals("left"))
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
            facing = "left";
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            facing = "right";
            setLocation(getX()+5, getY());
        }
        animate();
    }
}
