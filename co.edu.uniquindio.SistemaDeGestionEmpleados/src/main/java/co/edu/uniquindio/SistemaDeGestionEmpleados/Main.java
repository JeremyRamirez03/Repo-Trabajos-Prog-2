package co.edu.uniquindio.SistemaDeGestionEmpleados;

import co.edu.uniquindio.SistemaDeGestionEmpleados.Factory.ModelFactory;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory =ModelFactory.getInstancia();

        String menuPrincipal = "Menu principal \n" + "Ingrese la opcion correspondiente: \n" + "1. Añadir Empleado. \n"
                + "2. Imprimir Empleado. \n" + "3. Eliminar Empleado. \n" + "4. Actualizar Empleado. \n" +
                "5. Crear Departamento. \n" + "6. Imprimir Departamento. \n" + "7. Eliminar Departamento. \n" +
                "8. Actualizar Departamento. \n" + "9. Crear Proyecto. \n" + "10. Imprimir Proyecto. \n" +
                "11. Eliminar Proyecto. \n" + "12. Actualizar Proyecto. \n" +  "13. Asignar Empleados. \n" +
                "14. Añadir Contibucion a proyectos. \n" +"15. Salir";
        int opcionSeleccionada = 0;
        do {
            opcionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal));
            opcionMenu(opcionSeleccionada, modelFactory);
        } while (opcionSeleccionada != 15);
    }
    private static void opcionMenu(int opcionSeleccionada, ModelFactory modelFactory) {
        switch (opcionSeleccionada) {
            case 1:
                crearEmpleado(modelFactory);
                break;
            case 2:
                imprimirEmpleado(modelFactory);
                break;
            case 3:
                eliminarEmpleado(modelFactory);
                break;
            case 4:
                actualizarEmpleado(modelFactory);
                break;
            case 5:
                crearDepartamento(modelFactory);
                break;
            case 6:
                imprimirDepartamento(modelFactory);
                break;
            case 7:
                eliminarDepartamento(modelFactory);
                break;
            case 8:
                actualizarDepartamento(modelFactory);
                break;
            case 9:
                crearProyecto(modelFactory);
                break;
            case 10:
                imprimirProyecto(modelFactory);
                break;
            case 11:
                eliminarProyecto(modelFactory);
                break;
            case 12:
                actualizarProyecto(modelFactory);
                break;
            case 13:
                asignarEmpleados(modelFactory);
                break;
            case 14:
                contribucionAProyectos(modelFactory);
                break;
            default:
                break;
        }

    }

    private static void crearEmpleado(ModelFactory modelFactory){
        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        String idEmpleado= JOptionPane.showInputDialog("Ingrese el Id del empleado");
        String departamento= JOptionPane.showInputDialog("Ingrese el departamento al que pertenece");
        int rolEmpleado= Integer.parseInt(JOptionPane.showInputDialog("El empleado es:  1.gerente \n"+ "2.tecnico"));
        String resultado=modelFactory.crearEmpleado(nombre,idEmpleado,departamento,rolEmpleado);
        JOptionPane.showInputDialog(resultado);

    }

    private static void imprimirEmpleado(ModelFactory modelFactory){
        String id=JOptionPane.showInputDialog("Ingrese el Id del empleado");
        String resultado= modelFactory.imprimirEmpleado(id);
        JOptionPane.showInputDialog(resultado);
    }

    private static void eliminarEmpleado(ModelFactory modelFactory){
        String id=JOptionPane.showInputDialog("Ingrese el Id del empleado a eliminar");
        String resultado= modelFactory.eliminarEmpleado(id);
        JOptionPane.showInputDialog(resultado);
    }

    private static void actualizarEmpleado(ModelFactory modelFactory){
        String id=JOptionPane.showInputDialog("Ingrese el Id del empleado a actualizar");
        String resultado= modelFactory.actualizarEmpleado(id);
        JOptionPane.showInputDialog(resultado);
    }

    private static void crearDepartamento(ModelFactory modelFactory){
        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del departamento");
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del departamento");
        String resultado= modelFactory.crearDepartamento(nombre,codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void imprimirDepartamento(ModelFactory modelFactory){
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del departamento");
        String resultado= modelFactory.imprimirDepartamento(codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void eliminarDepartamento(ModelFactory modelFactory){
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del departamento a eliminar");
        String resultado= modelFactory.eliminarDepartamento(codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void actualizarDepartamento(ModelFactory modelFactory){
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del departamento a actualizar");
        String resultado= modelFactory.actualizarDepartamento(codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void crearProyecto(ModelFactory modelFactory){
        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del Proyecto");
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del Proyecto");
        String resultado= modelFactory.crearProyecto(nombre,codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void imprimirProyecto(ModelFactory modelFactory){
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del Proyecto");
        String resultado= modelFactory.imprimirProyecto(codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void eliminarProyecto(ModelFactory modelFactory){
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del Proyecto a eliminar");
        String resultado= modelFactory.eliminarProyecto(codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void actualizarProyecto(ModelFactory modelFactory){
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del Proyecto a actualizar");
        String resultado= modelFactory.actualizarProyecto(codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void asignarEmpleados(ModelFactory modelFactory){
        String idEmpleado= JOptionPane.showInputDialog("Ingrese el Id del empleado");
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del Proyecto ó Departamento a actualizar");
        String resultado= modelFactory.asignarEmpleado(idEmpleado,codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void contribucionAProyectos(ModelFactory modelFactory){
        String idEmpleado= JOptionPane.showInputDialog("Ingrese el Id de empleado");
        String resultado= modelFactory.contribucionAProyectos(idEmpleado);
        JOptionPane.showInputDialog(resultado);
    }

}