/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Triangulo {
    
   private Punto[] punto1;
   private Punto[] punto2;
   private Punto[] punto3;
   private Color[] relleno;
   private Color[] linea;

    public Punto[] getPunto1() {
        return punto1;
    }

    public Punto[] getPunto2() {
        return punto2;
    }

    public Punto[] getPunto3() {
        return punto3;
    }

    public Color[] getRelleno() {
        return relleno;
    }

    public Color[] getLinea() {
        return linea;
    }

    public void setPunto1(Punto[] punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(Punto[] punto2) {
        this.punto2 = punto2;
    }

    public void setPunto3(Punto[] punto3) {
        this.punto3 = punto3;
    }

    public void setRelleno(Color[] relleno) {
        this.relleno = relleno;
    }

    public void setLinea(Color[] linea) {
        this.linea = linea;
    }
   
   
   
    
}
