/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Fernando
 */
public class Elipse implements FiguraComEixos {
    private double r;
    private double s;
    
    public Elipse(double r, double s) {
        this.r = r*2;
        this.s = s*2;
    }
    
    @Override
    public double getEixoMaior() {
        return r;
    }

    @Override
    public double getEixoMenor() {
        return s;
    }

    @Override
    public double getPerimetro() {
        double perimetro;
        perimetro = Math.PI*(3*((s/2)+(r/2)) - Math.sqrt((3*(s/2)+(r/2)) + ((s/2)+3*(r/2))));
        
        return perimetro;
    }

    @Override
    public double getArea() {
        double area;
        area = Math.PI*(s/2)*(r/2);
        
        return area;
    }

    
}