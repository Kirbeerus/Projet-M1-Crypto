package projetCrypto;

import java.io.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Scanner;

public class Loader {

    
    public byte[] Charger(String nom) throws IOException
    {
    	File file = new File(nom);

    	byte[] b = new byte[(int) file.length()];
    	try {
    		FileInputStream fileInputStream = new FileInputStream(file);
    		fileInputStream.read(b);
    		return b;
    	} catch (FileNotFoundException e) {
    		System.out.println("File Not Found.");
    		e.printStackTrace();
    	}
		return b;
		
    }
}
