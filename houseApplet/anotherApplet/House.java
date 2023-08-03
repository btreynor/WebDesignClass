import java.awt.*;
import java.applet.*;

/*<applet code="House height="600" width ="800"></applet> */

public class House extends Applet {

    public void paint(Graphics g) {

        Font home = new Font("Arial", Font.BOLD, 28);
        g.setFont(home);
        g.drawString("H O U S E", 20, 80);
        int a[] = { 150, 300, 225 };
        int b[] = { 150, 150, 25 };

        /*--------------------------------- */
        g.setColor(Color.BLACK);
        g.fillRect(150, 150, 150, 250);

        /*---------------------------------- */
        g.setColor(Color.BLACK);
        g.fillRect(190, 220, 70, 130);

        /*---------------------------------- */
        g.setColor(Color.RED);
        g.fillPolygon(a, b, 3);

        /*---------------------------------- */
        g.setColor(Color.YELLOW);
        g.fillOval(200, 75, 50, 50);

        /*---------------------------------- */
        Font dell = new Font("Arial", Font.BOLD, 20);
        g.setFont(dell);
        g.setColor(Color.RED);
        g.drawString("DELL", 204, 108);

        /*---------------------------------- */
        g.setColor(Color.RED);
        g.fillRect(300, 150, 250, 200);

        /*---------------------------------- */
        g.setColor(Color.BLACK);
        g.fillRect(390, 210, 80, 80);

        /*---------------------------------- */
        g.setColor(Color.BLUE);
        g.fillRect(430, 210, 430, 290);

        /*---------------------------------- */
        g.setColor(Color.BLUE);
        g.fillRect(470, 250, 390, 250);

        /*---------------------------------- */
        g.setColor(Color.RED);
        g.fillRect(460, 26, 226, 26);

        /*---------------------------------- */
        g.setColor(Color.RED);
        g.fillRect(460, 25, 550, 150);
    }
}
