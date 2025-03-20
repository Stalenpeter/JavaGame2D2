import java.awt.*;
import javax.swing.ImageIcon;

public class Player {
    private int x, y;
    private int speed = 5;
    private int health = 100;  // Player health
    private Image playerImage;
    
    private boolean isPunching = false;
    private boolean isKicking = false;
    
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        playerImage = new ImageIcon("res/images/player.png").getImage();
    }
    
    public void update() {
        // Placeholder for movement logic and attacking
        if (isPunching) {
            // Handle punch animation or hit detection
        }
        if (isKicking) {
            // Handle kick animation or hit detection
        }
    }
    
    public void moveLeft() {
        x -= speed;
    }
    
    public void moveRight() {
        x += speed;
    }
    
    public void punch() {
        isPunching = true;
        // Handle punch logic
    }
    
    public void kick() {
        isKicking = true;
        // Handle kick logic
    }
    
    public void takeDamage(int damage) {
        health -= damage;
    }

    public void draw(Graphics g) {
        g.drawImage(playerImage, x, y, 50, 50, null);
        // Draw Health Bar
        g.setColor(Color.RED);
        g.fillRect(x, y - 10, health / 2, 5);
    }

    public int getHealth() {
        return health;
    }

    public boolean isPunching() {
        return isPunching;
    }

    public int getX() {
        return x;
    }
}
