/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_denuarchirinos;

/**
 *
 * @author Denuar
 */
public class Hackeo {
    private String tipo;
    private int codigo, riesgo;

    public Hackeo() {
    }

    public Hackeo(String tipo, int codigo, int riesgo) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.riesgo = riesgo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    @Override
    public String toString() {
        return "Hackeo{" + "tipo=" + tipo + ", codigo=" + codigo + ", riesgo=" + riesgo + '}';
    }
    
}
