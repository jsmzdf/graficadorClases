
/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
import java.applet.*;
import java.awt.*;

public class PanelD extends Applet {

    Dibujo c = new Dibujo();
    ScrollPane s = new ScrollPane();

    @Override
    public void init() {
        setLayout(null);
        s.setSize(900, 500);
        add(s);
        c = new Dibujo();
        c.setSize(1000, 500);
        s.add(c);
        
        c.setBounds(0, 0, 10000, 10000);
        c.setVisible(true);
    }

}
