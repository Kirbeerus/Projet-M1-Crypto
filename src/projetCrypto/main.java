package projetCrypto;

import java.io.IOException;

/**
 *
 * @author yd175371
 */
public class main {
    
    
    public static void main (String[] args) throws IOException{
    	Loader loader = new Loader();
        GenerateurCle g = new GenerateurCle();
        byte[] octet = loader.Charger("hello.txt");
        
        /*String a = "sdfghujklm";
        System.out.println(a);
        String b = g.crypte(a);
        System.out.println(b);
        String c = g.crypte(b);
        System.out.println(c);*/
    	
        byte[] b = g.crypteByteArray(octet);
    	
        for (int i = 0; i < b.length; i++) {
        	System.out.println(
        			"b[" + i + "] = " +((int)b[i] < 11  ? "  " : "") +
        			b[i] + " , " +" character=(" + (char)b[i] + ")");
        }
        
        byte[] c = g.crypteByteArray(b);
        
        for (int i = 0; i < c.length; i++) {
        	System.out.println(
        			"c[" + i + "] = " +((int)c[i] < 11  ? "  " : "") +
        			c[i] + " , " +" character=(" + (char)c[i] + ")");
        }
        
   }
            
}
