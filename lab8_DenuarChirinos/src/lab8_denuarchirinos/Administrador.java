/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_denuarchirinos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Denuar
 */
public class Administrador {
    private ArrayList<Hackeo> hackeos = new ArrayList();
    private File archivo = null;

    public Administrador(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hackeo> gethackeos() {
        return hackeos;
    }

    public void sethackeos(ArrayList<Hackeo> hackeos) {
        this.hackeos = hackeos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    //mutador extra:
    public void setHackeo(Hackeo h){
        this.hackeos.add(h);
    }
    
    //metodos:
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
        fw = new FileWriter(archivo,false);//"true" hace que añada a la informacion que ya tengo guardada
        bw = new BufferedWriter(fw);
        for (Hackeo h : hackeos) {
            bw.write(h.getTipo()+";");
            bw.write(h.getCodigo()+";");
            bw.write(h.getRiesgo()+";");            
        }
        bw.flush();
        }
        catch(Exception e){
            
        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo(){
        Scanner sc = null;
        hackeos=new ArrayList();
        if(archivo.exists()){
        try{
            sc=new Scanner(archivo);
            sc.useDelimiter(";");
            while(sc.hasNext()){
               hackeos.add(new Hackeo(sc.next(), sc.nextInt(), sc.nextInt()));
            }
        }
        catch(Exception e){

        }
        sc.close();
        }
    }
}
