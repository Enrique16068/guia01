/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia1;

/**
 *
 * @author usuario
 */

public class Utilities {

    public String getResumen(String texto){
        String cadena="";
        char letra;
        
            cadena=cadena+texto.substring(0, 29);
        
        return "primeras 30 letras son:"+ cadena;
    }
    
    public String capitalizar(String texto){
        char letra;
        String titulo="";
        String cadena;
        int dimension;
        dimension=texto.length();
        for(int inicio=0;inicio<dimension;inicio++){
            letra=texto.charAt(inicio);
            cadena=""+letra;
            if(inicio==0){
             titulo=titulo+cadena.toUpperCase();
            }else if(cadena.equalsIgnoreCase(" ")){
                letra=texto.charAt(inicio+1);
                inicio++;
                cadena=" "+letra;
                titulo=titulo+cadena.toUpperCase();
            }else{
                titulo=titulo+cadena;
            }
            
        }    
        
        return titulo;
    }
    
    public int contarCoincidencias(String frase, String texto){
        
        return 0;
    }
    
}
