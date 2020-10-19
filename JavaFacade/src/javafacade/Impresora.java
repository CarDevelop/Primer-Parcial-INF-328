/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafacade;

/**
 *
 * @author 59165
 */
public class Impresora {
    private String tipodocumento;
    private String hoja;
    private String texto;

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getHoja() {
        return hoja;
    }

    public void setHoja(String hoja) {
        this.hoja = hoja;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void imprimirdocumento(){
    System.out.print("tipo de documento "+tipodocumento+" Tipo de hoja "+hoja+" con el texto "+texto);
    
            }
}
