/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_denuarchirinos;

import javax.swing.JProgressBar;

/**
 *
 * @author Denuar
 */
public class AdministrarBarra extends Thread{
    private JProgressBar barra;
    private boolean avanzar, vive;
    private int tiempo;

   public AdministrarBarra(JProgressBar barra) {
        this.barra = barra;
        avanzar = true;
        vive = true;
//        tiempo = tiempo;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    @Override
    public void run(){
        while(vive){
            System.out.println("hola");
            if (avanzar){
                barra.setValue (barra.getValue()+1);
                if (barra.getValue()==barra.getMaximum()){
                    vive=false;
                }
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                
            }
        }
    }
}
