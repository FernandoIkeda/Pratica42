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
public class Circulo extends Elipse {
    private double raio;
    
    public Circulo(double raio) {
        super(raio, raio);
        this.raio = raio;
    }
    
    @Override
    public double getArea() {
        double area;
        
        area = super.getArea();
        
        return area;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getPerimetro() {
        double perimetro;
        
        perimetro = 2*Math.PI*raio;
        
        return perimetro;
    }
}