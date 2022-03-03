/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author xXSorzXx
 */
public class Circula extends Calculo{
    float radio;
    
    public float area(float radio){
        float area = (float) (2 * 3.1416 * radio);
        return area;
    }
    
    public float perimetro(float radio){
        float perimetro = (float) (2 * 3.1416 * radio);
        return perimetro;
    }
    
    public float volumen(float radio){
        float volumen = (float) ((4/3) * 3.1416 * (radio * radio * radio));
        return volumen;
    } 
}
