import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class BouncingTextApplet extends Applet implements Runnable {
    private String firstName;
    private String lastName;
    private int xPosition;
    private int yPosition;
    private Thread animationThread;
    private boolean running;
    private int textWidth;

    @Override
    public void init() {
        setSize(800, 400);
        setBackground(Color.BLACK);
        firstName = "Robel";
        lastName = "Shiferaw";
        xPosition = 0;
        yPosition = 200;
        running = false;
    }

    @Override
    public void start() {
        if (animationThread == null || !animationThread.isAlive()) {
            running = true;
            animationThread = new Thread(this);
            animationThread.start();
        }
    }

    @Override
    public void stop() {
        running = false;
        if (animationThread != null) {
            animationThread.interrupt();
            animationThread = null;
        }
    }

    @Override
    public void run() {
        while (running) {
            xPosition += 5;

            if (xPosition > getWidth()) {
                xPosition = -100;
            }

            repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        Font boldFont = new Font("SansSerif", Font.BOLD, 24);
        g.setFont(boldFont);

        g.setColor(Color.CYAN);
        g.drawString(firstName, xPosition, yPosition);

        g.setColor(Color.GREEN);
        g.drawString(" " + lastName, xPosition + g.getFontMetrics().stringWidth(firstName), yPosition);
    }
}
