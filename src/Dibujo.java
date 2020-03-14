
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class Dibujo extends Canvas {

    int numFilMet, numFilAtr, numCa, alto = 0, C, A, M, y;
    ArrayList<String> nomClas, atributos, metodos;
    String[] partClasH, partClas, partAtri, partMet;

    String[] partNew;
    String cant = "",cant1 = "";
             int cont = 0;
                int cont2 = 0;
    String[] partCor;
    ArrayList<String> herencia, compoagre;
    int ubicacionClas1, ubicacionClas2;

    Dibujo() {
        this.compoagre = new ArrayList<>();
        this.herencia = new ArrayList<>();
        this.nomClas = new ArrayList<>();
        this.atributos = new ArrayList<>();
        this.metodos = new ArrayList<>();
        this.numFilAtr = 0;
        this.numFilMet = 0;
        this.numCa = 0;
        setBackground(Color.WHITE);
    }

    public boolean buscarCLa(String a) {
        boolean c = false;
        for (int i = 0; i < nomClas.size(); i++) {
            partClas = nomClas.get(i).split(" ");
            if (partClas[1].equals(a)) {
                c = true;
                break;
            }
        }
        return c;
    }

    public boolean buscarCLa2(String a, String b) {
        boolean c = false;
        for (int i = 0; i < herencia.size(); i++) {
            partClas = herencia.get(i).split(" ");
            if (partClas[1].equals(a) && partClas[4].equals(b)) {
                c = true;
                break;
            }
        }
        return c;
    }

    public void buscar1(String a) {
        for (int i = 0; i < nomClas.size(); i++) {
            partClas = nomClas.get(i).split(" ");
            if (partClas[1].equals(a)) {
                ubicacionClas1 = i;
                break;
            }
        }
    }

    public void buscar2(String a) {
        for (int i = 0; i < nomClas.size(); i++) {
            partClas = nomClas.get(i).split(" ");
            if (partClas[1].equals(a)) {
                ubicacionClas2 = i;
                break;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.black);
        Line2D medidor = new Line2D.Double();
        g2.setStroke(new BasicStroke(0.5f));
        alto = 0;
        try {

            for (int j = 0; j <= nomClas.size(); j++) {
                M = 0;
                A = 0;
                partClas = nomClas.get(j).split(" ");

                if (Integer.parseInt(partClas[0]) == 1 || Integer.parseInt(partClas[0]) == 2) {
                    g2.setFont(new Font("Monospaced", Font.ITALIC, 12));
                    g2.drawString(partClas[1], 22, 24 + alto);

                } else {
                    g2.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, 12));
                    g2.drawString(partClas[1], 22, 23 + alto);
                }

                g2.drawRect(10, 10 + alto, 150, 20);
                for (int i = 0; i < atributos.size(); i++) {
                    if (atributos.size() > 0) {
                        partAtri = atributos.get(i).split(" ");
                        if (partAtri[1].equals(partClas[1])) {
                            g2.drawString(partAtri[0], 20, 43 + (A) * 20 + alto);
                            A = A + 1;
                        }
                    }
                }
                if (A == 0) {

                    A = 1;
                }
                g2.drawRect(10, 30 + alto, 150, (A) * 20);

                for (int k = 0; k < metodos.size(); k++) {
                    partMet = metodos.get(k).split(" ");
                    if (metodos.size() > 0) {
                        if (partMet[1].equals(partClas[1])) {

                            g2.drawString(partMet[0], 20, 43 + (M) * 20 + (A) * 20 + alto);
                            M = M + 1;
                        }
                    }
                }
                if (M == 0) {
                    M = 1;
                }
                g2.drawRect(10, (A) * 20 + 30 + alto, 150, M * 20);
                g.setColor(Color.red);
                medidor.setLine(10, 20 + M * 20 + 23 + (A) * 20 + alto, 150, 20 + M * 20 + 23 + (A) * 20 + alto);
                g2.draw(medidor);
                g.setColor(Color.black);
                alto = (int) medidor.getY1() + 6;
                if (nomClas.size() == j + 1) {
                    break;
                }
            }
            alto = 0;
            M=0;
            A=0;
            g.setColor(Color.red);
            g2.drawLine(170, 0, 170, 10000);
            g.setColor(Color.black);
            /////////////////////////////////////////////// //herencia 
            if (herencia.size() != 0) {
                for (int j = 0; j <= herencia.size(); j++) {
                    M = 0;
                    A = 0;

                    partClas = herencia.get(j).split(" ");
                    if (Integer.parseInt(partClas[0]) == 1 || Integer.parseInt(partClas[0]) == 2) {
                        g2.setFont(new Font("Monospaced", Font.ITALIC, 12));
                        g2.drawString(partClas[1], 202, 24 + alto);

                    } else {
                        g2.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, 12));
                        g2.drawString(partClas[1], 202, 23 + alto);
                    }

                    g2.drawRect(200, 10 + alto, 150, 20);

                    for (int i = 0; i < atributos.size(); i++) {
                        if (atributos.size() > 0) {
                            partAtri = atributos.get(i).split(" ");
                            if (partAtri[1].equals(partClas[1])) {
                                g2.drawString(partAtri[0], 202, 43 + (A) * 20 + alto);
                                A = A + 1;
                            }
                        }
                    }
                    if (A == 0) {

                        A = 1;
                    }
                    g2.drawRect(200, 30 + alto, 150, (A) * 20);

                    for (int k = 0; k < metodos.size(); k++) {
                        partMet = metodos.get(k).split(" ");
                        if (metodos.size() > 0) {
                            if (partMet[1].equals(partClas[1])) {

                                g2.drawString(partMet[0], 202, 43 + (M) * 20 + (A) * 20 + alto);
                                M = M + 1;
                            }
                        }
                    }
                    if (M == 0) {
                        M = 1;
                    }
                    g2.drawRect(200, (A) * 20 + 30 + alto, 150, M * 20);

                    partClasH = partClas[1].split("_");

                    if (partClasH[0].equals("interface")) {
                        g2.drawLine(260, 115 + (A) * 20 + alto + M * 20, 260, 110 + (A) * 20 + alto + M * 20);
                        g2.drawLine(260, 105 + (A) * 20 + alto + M * 20, 260, 100 + (A) * 20 + alto + M * 20);
                        g2.drawLine(260, 95 + (A) * 20 + alto + M * 20, 260, 90 + (A) * 20 + alto + M * 20);
                        g2.drawLine(240, 80 + (A) * 20 + alto + M * 20, 280, 80 + (A) * 20 + alto + M * 20);
                        g2.drawLine(240, 80 + (A) * 20 + alto + M * 20, 260, 60 + (A) * 20 + alto + M * 20);
                        g2.drawLine(260, 60 + (A) * 20 + alto + M * 20, 280, 80 + (A) * 20 + alto + M * 20);
                    } else {
                        g2.drawLine(260, 80 + (A) * 20 + alto + M * 20, 260, 110 + (A) * 20 + alto + M * 20);
                        g2.drawLine(240, 80 + (A) * 20 + alto + M * 20, 280, 80 + (A) * 20 + alto + M * 20);
                        g2.drawLine(240, 80 + (A) * 20 + alto + M * 20, 260, 60 + (A) * 20 + alto + M * 20);
                        g2.drawLine(260, 60 + (A) * 20 + alto + M * 20, 280, 80 + (A) * 20 + alto + M * 20);
                    }
                    
                    y = 110 + (A) * 20 + M * 20;
                    partClas = herencia.get(j).split(" ");
                    M=0;
                   A=0;
                    if (Integer.parseInt(partClas[2]) == 1 || Integer.parseInt(partClas[2]) == 2) {
                        g2.setFont(new Font("Monospaced", Font.ITALIC, 12));
                        g2.drawString(partClas[3], 202, y + 24 + alto);

                    } else {
                        g2.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, 12));
                        g2.drawString(partClas[3], 202, y + 23 + alto);
                    }
                    g2.drawRect(200, y + 10 + alto, 150, 20);
                    for (int i = 0; i < atributos.size(); i++) {
                        if (atributos.size() > 0) {
                            partAtri = atributos.get(i).split(" ");
                            if (partAtri[1].equals(partClas[3])) {
                                g2.drawString(partAtri[0], 202, y + 43 + (A) * 20 + alto);
                                A = A + 1;
                            }
                        }
                    }
                    if (A == 0) {

                        A = 1;
                    }
                    g2.drawRect(200, y + 30 + alto, 150, (A) * 20);

                    for (int k = 0; k < metodos.size(); k++) {
                        partMet = metodos.get(k).split(" ");
                        if (metodos.size() > 0) {
                            if (partMet[1].equals(partClas[3])) {

                                g2.drawString(partMet[0], 202, y + 43 + (M) * 20 + (A) * 20 + alto);
                                M = M + 1;
                            }
                        }
                    }
                    if (M == 0) {
                        M = 1;
                    }
                    g2.drawRect(200, y + (A) * 20 + 30 + alto, 150, M * 20);
                    g.setColor(Color.red);
                    medidor.setLine(210, y + 43 + (M) * 20 + (A) * 20 + alto, 340, y + 43 + (M) * 20 + (A) * 20 + alto);

                    g2.draw(medidor);
                    g.setColor(Color.black);
                    alto = (int) medidor.getY1() + 6;

                    if (herencia.size() == j + 1) {
                        break;
                    }
                    ///////////////////////////// ////////// ////////////////////////////////////////////////

                }
            }

            g.setColor(Color.red);
            g2.drawLine(355, 0, 355, 10000);
            g.setColor(Color.black);
            alto = 0;
            if (compoagre.size() != 0) {
/////////////////////////////compo agregacion 
                for (int j = 0; j <= compoagre.size(); j++) {
                    M = 0;
                    A = 0;

                    partClas = compoagre.get(j).split(" ");
                    if (Integer.parseInt(partClas[0]) == 1 || Integer.parseInt(partClas[0]) == 2) {
                        g2.setFont(new Font("Monospaced", Font.ITALIC, 12));
                        g2.drawString(partClas[1], 362, 24 + alto);

                    } else {
                        g2.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, 12));
                        g2.drawString(partClas[1], 362, 23 + alto);
                    }

                    g2.drawRect(360, 10 + alto, 150, 20);

                    for (int i = 0; i < atributos.size(); i++) {
                        if (atributos.size() > 0) {
                            partAtri = atributos.get(i).split(" ");
                            if (partAtri[1].equals(partClas[1])) {
                                g2.drawString(partAtri[0], 362, 43 + (A) * 20 + alto);
                                A = A + 1;
                            }
                        }
                    }
                    if (A == 0) {

                        A = 1;
                    }
                    g2.drawRect(360, 30 + alto, 150, (A) * 20);

                    for (int k = 0; k < metodos.size(); k++) {
                        partMet = metodos.get(k).split(" ");
                        if (metodos.size() > 0) {
                            if (partMet[1].equals(partClas[1])) {

                                g2.drawString(partMet[0], 362, 43 + (M) * 20 + (A) * 20 + alto);
                                M = M + 1;
                            }
                        }
                    }
                    if (M == 0) {
                        M = 1;
                    }
                    g2.drawRect(360, (A) * 20 + 30 + alto, 150, M * 20);

                   

                    if ("1".equals(partClas[4])) {
                         g2.drawLine(386, 40 + (A) * 20 + alto + M * 20, 386, 110 + (A) * 20 + alto + M * 20);
                        Toolkit t = Toolkit.getDefaultToolkit();
                        Image rombo;
                        rombo = t.getImage("Rombo_vacio.jpg");
                        g.drawImage(rombo, 360, 35 + (A) * 20 + alto + M * 20, this);
                    } else if ("2".equals(partClas[4])) {
                         g2.drawLine(384, 40 + (A) * 20 + alto + M * 20, 384, 110 + (A) * 20 + alto + M * 20);
                        Toolkit f = Toolkit.getDefaultToolkit();
                        Image rombo2;
                        rombo2 = f.getImage("Rombo_filled.jpg");
                        g.drawImage(rombo2, 360, 35 + (A) * 20 + alto + M * 20, this);
                    }
                    y = 110 + (A) * 20 + M * 20;
                    partClas = compoagre.get(j).split(" ");
                    M=0;
                    A=0;
                    if (Integer.parseInt(partClas[2]) == 1 || Integer.parseInt(partClas[2]) == 2) {
                        g2.setFont(new Font("Monospaced", Font.ITALIC, 12));
                        g2.drawString(partClas[3], 362, y + 24 + alto);

                    } else {
                        g2.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, 12));
                        g2.drawString(partClas[3], 362, y + 23 + alto);
                    }
                    g2.drawRect(360, y + 10 + alto, 150, 20);
                    for (int i = 0; i < atributos.size(); i++) {
                        if (atributos.size() > 0) {
                            partAtri = atributos.get(i).split(" ");
                            if (partAtri[1].equals(partClas[3])) {
                                g2.drawString(partAtri[0], 362, y + 43 + (A) * 20 + alto);
                                A = A + 1;
                            }
                        }
                    }
                    if (A == 0) {

                        A = 1;
                    }
                    g2.drawRect(360, y + 30 + alto, 150, (A) * 20);

                    for (int k = 0; k < metodos.size(); k++) {
                        partMet = metodos.get(k).split(" ");
                        if (metodos.size() > 0) {
                            if (partMet[1].equals(partClas[3])) {

                                g2.drawString(partMet[0], 362, y + 43 + (M) * 20 + (A) * 20 + alto);
                                M = M + 1;
                            }
                        }
                    }
                    if (M == 0) {
                        M = 1;
                    }
                    g2.drawRect(360, y + (A) * 20 + 30 + alto, 150, M * 20);

                    g.setColor(Color.red);
                    medidor.setLine(370, y + 43 + (M) * 20 + (A) * 20 + alto, 380, y + 43 + (M) * 20 + (A) * 20 + alto);

                    g2.draw(medidor);
                    g.setColor(Color.black);
                    alto = (int) medidor.getY1() + 6;

                    if (compoagre.size() == j + 1) {
                        break;
                    }
