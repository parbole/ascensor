package ascensor;

import javax.swing.JOptionPane;

public class Ascensor1 {

    private int build, down, actual, lugar;
    private int piso = 1;
    private int total = 0;

    public Ascensor1(int build, int down, int actual, int lugar, int total) {
        this.actual = actual;
        this.build = build;
        this.down = down;
        this.lugar = lugar;
        this.total = total;
    }

    public void subir() {
        String ps = JOptionPane.showInputDialog("Estas en el piso " + actual + " selecciona el piso al que deseas subir");
        piso = Integer.parseInt(ps);
        if (piso <= build) {
            actual += piso - 1;
            JOptionPane.showMessageDialog(null, "Ahora estas en el piso " + actual);
        } else {
            JOptionPane.showMessageDialog(null, "Este piso no existe");
        }
    }

    public void bajar() {
        String ps = JOptionPane.showInputDialog("Estas en el piso " + actual + " selecciona el piso al que deseas bajar");
        piso = Integer.parseInt(ps);
        if (piso <= build) {
            actual += piso - 1;
            JOptionPane.showMessageDialog(null, "Ahora estas en el sotano " + actual);
        } else {
            JOptionPane.showMessageDialog(null, "Este piso no existe");
        }
    }
    
    public void atendidos(){
        total = build + down;
        JOptionPane.showMessageDialog(null, "El total de pisos que atiende el ascensor es " + total);
    }
}
