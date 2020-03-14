
import java.awt.Container;
import java.awt.event.KeyAdapter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;

/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class Vista extends JFrame {

    //herencia 
    JButton exten = new JButton("extends");
            JComboBox TipoE  = new JComboBox();
          JButton agrega= new JButton("Agregacion");
          JButton compo = new JButton("composicion");
    //
    JLabel Nclase = new JLabel("Nombre de la clase:");
    JLabel Nmetodos = new JLabel("Metodos:");
    JLabel Natributos = new JLabel("Atributos:");
    JButton Boton = new JButton("Dibujar");
    String Tipos[] = {"Seleccionar", "Public", "Private", "Protected"};
    String TiposC[] = {"Seleccionar", "Abstracta", "Interfaz", "Class"};

    JComboBox TipoA = new JComboBox(Tipos);
    JComboBox TipoM = new JComboBox(Tipos);
    JComboBox TipoC = new JComboBox(TiposC);
    
    JTextField inClas = new JTextField();
    JTextField inAtr = new JTextField();
    JTextField inMet = new JTextField();
    PanelD panelDib = new PanelD();

    public Vista() {
        setResizable(false);
        Container c = getContentPane();
        setTitle("Transformar");
        c.setLayout(null);
        //herencia

        c.add(TipoE);
       
        TipoE.setBounds(420, 10, 200, 20);
        c.add(exten);
        exten.setBounds( 650, 10, 120, 20);
        c.add(agrega);
        agrega.setBounds( 650, 30, 120, 20);
        c.add(compo);
        compo.setBounds( 650, 60, 120, 20);
       //TipoE.addItem("Seleccionar");
        //
        
        add(panelDib);
        panelDib.init();
        panelDib.setBounds(10, 100, 1000, 700);
        c.add(Nclase);
        Nclase.setBounds(10, 10, 150, 20);
        c.add(Natributos);
        Natributos.setBounds(10, 30, 150, 20);
        c.add(Nmetodos);
        Nmetodos.setBounds(10, 50, 150, 20);
        c.add(inClas);
        inClas.setBounds(160, 10, 160, 20);
        c.add(inAtr);
        inAtr.setBounds(160, 30, 160, 20);
        c.add(inMet);
        inMet.setBounds(160, 50, 160, 20);
        c.add(TipoA);
        TipoA.setBounds(320, 30, 100, 20);
        c.add(TipoM);
        TipoM.setBounds(320, 50, 100, 20);
        c.add(TipoC);
        TipoC.setBounds(320, 10, 100, 20);
        c.add(Boton);
        Boton.setBounds(280, 80, 80, 20);
    }

    void mostrar() {
        validarLetra();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setVisible(true);
        

    }

    public void validarLetra() {

        inClas.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {

                int z = (int) e.getKeyChar();
                char c = e.getKeyChar();
                if (c != 'q' && c != 'w' && c != 'e' && c != 'r' && c != 't' && c != 'y' && c != 'u' && c != 'i' && c != 'o' && c != 'p'
                        && c != 'a' && c != 's' && c != 'd' && c != 'f' && c != 'g' && c != 'h' && c != 'j' && c != 'k' && c != 'l'
                        && c != 'z' && c != 'x' && c != 'c' && c != 'v' && c != 'b' && c != 'n' && c != 'm' && c != '_'
                        && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9' && c != '0'
                        && c != 'Q' && c != 'W' && c != 'E' && c != 'R' && c != 'T' && c != 'Y' && c != 'U' && c != 'I' && c != 'O' && c != 'P'
                        && c != 'A' && c != 'S' && c != 'D' && c != 'F' && c != 'G' && c != 'H' && c != 'J' && c != 'K' && c != 'L'
                        && c != 'Z' && c != 'X' && c != 'C' && c != 'V' && c != 'B' && c != 'N' && c != 'M') {
                    e.consume();

                }
            }
        });
        inAtr.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                int z = (int) e.getKeyChar();
                char c = e.getKeyChar();
                if (c != 'q' && c != 'w' && c != 'e' && c != 'r' && c != 't' && c != 'y' && c != 'u' && c != 'i' && c != 'o' && c != 'p'
                        && c != 'a' && c != 's' && c != 'd' && c != 'f' && c != 'g' && c != 'h' && c != 'j' && c != 'k' && c != 'l'
                        && c != 'z' && c != 'x' && c != 'c' && c != 'v' && c != 'b' && c != 'n' && c != 'm' && c != '_'
                        && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9' && c != '0'
                        && c != 'Q' && c != 'W' && c != 'E' && c != 'R' && c != 'T' && c != 'Y' && c != 'U' && c != 'I' && c != 'O' && c != 'P'
                        && c != 'A' && c != 'S' && c != 'D' && c != 'F' && c != 'G' && c != 'H' && c != 'J' && c != 'K' && c != 'L'
                        && c != 'Z' && c != 'X' && c != 'C' && c != 'V' && c != 'B' && c != 'N' && c != 'M') {
                    e.consume();

                }
            }
        });
        inMet.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {

                int z = (int) e.getKeyChar();
                char c = e.getKeyChar();
                if (c != 'q' && c != 'w' && c != 'e' && c != 'r' && c != 't' && c != 'y' && c != 'u' && c != 'i' && c != 'o' && c != 'p'
                        && c != 'a' && c != 's' && c != 'd' && c != 'f' && c != 'g' && c != 'h' && c != 'j' && c != 'k' && c != 'l'
                        && c != 'z' && c != 'x' && c != 'c' && c != 'v' && c != 'b' && c != 'n' && c != 'm' && c != '_'
                        && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9' && c != '0'
                        && c != 'Q' && c != 'W' && c != 'E' && c != 'R' && c != 'T' && c != 'Y' && c != 'U' && c != 'I' && c != 'O' && c != 'P'
                        && c != 'A' && c != 'S' && c != 'D' && c != 'F' && c != 'G' && c != 'H' && c != 'J' && c != 'K' && c != 'L'
                        && c != 'Z' && c != 'X' && c != 'C' && c != 'V' && c != 'B' && c != 'N' && c != 'M') {
                    e.consume();

                }
            }
        });
    }

    void asignaOyente(Controlador c) {
        TipoA.addActionListener(c);
        TipoM.addActionListener(c);
        TipoC.addActionListener(c);
        Boton.addActionListener(c);
        exten.addActionListener(c);
        agrega.addActionListener(c);
        compo.addActionListener(c);

    }
}
