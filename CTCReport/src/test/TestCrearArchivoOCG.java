/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import application.CrearArchivos;

/**
 *
 * @author hecto
 */
public class TestCrearArchivoOCG {
    public static void main(String[] args) {
        String directorio = "C:\\Users\\hecto\\Repositorio\\OCGLogs\\OCG";
        CrearArchivos prueba = new CrearArchivos(); 
        prueba.crearArchivo(directorio,"1","prueba", "prueba");
    }
}
