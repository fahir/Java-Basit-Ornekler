
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GrafikKullanimi extends JPanel {

    public GrafikKullanimi() {
        setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.red);
        g.drawRect(15, 15, 25, 25);//15 e 15 ten 25 e 25 dikdötgen çiz
        g.fillRect(200, 56, 50, 50);// 50 50 kare çiz
        g.setColor(Color.CYAN);
        g.drawOval(50, 50, 50, 50);//oval çiz
        g.drawArc(300, 300, 50, 100, 50, 150);
        g.drawLine(90, 90, 105, 95);
        g.drawString("Fahir", 500, 500);

    }

}
