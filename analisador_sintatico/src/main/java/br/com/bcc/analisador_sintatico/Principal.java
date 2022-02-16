/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bcc.analisador_sintatico;

import javax.swing.JFileChooser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author macbook
 */
public class Principal {
    public static void main(String[] args){
        String caminho = "";
        JFileChooser fc = new JFileChooser();
        int retorno = fc.showOpenDialog(null);
        if(retorno == JFileChooser.APPROVE_OPTION){
            caminho = fc.getSelectedFile().getAbsolutePath();
            System.out.println(caminho);
        }
        
        CharStream cs = CharStreams.fromFileName(caminho);
        BccLexer lexer = new BccLexer(cs);
        
        //Apresentar um depurador lexico
        
        //fluxo de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // inicializar o parser(analise) dos tokens oriundos do lexer
        BccParser parser = new BccParser(tokens);
        
        //analiser descendente percorrendo a arvore(começa pelo simbolo inicial e percorre a arvore)
        
        parser.programa();
    }
}































