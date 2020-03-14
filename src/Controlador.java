
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
///Hasmap

/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class Controlador implements ActionListener {

    Vista vis = new Vista();

    Dibujo dib = new Dibujo();
    boolean v = true, v3 = false;
    int B = 0, pala = 0;
       
    public Controlador(Vista vis, Dibujo dib) {
        this.vis = vis;
        this.dib = dib;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (Character.isDigit(vis.inClas.getText().charAt(0))) {
                vis.inClas.setText("");
                JOptionPane.showMessageDialog(null, "para iniciar con un digito por favor poner _ al inicio");

            }
            if (vis.TipoC.getSelectedIndex() == 1 && vis.inClas.getText().length() != 0 && vis.inClas.getText().length() <= 15) {

                if (vis.panelDib.c.buscarCLa(vis.inClas.getText()) == true) {
                    JOptionPane.showMessageDialog(null, " Esa clase ya existe o  nombre no valido ");
                    vis.TipoC.setSelectedIndex(0);
                }
                if (!Character.isDigit(vis.inClas.getText().charAt(0)) && vis.panelDib.c.buscarCLa(vis.inClas.getText()) == false) {

                    vis.panelDib.c.nomClas.add("1 " + vis.inClas.getText());
                    vis.TipoC.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, " La clase abstracta " + vis.inClas.getText() + " ha sido agregada");
                    vis.TipoE.addItem(vis.inClas.getText());
                    vis.exten.setEnabled(false);
                }
                if (Character.isDigit(vis.inClas.getText().charAt(0))) {
                    vis.inClas.setText("");
                    JOptionPane.showMessageDialog(null, "para iniciar con un digito por favor poner _ al inicio");

                }

            }
            if (vis.TipoC.getSelectedIndex() == 2 && vis.inClas.getText().length() != 0 && vis.inClas.getText().length() <= 15) {
                if (vis.panelDib.c.buscarCLa("interface_" + vis.inClas.getText()) == true) {
                    JOptionPane.showMessageDialog(null, " Esa clase ya existe o  nombre no valido ");
                    vis.TipoC.setSelectedIndex(0);
                }
                if (!Character.isDigit(vis.inClas.getText().charAt(0)) && vis.panelDib.c.buscarCLa(vis.inClas.getText()) == false) {
                    vis.panelDib.c.nomClas.add("2 " + "interface_" + vis.inClas.getText());
                    vis.inClas.setText("interface_" + vis.inClas.getText());
                    vis.TipoC.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, " La interfaz " + vis.inClas.getText() + " ha sido agregada");
                    vis.TipoE.addItem(vis.inClas.getText());
                    vis.exten.setEnabled(false);
                }
                if (Character.isDigit(vis.inClas.getText().charAt(0))) {
                    vis.inClas.setText("");
                    JOptionPane.showMessageDialog(null, "para iniciar con un digito por favor poner _ al inicio");

                }

            }
            if (vis.TipoC.getSelectedIndex() == 3 && vis.inClas.getText().length() != 0 && vis.inClas.getText().length() <= 15) {
                if (vis.panelDib.c.buscarCLa(vis.inClas.getText()) == true) {
                    JOptionPane.showMessageDialog(null, " Esa clase ya existe o  nombre no valido ");
                    vis.TipoC.setSelectedIndex(0);
                }
                if (!Character.isDigit(vis.inClas.getText().charAt(0)) && vis.panelDib.c.buscarCLa(vis.inClas.getText()) == false) {
                    vis.panelDib.c.nomClas.add("3 " + vis.inClas.getText());

                    vis.TipoC.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, " La clase " + vis.inClas.getText() + " ha sido agregada");
                    vis.TipoE.addItem(vis.inClas.getText());
                    vis.exten.setEnabled(true);
                }
                if (Character.isDigit(vis.inClas.getText().charAt(0))) {
                    vis.inClas.setText("");
                    JOptionPane.showMessageDialog(null, "para iniciar con un digito por favor poner _ al inicio");

                }

            }

            if (vis.TipoA.getSelectedIndex() == 1 && vis.inAtr.getText().length() != 0 && vis.inClas.getText().length() <= 15) {
                if (!Character.isDigit(vis.inAtr.getText().charAt(0))) {
                    vis.panelDib.c.atributos.add("+" + vis.inAtr.getText() + " " + vis.inClas.getText()+" "+0);
                    vis.TipoA.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, " Atributo " + vis.inAtr.getText() + " ha sido agregado");
                    vis.inAtr.setText("");
                }
                if (Character.isDigit(vis.inAtr.getText().charAt(0))) {
                    vis.inAtr.setText("");
                    JOptionPane.showMessageDialog(null, "para iniciar con un digito por favor poner _ al inicio");

                }

            }
            if (vis.TipoA.getSelectedIndex() == 2 && vis.inAtr.getText().length() != 0 && vis.inClas.getText().length() <= 15) {
                if (!Character.isDigit(vis.inAtr.getText().charAt(0))) {
                    vis.panelDib.c.atributos.add("-" + vis.inAtr.getText() + " " + vis.inClas.getText()+" "+0);
                    vis.TipoA.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, " Atributo " + vis.inAtr.getText() + " ha sido agregado");
                    vis.inAtr.setText("");
                }
                if (Character.isDigit(vis.inAtr.getText().charAt(0))) {
                    vis.inAtr.setText("");
                    JOptionPane.showMessageDialog(null, "para iniciar con un digito por favor poner _ al inicio");
                }

            }
            if (vis.TipoA.getSelectedIndex() == 3 && vis.inAtr.getText().length() != 0 && vis.inClas.getText().length() <= 15) {
                if (!Character.isDigit(vis.inAtr.getText().charAt(0))) {
                    vis.panelDib.c.atributos.add("#" + vis.inAtr.getText() + " " + vis.inClas.getText()+" "+0);
                    vis.TipoA.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, " Atributo " + vis.inAtr.getText() + " ha sido agregado");
                    vis.inAtr.setText("");
                }
                if (Character.isDigit(vis.inAtr.getText().charAt(0))) {
                    vis.inAtr.setText("");
                    JOptionPane.showMessageDialog(null, "para iniciar con un digito por favor poner _ al inicio");
                }
            }

            if (vis.TipoM.getSelectedIndex() == 1 && vis.inMet.getText().length() != 0 && vis.inClas.getText().length() <= 15) {
                if (!Character.isDigit(vis.inMet.getText().charAt(0))) {
                    vis.panelDib.c.metodos.add("+" + vis.inMet.getText().trim() + "() " + vis.inClas.getText().trim());
                    vis.TipoM.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, " Atributo " + vis.inMet.getText() + " ha sido agregado");
                    vis.inMet.setText("");
                }
                if (Character.isDigit(vis.inMet.getText().charAt(0))) {
                    vis.inMet.setText("");
                    JOptionPane.showMessageDialog(null, "para iniciar con un digito por favor poner _ al inicio");
                }
            }
            if (vis.TipoM.getSelectedIndex() == 2 && vis.inMet.getText().length() != 0 && vis.inClas.getText().length() <= 15) {
                if (!Character.isDigit(vis.inMet.getText().charAt(0))) {
                    vis.panelDib.c.metodos.add("-" + vis.inMet.getText().trim() + "() " + vis.inClas.getText().trim());
                    vis.TipoM.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, " Atributo " + vis.inMet.getText() + " ha sido agregado");
                    vis.inMet.setText("");
                }
                if (Character.isDigit(vis.inMet.getText().charAt(0))) {
                    vis.inMet.setText("");
                }
            }
            if (vis.TipoM.getSelectedIndex() == 3 && vis.inMet.getText().length() != 0 && vis.inClas.getText().length() <= 15) {
                if (!Character.isDigit(vis.inMet.getText().charAt(0))) {
                    vis.panelDib.c.metodos.add("#" + vis.inMet.getText().trim() + "() " + vis.inClas.getText().trim());
                    vis.TipoM.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, " Atributo " + vis.inMet.getText() + " ha sido agregado");
                    vis.inMet.setText("");
                }
                if (Character.isDigit(vis.inMet.getText().charAt(0))) {
                    vis.inMet.setText("");
                }
            } else {
                vis.TipoM.setSelectedIndex(0);
                vis.TipoA.setSelectedIndex(0);
                vis.TipoC.setSelectedIndex(0);
            }

            if (e.getSource().equals(vis.Boton)) {
                vis.inClas.setText("");
                 System.out.println(vis.panelDib.c.atributos);
                     System.out.println(vis.panelDib.c.herencia);
                vis.panelDib.c.repaint();

            }
            if (e.getSource().equals(vis.exten)) {
                int a = 0;
                if (vis.TipoE.getSelectedItem().equals(vis.inClas.getText())) {
                    JOptionPane.showMessageDialog(null, "Intente con otra clase ");
                    a = 0;
                }
                else {
                    a = 1;
                }
                if (a == 1) {
                    
                    vis.panelDib.c.buscar1(vis.TipoE.getSelectedItem().toString());
                     vis.panelDib.c.buscar2(vis.inClas.getText());
                    vis.panelDib.c.herencia.add(vis.panelDib.c.nomClas.get(vis.panelDib.c.ubicacionClas1)+" "+vis.panelDib.c.nomClas.get(vis.panelDib.c.ubicacionClas2) );
                     
                }
               
            }
  if (e.getSource().equals(vis.agrega)) {
                int a = 0;
                if (vis.TipoE.getSelectedItem().equals(vis.inClas.getText())) {
                    JOptionPane.showMessageDialog(null, "Intente con otra clase ");
                    a = 0;
                }
                else {
                    a = 1;
                }
                if (a == 1) {
                    
                    vis.panelDib.c.buscar1(vis.TipoE.getSelectedItem().toString());
                     vis.panelDib.c.buscar2(vis.inClas.getText());
                    vis.panelDib.c.compoagre.add(vis.panelDib.c.nomClas.get(vis.panelDib.c.ubicacionClas2)+" "+vis.panelDib.c.nomClas.get(vis.panelDib.c.ubicacionClas1)+" "+1 );
                     vis.panelDib.c.atributos.add("new_"+vis.TipoE.getSelectedItem()+"[] "+vis.inClas.getText()+" "+1);
                   
                    
                }
               
            }
   if (e.getSource().equals(vis.compo)) {
                int a = 0;
                if (vis.TipoE.getSelectedItem().equals(vis.inClas.getText())) {
                    JOptionPane.showMessageDialog(null, "Intente con otra clase ");
                    a = 0;
                }
                else {
                    a = 1;
                }
                if (a == 1) {
                    
                    vis.panelDib.c.buscar1(vis.TipoE.getSelectedItem().toString());
                     vis.panelDib.c.buscar2(vis.inClas.getText());
                    vis.panelDib.c.compoagre.add(vis.panelDib.c.nomClas.get(vis.panelDib.c.ubicacionClas2)+" "+vis.panelDib.c.nomClas.get(vis.panelDib.c.ubicacionClas1)+" "+2);
                     vis.panelDib.c.atributos.add("new_"+vis.TipoE.getSelectedItem()+" "+vis.inClas.getText()+" "+2);
                 
                    
                }
               
            }
            v = false;

        } catch (StringIndexOutOfBoundsException rf) {

        }

    }

}
