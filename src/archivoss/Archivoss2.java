/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoss;

/**
 *
 * @author Estudiante
 */

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Archivoss2 {

    
    public static void main(String[] args) {
        File f= new File("ioi");
        PrintStream escritura = null;
        if(!f.exists()){
            try{
            f.createNewFile();
            }
            catch(IOException ex){
                System.out.println("No es posible crear el archivo");
            }
        }
        
        try{
            Scanner lectura=new Scanner (f); 
            lectura.useDelimiter(",");
            while(lectura.hasNext()){
                System.out.println(lectura.next());
                
            }
            lectura.close();
         }
        catch(FileNotFoundException e){
        }
        
        
        try {
            escritura = new PrintStream(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivoss2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        escritura.println("Hellow");
        Scanner leer;
        try {
            leer = new Scanner (f);
            while(leer.hasNext()){
            System.out.println(leer.next());
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivoss2.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    
}
