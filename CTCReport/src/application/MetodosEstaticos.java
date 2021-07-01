
package application;

import domain.*;

public class MetodosEstaticos {
    
    public static void buscarElementos(int  OCG, String fecha){
        int numeroDelOCG = numeroOCG(OCG);
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\OCG";
        String formatoArchivoEntrada = ".log";
        String formatoArchivoSalida = ".txt";
        String valorOffline = "_offline_";
        String valorRetry = "_retry_";
        String valorIndicacionRetry = "_indretry_";
        
        String ocgPath = directorio + "_ " + numeroDelOCG + fecha + ".log";
        
        
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
