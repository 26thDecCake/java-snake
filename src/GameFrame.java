import javax.swing.JFrame;

public class GameFrame extends JFrame {
  GameFrame() {
    // Create the frame/windows for the game
    GamePanel panel = new GamePanel();
    this.add(panel);
    this.setTitle("Snake Game");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    // this.pack used to take jframe and fit it all around the GamePanel
    this.pack();
    this.setVisible(true);
    // Set screen to middle of screen
    this.setLocationRelativeTo(null);
  }
}