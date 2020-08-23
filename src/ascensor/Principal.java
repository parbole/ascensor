package ascensor;
import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
       int build = 0;
       int down = 0; 
       int actual = 1;
       int lugar = 0;
       int total = 0;
       
       String bld = JOptionPane.showInputDialog("¿Cuantos pisos tiene el edificio?");
       build = Integer.parseInt(bld);
       String dw = JOptionPane.showInputDialog("¿Cuanto sotanos tiene el edificio?");
       down = Integer.parseInt(dw);
       String place = JOptionPane.showInputDialog("Oprime 1 para subir y 2 para bajar");
       lugar = Integer.parseInt(place);

       Ascensor1 metodos = new Ascensor1(build, down, actual, lugar, total);
       if (lugar == 1){
           metodos.subir();
       } else if (lugar == 2){
           metodos.bajar();
       }
       String tl = JOptionPane.showInputDialog("Para saber cuantos pisos en total atiende el ascensor oprime 1");
       total = Integer.parseInt(tl);
       if (total == 1){
           metodos.atendidos();
       }
    }
    
}
