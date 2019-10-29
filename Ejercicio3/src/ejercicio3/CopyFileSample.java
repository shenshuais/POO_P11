/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author poo02alu32
 */
public class CopyFileSample {
    public static void copy(File source, File destination) throws IOException{
        try(InputStream in = new FileInputStream(source); OutputStream out=new FileOutputStream(destination)){
            int b;
            while((b=in.read())!=-1){
                out.write(b);
            }
        }
    }
}
