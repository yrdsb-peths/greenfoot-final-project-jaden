import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteYeti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteYeti extends Actor
{
    /**
     * Act - do whatever the PinkYeti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] moveLeft = new GreenfootImage[4];  
    GreenfootImage[] moveRight = new GreenfootImage[4];
    SimpleTimer animation = new SimpleTimer();
    String facing = "left";
    
    int lives = 3;
    int score = 0;
    public void act()
    {
        movement();
        Eating();
        Eaten();
        getWorld().showText("White Yeti: " + getScore() + " score" + "\n White Yeti: " + lives + " lives", 900, 35);
    }
    public int getScore() {
        return score;
    }
    public void setScore(int x) {
        score += x;
    }
    public void Eating() {
        if (isTouching(onePeng.class) && score == 9) {
            getWorld().addObject(new santa(), 500, 300);
        }
        if (isTouching(onePeng.class)) {
            removeTouching(onePeng.class);
            getWorld().addObject(new onePeng(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(600));
            
            setScore(1);
        }
        if (isTouching(manyPeng.class)) {
            removeTouching(manyPeng.class);
           
            setScore(3);
            lives++;
        }
        if (getScore() >= 25) {
            getWorld().showText("White Yeti WINS", 500, 300);           
            Greenfoot.stop();
        }
    }
    
    public void Eaten() {
        if (isTouching(santa.class)) {
            lives -= 1;
            setLocation(965, 565);
            
        }
        if (lives <= 0) {
            getWorld().showText("Pink Yeti WINS", 500, 300);
            
            Greenfoot.stop();
        }
    }
    
    public WhiteYeti()
    {

        for(int i = 0; i < 4; i++)
        {
            moveLeft[i] = new GreenfootImage("images/whiteyetis/w.move" + i + ".png");
            moveLeft[i].scale(60, 60);
        }
        for(int i = 0; i < 4; i++)
        {
            moveRight[i] = new GreenfootImage("images/whiteyetis/w.move" + i + ".png");
            moveRight[i].mirrorHorizontally();
            moveRight[i].scale(60, 60);
        }
        setImage(moveLeft[0]);
        animation.mark();
        GreenfootImage image = getImage();  
        image.scale(60, 60);
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
    public void movement()
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
            facing = "right";
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            facing = "left";
            setLocation(getX()+5, getY());
        }
        animate();
    }
}