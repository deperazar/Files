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
public class Archivoss {

    
    public static void main(String[] args) {
        File f= new File("ioi");
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
            while(lectura.hasNext()){
                System.out.println(lectura.next());
                
            }
            lectura.close();
         }
        catch(FileNotFoundException e){
        }
       
    }
    
}
