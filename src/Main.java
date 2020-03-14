
/**
 *
 * @author (╯°□°)╯︵ ┻━┻
 */
public class Main {

    public static void main(String[] args) {
        Dibujo dib = new Dibujo();
        Vista vis = new Vista();
        Controlador contr = new Controlador(vis, dib);
        vis.asignaOyente(contr);
        vis.mostrar();
    }
}
