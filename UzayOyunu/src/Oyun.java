
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Ates {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

public class Oyun extends JPanel implements KeyListener, ActionListener {

    Timer timer = new Timer(5, this);//5 ms de bir hareket et
    private int sure = 0;
    private int mermi = 0;
    private BufferedImage image;
    private ArrayList<Ates> atesler = new ArrayList<>();
    private int atesdirY = 1;
    private int topX = 0;
    private int topdirX = 2;
    private int gemiX = 0;
    private int dirUzayX = 20;

    public boolean kontrolEt() {
        return atesler.stream().anyMatch((ates) -> (new Rectangle(ates.getX(), ates.getY(), 10, 20).intersects(new Rectangle(topX, 0, 20, 20))));
    }

    public Oyun() {
        try {
            image = ImageIO.read(new FileImageInputStream(new File("roket.png")));
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.BLACK);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        sure += 5;
        g.setColor(Color.red);
        g.fillOval(topX, 0, 20, 20);
        g.drawImage(image, gemiX, 490, image.getWidth() / 10, image.getHeight() / 10, this);
        atesler.stream().filter((ates) -> (ates.getY() < 0)).forEachOrdered((ates) -> {
            atesler.remove(ates);
        });
        g.setColor(Color.MAGENTA);
        atesler.forEach((ates) -> {
            g.fillRect(ates.getX(), ates.getY(), 10, 20);
        });
        if (kontrolEt()) {
            timer.stop();
            String mesaj = "Kazandınız\n"
                    + "Kullanılan mermi sayısı:" + mermi + "\n"
                    + "Geçen süre:" + (sure / 1000.0);
            JOptionPane.showMessageDialog(this, mesaj);
            System.exit(0);

        }
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        switch (c) {
            case KeyEvent.VK_LEFT:
                //sol baılmışsa
                if (gemiX <= 0) {
                    gemiX = 0;
                } else {
                    gemiX -= dirUzayX;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (gemiX >= 780) {
                    gemiX = 780;
                } else {
                    gemiX += dirUzayX;
                }
                break;
            case KeyEvent.VK_SPACE:
                atesler.add(new Ates(gemiX + 15, 490));
                mermi++;
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        atesler.forEach((ates) -> {
            ates.setY(ates.getY() - atesdirY);
        });
        topX += topdirX;
        if (topX >= 780) {
            topdirX = -topdirX;
        }
        if (topX <= 0) {
            topdirX = -topdirX;
        }
        repaint();

    }

}
