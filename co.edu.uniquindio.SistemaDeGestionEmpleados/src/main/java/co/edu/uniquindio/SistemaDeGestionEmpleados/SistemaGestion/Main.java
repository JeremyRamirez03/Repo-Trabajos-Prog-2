package co.edu.uniquindio.SistemaDeGestionEmpleados.SistemaGestion;

import co.edu.uniquindio.SistemaDeGestionEmpleados.SistemaGestion.Factory.ModelFactory;
import co.edu.uniquindio.SistemaDeGestionEmpleados.SistemaGestion.Model.SistemaGestion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory =ModelFactory.getInstancia();
        SistemaGestion sistemaGestion= modelFactory.getSistemaGestion();

        String menuPrincipal = """
                Menu principal\s
                Ingrese la opcion correspondiente:\s
                1. Añadir Empleado.\s
                2. Imprimir Empleado.\s
                3. Eliminar Empleado.\s
                4. Actualizar Empleado.\s
                5. Crear Departamento.\s
                6. Imprimir Departamento.\s
                7. Eliminar Departamento.\s
                8. Actualizar Departamento.\s
                9. Crear Proyecto.\s
                10. Imprimir Proyecto.\s
                11. Eliminar Proyecto.\s
                12. Actualizar Proyecto.\s
                13. Asignar Empleados.\s
                14. Añadir Contibucion a proyectos.\s
                15. Empleados Por Proyecto.\s
                16. lista De partamentos En Proyecto.\s
                17. Empleados Por Departamento.\s
                18. Salir""";
        int opcionSeleccionada = 0;
        do {
            opcionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog(null, menuPrincipal));
            opcionMenu(opcionSeleccionada, modelFactory);
        } while (opcionSeleccionada != 18);
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
            case 15:
                EmpleadosPorProyecto(modelFactory);
                break;
            case 16:
                listaDepartamentosEnProyecto(modelFactory);
                break;
            case 17:
                EmpleadosPorDepartamento(modelFactory);
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

    private static void EmpleadosPorProyecto(ModelFactory modelFactory){
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del proyecto");
        String resultado= modelFactory.EmpleadosPorProyecto(codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void listaDepartamentosEnProyecto(ModelFactory modelFactory){
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del proyecto");
        String resultado= modelFactory.listaDepartamentosEnProyecto(codigo);
        JOptionPane.showInputDialog(resultado);
    }

    private static void EmpleadosPorDepartamento(ModelFactory modelFactory){
        String codigo= JOptionPane.showInputDialog("Ingrese el codigo del departamento");
        String resultado= modelFactory.EmpleadosPorDepartamentos(codigo);
        JOptionPane.showInputDialog(resultado);
    }

}