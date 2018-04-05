/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altraductor;

import java.io.File;

/**
 *
 * @author betio_000
 */
public class ALTraductor {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String path = "C:/Users/ShellPhish/Documents/PROJECTS/altraductor/src/altraductor/Lexer.flex"; //"C:/Users/betio_000/Documents/NetBeansProjects/ALTraductor/src/altraductor/Lexer.flex";
        generarLexer(path);
    }
    
    public static void generarLexer(String path){
         File file = new File(path);
         jflex.Main.generate(file);
    }
}
