import java.awt.*;
import java.applet.*;

/*<applet code="House" height="600" width ="800"></applet> */

public class House extends Applet {

    public void paint(Graphics g) {

        g.setColor(Color.blue);

        g.fillRect(565, 205, 310, 362);

        g.setColor(Color.red);

        g.fillRect(605, 275, 75, 75);
        g.fillRect(752, 275, 75, 75);
        g.fillRect(665, 395, 120, 170);

        int x[] = { 477, 947, 712 };
        int y[] = { 204, 204, 63 };

        g.fillPolygon(x, y, 3);

        g.setColor(Color.yellow);

        g.fillOval(745, 473, 13, 13);

        g.fillRect(1012, 359, 9, 209);

        g.setColor(Color.green);

        g.fillRect(437, 565, 660, 13);

        g.setColor(Color.red);

        int x1[] = { 1017, 967, 967, 984, 1051, 1068, 1068 };
        int y1[] = { 250, 276, 325, 361, 361, 325, 276 };

        g.fillPolygon(x1, y1, 7);

        g.setColor(Color.black);

        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("STOP", 993, 310);

        g.drawRect(565, 203, 310, 362);
        g.drawRect(605, 275, 75, 75);
        g.drawRect(752, 275, 75, 75);
        g.drawRect(665, 395, 120, 170);

        g.drawPolygon(x, y, 3);

        g.drawRect(437, 565, 660, 13);
        g.drawOval(745, 473, 13, 13);
        g.drawPolygon(x1, y1, 7);
    }
}
