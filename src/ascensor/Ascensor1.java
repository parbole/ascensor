package ascensor;

import javax.swing.JOptionPane;

public class Ascensor1 {

    private int actual;
    private int total = 0;
    private int pisos = 1;
    private int sotanos = 0;

    public Ascensor1(int up, int down, int actual, int total) {
        this.actual = actual;
        this.pisos = up;
        this.sotanos = down;
        this.total = total;
    }
       
    public void setPisoSubiendo() {
        if(actual == -1){
            actual = 1;
        }
        else if (actual < pisos) {
            actual = actual + 1;
        } 
        else if(actual == pisos){
            JOptionPane.showMessageDialog(null, "Esta en el ultimo piso, no puede subir más");
        }
    }

    public void setPisoBajando() {
        int numSotanos = sotanos * -1;
        
        if (sotanos == 0 && actual == 1) {
            JOptionPane.showMessageDialog(null, "El edificio no tiene sotanos, no se puede bajar");
        }
        else if(actual == 1){
            actual = -1;
        }
        else if (actual > numSotanos) {
            actual = actual - 1;
        }
        else if(actual == numSotanos){
            JOptionPane.showMessageDialog(null, "Esta en el ultimo sotano, no puede bajar más");
        }
    }
    
    public int getPisoActual(){
        return actual;
    }
    
    public void setPisos(int pisos){
        this.pisos = pisos;
    }
    
    public void setSotanos(int sotanos){
        this.sotanos = sotanos;
    }
    
    public int getAtendidos(){
        total = pisos + sotanos;
        return total;
    }
    
}
