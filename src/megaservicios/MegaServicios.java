package megaservicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import megaservicios.clases.*;

public class MegaServicios {
    
    public static void main(String[] args) throws IOException {
            
        String ruta = "C:\\Log\\log.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        
        String text = "@-> Iniciando MegaServicios...\n"
                    + "@-> @/localhost en port 3086 ...\n" 
                    + "@-> Conectando con MySQL Server...\n"
                    + "@-> Enviando msg a rrh.afpymc@gmail.com\n"
                    + "@->          ***** EN LINEA *****      \n"
                    + "\n";        
              
        bw = new BufferedWriter(new FileWriter(archivo));
        System.out.print(text);
        bw.write(text);
        
        bw.close();     
        
        megaservicios.interfaces.Logueo a = new megaservicios.interfaces.Logueo();
        a.setVisible(true);
    }
}