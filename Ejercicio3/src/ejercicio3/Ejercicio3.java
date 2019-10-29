/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author poo02alu32
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File f1=new File("/Users/poo02alu32/desktop/Ejercicio3/source.txt");
        File f2=new File("/Users/poo02alu32/desktop/Ejercicio3/destination.txt");
        CopyFileSample.copy(f1, f2);
    }
    
}
