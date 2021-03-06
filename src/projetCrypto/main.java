package projetCrypto;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author yd175371
 */
public class main {
    
    
    public static void main (String[] args) throws IOException{
    	Loader loader = new Loader();
        GenerateurCle g = new GenerateurCle();
        String nomFichier = "hello.txt";
        byte[] octet = loader.Charger(nomFichier);
    	
        byte[] b = g.crypteByteArrayLongue(octet);
    	
        for (int i = 0; i < 10; i++) {
        	System.out.println(
        			"b[" + i + "] = " +((int)b[i] < 11  ? "  " : "") +
        			b[i] + " , " +" character=(" + (char)b[i] + ")");
        }
        
        try (FileOutputStream fos = new FileOutputStream("testcrypte")) {
     	   fos.write(b);
     	   //fos.close(); There is no more need for this line since you had created the instance of "fos" inside the try. And this will automatically close the OutputStream
     	}
        
        byte[] c = g.crypteByteArrayLongue(loader.Charger("testcrypte"));
        
        for (int i = 0; i < 10; i++) {
        	System.out.println(
        			"c[" + i + "] = " +((int)c[i] < 11  ? "  " : "") +
        			c[i] + " , " +" character=(" + (char)c[i] + ")");
        }
        
        try (FileOutputStream fos = new FileOutputStream("decrypte-"+nomFichier)) {
        	   fos.write(c);
        	   //fos.close(); There is no more need for this line since you had created the instance of "fos" inside the try. And this will automatically close the OutputStream
        	}
        
   }
            
}
