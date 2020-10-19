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
public class Fachada {
    private Impresora impresora;
    public Fachada(String texto){
        super();
        impresora =new Impresora();
        impresora.setTexto("");
        impresora.setHoja("carta");
        impresora.setTipodocumento("PDF");
        
    }
    public void imprimir(){
        impresora.imprimirdocumento();
    }
    
}
