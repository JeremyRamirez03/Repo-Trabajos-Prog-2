package co.edu.uniquindio.SistemaDeGestionEmpleados.Model;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String codigo;
    private List<Departamento> listaDeDepartamentos = new ArrayList<>();
    private List<Gerente> listaDeGerente  = new ArrayList<>();
    private List<Tecnico> listaDeTecnico  = new ArrayList<>();

    public Proyecto(){

    }
    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public List<Gerente> getListaDeGerente() {return listaDeGerente;}
    public void setListaDeGerente(List<Gerente> listaDeGerente) {
        this.listaDeGerente = listaDeGerente;
    }
    public List<Tecnico> getListaDeTecnico() {return listaDeTecnico;}
    public void setListaDeTecnico(List<Tecnico> listaDeTecnico) {
        this.listaDeTecnico = listaDeTecnico;
    }
    public List<Departamento> getListaDeDepartamentos() {return listaDeDepartamentos;}
    public void setListaDeDepartamentos(List<Departamento> listaDeDepartamentos) {
        this.listaDeDepartamentos = listaDeDepartamentos;
    }

    @Override
    public String toString() {
        return "Proyecto= " + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", Gerente=" + listaDeGerente +", Tecnicos= " + listaDeTecnico ;
    }
}
