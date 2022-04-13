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
    
    private String seed; // graine courte
    private String seedLongueA; // graine longue 1
    private String seedLongueB; // graine longue 2
    private String seedLongueC; // graine longue 3
    private String seedLongueD; // graine longue 4
    
    private int t; // the tap
    private int n; // length of seed
    private String generer; //Variable utiliser pour generer la cle courte
    private String genererLongueA; //Variable utiliser pour generer la cle longue A
    private String genererLongueB; //Variable utiliser pour generer la cle longue B
    private String genererLongueC; //Variable utiliser pour generer la cle longue C
    private String genererLongueD; //Variable utiliser pour generer la cle longue D

    public GenerateurCle() {
        this.seed = "11010111001001111";
        this.seedLongueA = "011000101101000111101101011";
        this.seedLongueB = "000111010101111100110101101011011";
        this.seedLongueC = "111100110101010110110011010100011110010";
        this.seedLongueD = "1000001100101101000101101101011111110001000111000110110";
        this.t = 17;
        this.n = this.seed.length();  
        generer = seed;
        
        genererLongueA = seedLongueA;
        genererLongueB = seedLongueB;
        genererLongueC = seedLongueC;
        genererLongueD = seedLongueD;
    }

    public int stepCourte() {
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
    
    public int stepLongueA() {
        byte LongueA1 = new Integer(Character.getNumericValue(genererLongueA.charAt(seedLongueA.length()-5))).byteValue();
        byte LongueA2 = new Integer(Character.getNumericValue(genererLongueA.charAt(seedLongueA.length()-13))).byteValue();
        byte LongueA3 = new Integer(Character.getNumericValue(genererLongueA.charAt(seedLongueA.length()-17))).byteValue();
        byte LongueA4 = new Integer(Character.getNumericValue(genererLongueA.charAt(seedLongueA.length()-25))).byteValue();
        
        if ((LongueA1 ^ LongueA2 ^ LongueA3 ^ LongueA4) == 0) {
            this.genererLongueA = genererLongueA.substring(1);
            genererLongueA = genererLongueA + "0";
            return 0;
        } else {
        	genererLongueA = genererLongueA.substring(1);
        	genererLongueA = genererLongueA + "1";
            return 1;
        }
    }
    
    public int stepLongueB() {
    	byte LongueB1 = new Integer(Character.getNumericValue(genererLongueB.charAt(seedLongueB.length()-7))).byteValue();
        byte LongueB2 = new Integer(Character.getNumericValue(genererLongueB.charAt(seedLongueB.length()-15))).byteValue();
        byte LongueB3 = new Integer(Character.getNumericValue(genererLongueB.charAt(seedLongueB.length()-19))).byteValue();
        byte LongueB4 = new Integer(Character.getNumericValue(genererLongueB.charAt(seedLongueB.length()-31))).byteValue();
        
        if ((LongueB1 ^ LongueB2 ^ LongueB3 ^ LongueB4) == 0) {
            this.genererLongueB = genererLongueB.substring(1);
            genererLongueB = genererLongueB + "0";
            return 0;
        } else {
        	genererLongueB = genererLongueB.substring(1);
        	genererLongueB = genererLongueB + "1";
            return 1;
        }	
    }
    
    public int stepLongueC() {
    	byte LongueC1 = new Integer(Character.getNumericValue(genererLongueC.charAt(seedLongueC.length()-5))).byteValue();
        byte LongueC2 = new Integer(Character.getNumericValue(genererLongueC.charAt(seedLongueC.length()-9))).byteValue();
        byte LongueC3 = new Integer(Character.getNumericValue(genererLongueC.charAt(seedLongueC.length()-29))).byteValue();
        byte LongueC4 = new Integer(Character.getNumericValue(genererLongueC.charAt(seedLongueC.length()-33))).byteValue();
        
        if ((LongueC1 ^ LongueC2 ^ LongueC3 ^ LongueC4) == 0) {
            this.genererLongueC = genererLongueC.substring(1);
            genererLongueC = genererLongueC + "0";
            return 0;
        } else {
        	genererLongueC = genererLongueC.substring(1);
        	genererLongueC = genererLongueC + "1";
            return 1;
        }	
    }
    
    public int stepLongueD() {
    	byte LongueD1 = new Integer(Character.getNumericValue(genererLongueD.charAt(seedLongueD.length()-3))).byteValue();
        byte LongueD2 = new Integer(Character.getNumericValue(genererLongueD.charAt(seedLongueD.length()-11))).byteValue();
        byte LongueD3 = new Integer(Character.getNumericValue(genererLongueD.charAt(seedLongueD.length()-35))).byteValue();
        byte LongueD4 = new Integer(Character.getNumericValue(genererLongueD.charAt(seedLongueD.length()-39))).byteValue();
        
        if ((LongueD1 ^ LongueD2 ^ LongueD3 ^ LongueD4) == 0) {
            this.genererLongueD = genererLongueD.substring(1);
            genererLongueD = genererLongueD + "0";
            return 0;
        } else {
        	genererLongueD = genererLongueD.substring(1);
        	genererLongueD = genererLongueD + "1";
            return 1;
        }	
    }
    
    public int stepLongueComplete() {
    	byte a = (byte) stepLongueA();
        byte b = (byte) stepLongueB();
        byte c = (byte) stepLongueC();
        byte d = (byte) stepLongueD();
        if ((a ^ b ^ c ^ d) == 0) {
            return 0;
        } else {
            return 1;
        } 
    }

    public String generateCourt(int k) {
        generer = seed;
        String var = "";
        for (int i = 0; i < k; i++) {
            var += stepCourte(); 
		}
		return var;
    }
    
    public String generateLongue(int k) {
        genererLongueA = seedLongueA;
        genererLongueB = seedLongueB;
        genererLongueC = seedLongueC;
        genererLongueD = seedLongueD;
        String var = "";
        for (int i = 0; i < k; i++) {
            var += stepLongueComplete(); 
		}
		return var;
    }
    
    // returns string representation of the LFSR
    public String toString() {
    	return seed;
    }
    
    public Byte crypteUnByteCourte(Byte message){
                
        String clegenerer = generateCourt(8); 
        byte cle = (byte)Long.parseLong(clegenerer, 2);
        byte resultat = (byte)(message ^ cle);
        return resultat;
    }
    
    public Byte crypteUnByteLongue(Byte message){
        
        String clegenerer = generateLongue(8); 
        byte cle = (byte)Long.parseLong(clegenerer, 2);
        byte resultat = (byte)(message ^ cle);
        return resultat;
    }
    
    public byte[] crypteByteArrayCourte(byte[] message){
        
    	byte[] resultat = message;
 		for (int i = 0; i < message.length; i++) {
 			byte b = crypteUnByteCourte(message[i]);
 			resultat[i] = b;
 		}
 		return resultat;
    }
    
    public byte[] crypteByteArrayLongue(byte[] message){
        
    	byte[] resultat = message;
 		for (int i = 0; i < message.length; i++) {
 			byte b = crypteUnByteLongue(message[i]);
 			resultat[i] = b;
 		}
 		return resultat;
    }
    
    public String crypte(String message) {
 		String resultat = "";
 		String clegenerer = "";
 		for (int i = 0; i < message.length(); i++) {
 			char c = message.charAt(i);
 			clegenerer = generateLongue(8); 
 			char newc = (char) ((byte)Long.parseLong(clegenerer, 2) ^ c);
 			resultat += newc;
 		}
 		return resultat;
 	}

    
}
