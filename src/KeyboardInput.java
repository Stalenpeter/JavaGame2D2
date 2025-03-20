import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {
    private Player player;
    
    public KeyboardInput(Player player) {
        this.player = player;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT) {
            player.moveLeft();
        } else if (key == KeyEvent.VK_RIGHT) {
            player.moveRight();
        } else if (key == KeyEvent.VK_A) { // A key for punch
            player.punch();
        } else if (key == KeyEvent.VK_S) { // S key for kick
            player.kick();
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {}
    
    @Override
    public void keyTyped(KeyEvent e) {}
}
