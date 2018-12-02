
package net.juanxxiii.ejemplomonitores;


public class Ejecutador {
    private int numero=0;
    private Object candado;
    public static void main(String[] args) {
        Ejecutador e = new Ejecutador();
        e.iniciarSuma();
    }
    private void iniciarSuma(){
        candado = new Object();
        for(int i=0;i<100;i++){
            new Contador(this).start();
        }
    }
    public void suma(){
        synchronized(candado){
            numero++;
        }
    }
    public void muestraParcial(){
        System.out.println("Parcial:" + numero);
    }
}
