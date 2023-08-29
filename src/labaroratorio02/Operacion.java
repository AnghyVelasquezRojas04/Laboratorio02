/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labaroratorio02;

/**
 *
 * @author anghy
 */
public class Operacion {
    
    private float elemen1;
    private float elemen2;

    public Operacion(float elemen1, float elemen2) {
        this.elemen1 = elemen1;
        this.elemen2 = elemen2;
    }
    
    /**
     * @return the elemen1
     */
    public float getElemen1() {
        return elemen1;
    }

    /**
     * @param elemen1 the elemen1 to set
     */
    public void setElemen1(float elemen1) {
        this.elemen1 = elemen1;
    }

    /**
     * @return the elemen2
     */
    public float getElemen2() {
        return elemen2;
    }

    /**
     * @param elemen2 the elemen2 to set
     */
    public void setElemen2(float elemen2) {
        this.elemen2 = elemen2;
    }
    
    public float sumar(){
        return this.elemen1 + this.elemen2;
    }
    
    public float restar(){
        return this.elemen1 - this.elemen2;
    }
    
    public float multiplicar(){
        return this.elemen1 * this.elemen2;
    }
    
    public float dividir(){
        return this.elemen1 / this.elemen2;
    }
}                                                     
