/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

/**
 *
 * @author Estudiantes
 */
public class Cuadrado extends FiguraGeometrica{
    
    private float lado;
    float area;
    float perimetro;

    @Override
    float calcularArea() {
        
        area=lado*lado;
        return area;
        
        
    }

    @Override
    float calcularPerimetro() {
        
        perimetro=4*lado;
        return perimetro;
        
    }

    void setlado(float entrada) {
    }
    
}
