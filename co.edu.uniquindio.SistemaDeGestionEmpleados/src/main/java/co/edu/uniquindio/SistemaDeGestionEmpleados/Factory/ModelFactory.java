package co.edu.uniquindio.SistemaDeGestionEmpleados.Factory;

import co.edu.uniquindio.SistemaDeGestionEmpleados.Service.SistemaGestion;

public class ModelFactory {
    private static ModelFactory instancia;
    private SistemaGestion sistemaGestion;

    private ModelFactory(){
        sistemaGestion= inicializarDatos();
    }
    public static ModelFactory getInstancia() {
        if(instancia == null) {
            instancia = new ModelFactory();
        }
        return instancia;
    }
    private SistemaGestion inicializarDatos(){


        return sistemaGestion;
    }


}
