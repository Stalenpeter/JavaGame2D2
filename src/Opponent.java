import java.awt.*;
import javax.swing.ImageIcon;

public class Opponent {
    private int x, y;
    private int health = 100;
    private Image opponentImage;

    public Opponent(int x, int y) {
        this.x = x;
        this.y = y;
        opponentImage = new ImageIcon("res/images/opponent.png").getImage();
    }

    public void update() {
        // AI behavior: Move toward the player and attack
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void draw(Graphics g) {
        g.drawImage(opponentImage, x, y, 50, 50, null);
        // Draw health bar
        g.setColor(Color.RED);
        g.fillRect(x, y - 10, health / 2, 5);
    }

    public int getHealth() {
        return health;
    }

    public boolean isPunching() {
        // Placeholder: Implement punch behavior for AI
        return false;
    }

    public int getX() {
        return x;
    }
}
