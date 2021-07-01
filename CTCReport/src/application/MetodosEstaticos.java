
package application;

import domain.*;
import static application.CrearArchivos.crearArchivo;
import domain.AccesoArchivo.*;

public class MetodosEstaticos {
    
    public static void buscarElementos(int  OCG, String fecha){
        int numeroDelOCG = numeroOCG(OCG);
        var accesoArchivo = new AccesoArchivo();
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\OCG";
        String formatoArchivoEntrada = ".log";
        String formatoArchivoSalida = ".txt";
        String valorOffline = "_offline_";
        String valorRetry = "_retry_";
        String valorIndicacionRetry = "_indretry_";
        
        String ocgPath = directorio + "_ " + numeroDelOCG + fecha + ".log";
        
        String offlinePath = directorio + "_" + numeroDelOCG +  "_offline_" + fecha + ".txt";
        String deliveryPath = directorio + "_" + numeroDelOCG + "_" + "delivery" + fecha + ".txt";
        String inboundRetryPath = directorio + "_" + numeroDelOCG + "_" + "inboundRetry" + fecha + ".txt";
        
        accesoArchivo.escribirPalabraClave(ocgPath, offlinePath, "offline");
        
        
    }
    
    public static int numeroOCG(int numero){
        int numeroDeOCG = 0;
        
        if(numero == 1){
            numeroDeOCG = 3910;
        } else {
            numeroDeOCG = 3911; 
        }
        
        return numeroDeOCG;
    }
    
   
    
}