//                ///////////////////////////// ////////// ////////////////////////////////////////////////
                }
            }
            g.setColor(Color.red);
            g2.drawLine(550, 0, 550, 10000);
            g.setColor(Color.black);
            alto = 0;
/////////////////////////////cardinalidadde
            
            for (int j = 0; j <= compoagre.size(); j++) {
                M = 0;
                A = 0;

                partClas = compoagre.get(j).split(" ");
                if (Integer.parseInt(partClas[0]) == 1 || Integer.parseInt(partClas[0]) == 2) {
                    g2.setFont(new Font("Monospaced", Font.ITALIC, 12));
                    g2.drawString(partClas[1], 557, 24 + alto);

                } else {
                    g2.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, 12));
                    g2.drawString(partClas[1], 557, 23 + alto);
                }

                g2.drawRect(555, 10 + alto, 150, 20);

               

                for (int i = 0; i < atributos.size(); i++) {
                    if (atributos.size() > 0) {
                        partAtri = atributos.get(i).split(" ");
                        if (partAtri[1].equals(partClas[1])) {
                            g2.drawString(partAtri[0], 557, 43 + (A) * 20 + alto);
                            A = A + 1;

                            if (partAtri[2].equals("2")) {
                                cont=cont+1;
                            }

                            if (partAtri[2].equals("1")) {
                                cont = 2;
                            }

                        }
                    }
                }
                if (cont > 1) {
                    cant = "*";
                } else if (cont == 1) {
                    cant = "1";
                } else if (cont == 0) {
                    cant = "0";
                }

                if (A == 0) {

                    A = 1;
                }
                g2.drawRect(555, 30 + alto, 150, (A) * 20);

                for (int k = 0; k < metodos.size(); k++) {
                    partMet = metodos.get(k).split(" ");
                    if (metodos.size() > 0) {
                        if (partMet[1].equals(partClas[1])) {

                            g2.drawString(partMet[0], 557, 43 + (M) * 20 + (A) * 20 + alto);
                            M = M + 1;
                        }
                    }
                }
                if (M == 0) {
                    M = 1;
                }
                g2.drawRect(555, (A) * 20 + 30 + alto, 150, M * 20);
                //LINEA--------
                g2.drawString(cant, 610,  40 + (A) * 20 + alto + M * 20);
                g2.drawLine(600, 40 + (A) * 20 + alto + M * 20, 600, 110 + (A) * 20 + alto + M * 20);
                 g2.drawString(cant1, 610,110 + (A) * 20 + alto + M * 20);
                //-------------
                y = 110 + (A) * 20 + M * 20;
                M = 0;
                A = 0;
                partClas = compoagre.get(j).split(" ");
                if (Integer.parseInt(partClas[2]) == 1 || Integer.parseInt(partClas[2]) == 2) {
                    g2.setFont(new Font("Monospaced", Font.ITALIC, 12));
                    g2.drawString(partClas[3], 557, y + 24 + alto);

                } else {
                    g2.setFont(new Font("Monospaced", Font.ROMAN_BASELINE, 12));
                    g2.drawString(partClas[3], 557, y + 23 + alto);
                }
                g2.drawRect(555, y + 10 + alto, 150, 20);
                for (int i = 0; i < atributos.size(); i++) {
                    if (atributos.size() > 0) {
                        partAtri = atributos.get(i).split(" ");
                        if (partAtri[1].equals(partClas[3])) {
                            g2.drawString(partAtri[0], 557, y + 43 + (A) * 20 + alto);
                            A = A + 1;
                                  if (partAtri[2].equals("2")) {
                                cont2=cont2+1;
                            }

                            if (partAtri[2].equals("1")) {
                                cont2 = 2;
                            }
                        }
                    }
                }
                 if (cont2 > 1) {
                    cant1 = "*";
                } else if (cont2 == 1) {
                    cant = "1";
                } else if (cont2 == 0) {
                    cant1 = "0";
                }
                
               
                if (A == 0) {

                    A = 1;
                }
                g2.drawRect(555, y + 30 + alto, 150, (A) * 20);

                for (int k = 0; k < metodos.size(); k++) {
                    partMet = metodos.get(k).split(" ");
                    if (metodos.size() > 0) {
                        if (partMet[1].equals(partClas[3])) {

                            g2.drawString(partMet[0], 557, y + 43 + (M) * 20 + (A) * 20 + alto);
                            M = M + 1;
                      
                        }
                    }
                }
                if (M == 0) {
                    M = 1;
                }
                g2.drawRect(555, y + (A) * 20 + 30 + alto, 150, M * 20);

                g.setColor(Color.red);
                medidor.setLine(557, y + 43 + (M) * 20 + (A) * 20 + alto, 632, y + 43 + (M) * 20 + (A) * 20 + alto);

                g2.draw(medidor);
                g.setColor(Color.black);
                alto = (int) medidor.getY1() + 6;
                  cont = 0;
                 cont2 = 0;
                if (compoagre.size() == j + 1) {
                    break;
                }
//                ///////////////////////////// ////////// ////////////////////////////////////////////////
            }
//////////////////////////////////////////////////
        } catch (IndexOutOfBoundsException r) {
        }
    }

}
