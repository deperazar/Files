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
public class Archivoss2 {

    
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
            
        System.out.println("exists returns "+f.exists());
        System.out.println("canRead returns "+f.canRead());
        System.out.println("length returns "+f.length());
        System.out.println("get AbsolutePath returns "+f.getAbsolutePath());
        
    }
    
}
