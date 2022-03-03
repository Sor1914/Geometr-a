/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import java.util.Scanner;

/**
 *
 * @author xXSorzXx
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op = 0;
        int op2 = 0;
        float altura;
        float base;
        Cuadrado cuadro = new Cuadrado();
        Triangulo triangulo = new Triangulo();
        Circula circulo = new Circula();
        
        System.out.println("************************************************");
        System.out.println("***********Familiar de Geometría :v*************");
        System.out.println("************************************************");
        while (op != 4){
            System.out.println("Seleccione un tipo de figura");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Salir");
            op = in.nextInt();
            in.nextLine();
            switch (op){
                case 1:
                    System.out.println("*Cuadrado*");
                    System.out.println("1. Calcular Área");
                    System.out.println("2. Calcular Perimetro");
                    System.out.println("3. Calcular Volumen");
                    System.out.println("4. Regresar");
                    op2 = in.nextInt();
                    in.nextLine();
                    switch (op2){
                        case 1:
                            System.out.println("Ingrese la Altura");
                            altura = in.nextFloat();
                            in.nextLine();
                            System.out.print("El área es: ");
                            System.out.println(cuadro.area(altura));
                            break;
                        case 2:
                            System.out.println("Ingrese la Altura");
                            altura = in.nextFloat();
                            in.nextLine();
                            System.out.print("El perimetro es: ");
                            System.out.println(cuadro.perimetro(altura));
                            break;
                        case 3:
                            System.out.println("Ingrese la Altura");
                            altura = in.nextFloat();
                            in.nextLine();
                            System.out.print("El volumen es: ");
                            System.out.println(cuadro.volumen(altura));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("*Triángulo*");
                    System.out.println("1. Calcular Área");
                    System.out.println("2. Calcular Perimetro");
                    System.out.println("3. Calcular Volumen");
                    System.out.println("4. Regresar");
                    op2 = in.nextInt();
                    in.nextLine();
                    switch (op2){
                        case 1:
                            System.out.println("Ingrese la Altura");
                            altura = in.nextFloat();
                            in.nextLine();
                            System.out.println("Ingrese la Base");
                            base = in.nextFloat();
                            in.nextLine();
                            System.out.print("El área es: ");
                            System.out.println(triangulo.area(altura, base));
                            break;
                        case 2:
                            System.out.println("Ingrese la Altura");
                            altura = in.nextFloat();
                            in.nextLine();
                            System.out.print("El perimetro es: ");
                            System.out.println(triangulo.perimetro(altura));
                            break;
                        case 3:
                            System.out.println("Ingrese la Altura");
                            altura = in.nextFloat();
                            in.nextLine();
                            System.out.println("Ingrese la Base");
                            base = in.nextFloat();
                            in.nextLine();
                            System.out.print("El volumen es: ");
                            System.out.println(triangulo.area(altura, base));
                            break;
                        }
                    break;
                case 3:
                    System.out.println("*Circulo");
                    System.out.println("1. Calcular Área");
                    System.out.println("2. Calcular Perimetro");
                    System.out.println("3. Calcular Volumen");
                    System.out.println("4. Regresar");
                    op2 = in.nextInt();
                    in.nextLine();
                    switch (op2){
                        case 1:
                            System.out.println("Ingrese el radio");
                            altura = in.nextFloat();
                            in.nextLine();
                            System.out.print("El área es: ");
                            System.out.println(circulo.area(altura));
                            break;
                        case 2:
                            System.out.println("Ingrese el radio");
                            altura = in.nextFloat();
                            in.nextLine();
                            System.out.print("El perimetro es: ");
                            System.out.println(circulo.perimetro(altura));
                            break;
                        case 3:
                            System.out.println("Ingrese el radio");
                            altura = in.nextFloat();
                            in.nextLine();
                            System.out.print("El volumen es: ");
                            System.out.println(circulo.area(altura));
                            break;
                        }
                    break;
                 
            }
        }
        
    }
    
}
