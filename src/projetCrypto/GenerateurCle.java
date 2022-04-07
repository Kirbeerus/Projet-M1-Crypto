/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetCrypto;

import java.util.ArrayList;

/**
 *
 * @author yd175371
 */
public class GenerateurCle {
    
    private String seed; // the seed
    private int t; // the tap
    private int n; // length of seed
    private String generer;

    public GenerateurCle() {
        this.seed = "11010111001001111";
        this.t = 17;
	this.n = this.seed.length();  
        generer = seed;
    }

    public int step() {
        byte a = new Integer(Character.getNumericValue(generer.charAt(n-5))).byteValue();
        byte b = new Integer(Character.getNumericValue(generer.charAt(n-6))).byteValue();
        byte c = new Integer(Character.getNumericValue(generer.charAt(n-15))).byteValue();
        byte d = new Integer(Character.getNumericValue(generer.charAt(n-16))).byteValue();
        if ((a ^ b ^ c ^ d) == 0) {
            this.generer = generer.substring(1);
            generer = generer + "0";
            return 0;
        } else {
            generer = generer.substring(1);
            generer = generer + "1";
            return 1;
	}  
    }

    public String generate(int k) {
        generer = seed;
        String var = "";
        for (int i = 0; i < k; i++) {
            var += step(); 
	}
	return var;
    }
    
    // returns string representation of the LFSR
    public String toString() {
	return seed;
    }
    
    public Byte crypteUnByte(Byte message){
                
        String clegenerer = generate(8); 
        byte cle = (byte)Long.parseLong(clegenerer, 2);
        byte resultat = (byte)(message ^ cle);
        return resultat;
    }
    
    public byte[] crypteByteArray(byte[] message){
        
    	byte[] resultat = message;
 		for (int i = 0; i < message.length; i++) {
 			byte b = crypteUnByte(message[i]);
 			resultat[i] = b;
 		}
 		return resultat;
    }
    
    public String crypte(String message) {
 		String resultat = "";
 		String clegenerer = "";
 		for (int i = 0; i < message.length(); i++) {
 			char c = message.charAt(i);
 			clegenerer = generate(8); 
 			char newc = (char) ((byte)Long.parseLong(clegenerer, 2) ^ c);
 			resultat += newc;
 		}
 		return resultat;
 	}

    
}
