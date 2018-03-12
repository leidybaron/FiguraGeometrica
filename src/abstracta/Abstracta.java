/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Abstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miEscaner = new Scanner(System.in);
        float entrada;
        
        Rectangulo miRectangulo=new Rectangulo();
        Triangulo miTriangulo=new Triangulo();
        Cuadrado miCuadrado=new Cuadrado(); 
        
        
        
        System.out.println("Ingrese la medida del lado mas largo del rectangulo");
        entrada=miEscaner.nextFloat();
        miRectangulo.setLado1(entrada);
        System.out.println("Ingrese la medida del lado mas corto del rectangulo");
        entrada=miEscaner.nextFloat();
        miRectangulo.setLado2(entrada);
        System.out.println("El perimetro del rectangulo es");
        System.out.println(miRectangulo.calcularPerimetro());
        System.out.println("El area del rectangulo es");
        System.out.println(miRectangulo.calcularArea());
        
        
        System.out.println("Ingrese la medida del lado");
        entrada=miEscaner.nextFloat();
        miCuadrado.setlado(entrada);
        System.out.println("El perimetro del cuadrado es");
        System.out.println(miCuadrado.calcularPerimetro());
        System.out.println("El area del cuadrado es");
        System.out.println(miCuadrado.calcularArea());
        
        
        System.out.println("Ingrese la base del triangulo");
        entrada=miEscaner.nextFloat();
        miTriangulo.setBase(entrada);
        System.out.println("Ingrese la altura del triangulo");
        entrada=miEscaner.nextFloat();
        miTriangulo.setAltura(entrada);
        System.out.println("El perimetro del triangulo es");
        System.out.println(miTriangulo.calcularPerimetro());
        System.out.println("El area del triangulo es");
        System.out.println(miTriangulo.calcularArea());
        
        
    }
    
}
