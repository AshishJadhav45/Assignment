import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEventExample extends JFrame implements KeyListener {
    private JLabel keyLabel;
    
    public KeyboardEventExample() {
        super("Keyboard Event Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        keyLabel = new JLabel("Press a key");
        add(keyLabel);
        
        addKeyListener(this);
        setVisible(true);
    }
    
    public void keyTyped(KeyEvent e) {
        keyLabel.setText("Key Typed: " + e.getKeyChar());
    }
    
    public void keyPressed(KeyEvent e) {
        keyLabel.setText("Key Pressed: " + e.getKeyChar());
    }
    
    public void keyReleased(KeyEvent e) {
        keyLabel.setText("Key Released: " + e.getKeyChar());
    }
    
    public static void main(String[] args) {
        new KeyboardEventExample();
    }
}
