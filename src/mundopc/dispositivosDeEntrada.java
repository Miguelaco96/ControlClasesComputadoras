/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundopc;

/**
 *
 * @author tester
 */
public class dispositivosDeEntrada {
    
    private String tipoEntrada;
    private String marca;
    
    public dispositivosDeEntrada(String tipoEntrada,String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "dispositivosDeEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
    
}
