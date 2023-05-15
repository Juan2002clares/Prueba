/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemplo;

import java.io.*;

/**
 *
 * @author daw
 */
public class Ejemplo {

    public static void main(String[] args) {

       BufferedInputStream binput=null;
       BufferedOutputStream boutput = null;
       
        try {
            
            byte[] edades = {18, 34, 56, 23, 43};
            File f = new File("ficheros/texto.dat");
            f.createNewFile();
            boutput = new BufferedOutputStream(new FileOutputStream(f));
            //Pasarle el array de golpe
            boutput.write(edades);
            boutput.flush();
        } catch (FileNotFoundException ex1) {
            System.out.println("Error 1");
        } catch (IOException ex) {
            System.out.println("Error 2");
        }
        
        try{
           BufferedInputStream fin = new BufferedInputStream(new FileInputStream("hola"));
            System.out.println(fin.read());
        }catch(FileNotFoundException ex2){
            System.out.println("Error 3");
        }catch (IOException ex) {
            System.out.println("Error 4");
        }
    }
}
