package co.edu.uniquindio.SistemaDeGestionEmpleados.Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaGestion {
    private String nombre;
    private List<Empleado> listaEmpleados=new ArrayList<>();
    private List<Gerente> listaGerentes=new ArrayList<>();
    private List<Tecnico> listaTecnicos=new ArrayList<>();
    private List<Departamento> listaDepartamentos=new ArrayList<>();
    private List<Proyecto> listaProyectos=new ArrayList<>();

    public SistemaGestion(){

    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public List<Gerente> getListaGerentes() {return listaGerentes;}
    public void setListaGerentes(List<Gerente> listaGerentes) {this.listaGerentes = listaGerentes;}
    public List<Tecnico> getListaTecnicos() {return listaTecnicos;}
    public void setListaTecnicos(List<Tecnico> listaTecnicos) {this.listaTecnicos = listaTecnicos;}
    public List<Departamento> getListaDepartamentos() {return listaDepartamentos;}
    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }
    public List<Proyecto> getListaProyectos() {return listaProyectos;}
    public void setListaProyectos(List<Proyecto> listaProyectos) {this.listaProyectos = listaProyectos;}
    public List<Empleado> getListaEmpleados() {return listaEmpleados;}
    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public String crearEmpleado(String nombre, String id, String departamento, int rol) {
        String mensaje= "";
        if (rol==1){
            Gerente g=new Gerente(nombre,id,departamento);
            getListaGerentes().add(g);
            getListaEmpleados().add(g);
            mensaje+="Empleado creado correctamente";
        } else if (rol==2) {
            Tecnico t = new Tecnico(nombre,id,departamento);
            getListaTecnicos().add(t);
            getListaEmpleados().add(t);
            mensaje+="Empleado creado correctamente";
        }
        return mensaje;
    }

    public Empleado buscarEmpleado(String id) {
        for (Empleado g: getListaEmpleados()) {
            if (g.getIdEmpleado().equalsIgnoreCase(id)) {
                return g;
            }
        }
        return null;
    }

    public String imprimirEmpleado(String id){
        String mensaje= "";
        Empleado e=buscarEmpleado(id);
        if (e==null){
            mensaje+="Empleado no encontrado";
        }else {
            mensaje+= e.toString();
        }
        return mensaje;
    }

    public String eliminarEmpleado(String id){
        String mensaje="";
        Empleado e= buscarEmpleado(id);
        if (e==null){
            mensaje+="Empleado no encontrado";
        }else {
            listaEmpleados.remove(e);
            if (e instanceof Gerente){
                listaGerentes.remove(e);
            }else if (e instanceof Tecnico){
                listaTecnicos.remove(e);
            }
            mensaje+="Empleado eliminado";
        }
        return mensaje;
    }

    public String actualizarEmpleado(String id){
        String mensaje= "";
        Empleado e= buscarEmpleado(id);
        if (e==null){
            mensaje+="Empleado no encontrado";
        }else {
            e.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado"));
            e.setIdEmpleado(JOptionPane.showInputDialog("Ingrese el Id del empleado"));
            e.setDepartamento(JOptionPane.showInputDialog("Ingrese el departamento al que pertenece"));
            mensaje+="Empleado actualizado";
        }
        return mensaje;
    }

    public String crearDepartamento(String nombre, String codigo){
        Departamento departamento= new Departamento(nombre,codigo);
        return "Departamento creado";
    }

    public Departamento buscarDepartamento(String codigo) {
        for (Departamento d: getListaDepartamentos()) {
            if (d.getCodigo().equalsIgnoreCase(codigo)) {
                return d;
            }
        }
        return null;
    }

    public String imprimirDepartamento(String codigo) {
        String mensaje="";
        Departamento d=buscarDepartamento(codigo);
        if (d==null){
            mensaje+="Departamento no encontrado";
        }else {
            mensaje+= d.toString();
        }
        return mensaje;
    }

    public String eliminarDepartamento(String codigo) {
        String mensaje="";
        Departamento d=buscarDepartamento(codigo);
        if (d==null){
            mensaje+="Departamento no encontrado";
        }else {
            listaDepartamentos.remove(d);
            mensaje+="Departamento eliminado";
        }
        return mensaje;
    }

    public String actualizarDepartamento(String codigo) {
        String mensaje="";
        Departamento d=buscarDepartamento(codigo);
        if (d==null){
            mensaje+="Departamento no encontrado";
        }else {
            d.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del departamento"));
            d.setCodigo(JOptionPane.showInputDialog("Ingrese el codigo del departamento"));
            mensaje+="Departamento actualizado";
        }
        return mensaje;
    }

    public String crearProyecto(String nombre, String codigo) {
        Proyecto proyecto= new Proyecto(nombre,codigo);
        return "Proyecto creado";
    }

    public Proyecto buscarProyecto(String codigo) {
        for (Proyecto p:getListaProyectos()) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public String imprimirProyecto(String codigo) {
        String mensaje="";
        Proyecto p=buscarProyecto(codigo);
        if (p==null){
            mensaje+="Proyecto no encontrado";
        }else {
            mensaje+= p.toString();
        }
        return mensaje;
    }

    public String eliminarProyecto(String codigo) {
        String mensaje="";
        Proyecto p=buscarProyecto(codigo);
        if (p==null){
            mensaje+="Proyecto no encontrado";
        }else {
            listaProyectos.remove(p);
            mensaje+="Proyecto eliminado";
        }
        return mensaje;
    }

    public String actualizarProyecto(String codigo) {
        String mensaje="";
        Proyecto p=buscarProyecto(codigo);
        if (p==null){
            mensaje+="Proyecto no encontrado";
        }else {
            p.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del proyecto"));
            p.setCodigo(JOptionPane.showInputDialog("Ingrese el codigo del proyecto"));
            mensaje+="Proyecto actualizado";
        }
        return mensaje;
    }

    public String asisgnacionEmpleados(String id, String codigo) {
        String mensaje="";
        Empleado e=buscarEmpleado(id);
        if (e==null){
            mensaje+="Empleado no encontrado";
        }else {
            Departamento d=buscarDepartamento(codigo);
            if (d==null){
                Proyecto p=buscarProyecto(codigo);
                if (p==null){
                    mensaje+="Departamento ó Proyecto no encontrado";
                }else {
                    if (e instanceof Gerente){
                        p.getListaDeGerente().add((Gerente)e);
                        mensaje+="Empleado asignado a proyecto";
                    }else {
                        p.getListaDeTecnico().add((Tecnico) e);
                        mensaje+="Empleado asignado a proyecto";
                    }
                }
            }else {
                d.getListaDeEmpleados().add(e);
                mensaje+="Empleado asignado a departamento";
            }
        }
        return mensaje;
    }

    public String contribucionAProyectos(String id) {
        String mensaje="";
        Empleado e=buscarEmpleado(id);
        if (e==null){
            mensaje+="Empleado no encontrado";
        }else {
            if (e instanceof Gerente g){
                g.contribuir();
            } else if (e instanceof Tecnico t) {
                t.contribuir();
            }
            mensaje+="Aporte realizado con exito";
        }
        return mensaje;
    }


    public String EmpleadosPorProyecto(String codigo) {
        Proyecto p = buscarProyecto(codigo);
        String  numeroEmpleados= String.valueOf(p.getListaDeTecnico().size() + p.getListaDeGerente().size() );
        return "El proyecto " + p.getNombre() + ", Tiene " + numeroEmpleados +" empleados";
    }


    public String listaDepartamentosEnProyecto(String codigo) {
        Proyecto p = buscarProyecto(codigo);
        String departamentosLigados= "Lista de departamentos involucrados: "+ "\n";
        for (Departamento d : p.getListaDeDepartamentos()){
            departamentosLigados+="Departamento de " + d.getNombre() + "\n";
        }
        return departamentosLigados;
    }

    public String EmpleadosPorDepartamentos(String codigo) {
        Departamento departamento = buscarDepartamento(codigo);
        String  numeroEmpleados= String.valueOf(departamento.getListaDeEmpleados().size());
        return "El Departamento de " + departamento.getNombre() + ", Tiene " + numeroEmpleados +" empleados asignados";
    }
}
