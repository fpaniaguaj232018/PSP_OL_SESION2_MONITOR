package net.juanxxiii.ejemplomonitores;


public class Contador extends Thread {

    Ejecutador e;
    public Contador(Ejecutador _e){
        this.e = _e;
    }
    
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            e.suma();
        }
        e.muestraParcial();
    }
    
}
