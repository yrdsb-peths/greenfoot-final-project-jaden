import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pink yeti is controlled by player.
 * 
 * @author Jaden and Raina
 * @version (22.06.20)
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
    static String winner = "pink";
    
    int lives = 3;
    int score = 0;
    public void act()
    {
        movement();
        spawnManyPeng();
        Eating();
        Eaten();
        getWorld().showText("Pink Yeti: " + getScore() + " score" + "\n Pink Yeti: " + lives + " lives", 100, 35);
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
            getWorld().showText("Pink Yeti WINS", 500, 300);           
            gameOverScreen gameOverScreen = new gameOverScreen();
            Greenfoot.setWorld(gameOverScreen);
            winner = "pink";
        }
    }
    
    public void Eaten() {
        if (isTouching(santa.class)) {
            lives -= 1;
            setLocation(35, 35);
            
        }
        if (lives <= 0) {
            getWorld().showText("White Yeti WINS", 500, 300);
            winner = "white";
            gameOverScreen gameOverScreen = new gameOverScreen();
            Greenfoot.setWorld(gameOverScreen);
        }
    }
    public PinkYeti()
    {

        for(int i = 0; i < 4; i++)
        {
            moveLeft[i] = new GreenfootImage("images/pinkyetis/p.move" + i + ".png");
             
            moveLeft[i].scale(60, 60);
        }
        for(int i = 0; i < 4; i++)
        {
            moveRight[i] = new GreenfootImage("images/pinkyetis/p.move" + i + ".png");
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
        if(animation.millisElapsed() < 100)
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
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-5);
            animate();
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+5);
            animate();
        }
        if(Greenfoot.isKeyDown("a"))
        {
            facing = "right";
            setLocation(getX()-5, getY());
            animate();
        }
        if(Greenfoot.isKeyDown("d"))
        {
            facing = "left";
            setLocation(getX()+5, getY());
            animate();
        }
        
    }
    int timer = 1200;
    public void spawnManyPeng() {
        int x = Greenfoot.getRandomNumber(1000);
        int y = Greenfoot.getRandomNumber(600);
        if (timer <= 0) {
            getWorld().addObject(new manyPeng(), x, y);
            timer = 1200;
        }
        timer--;
    }
}
