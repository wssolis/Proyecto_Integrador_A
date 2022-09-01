/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Empleado;
import ec.edu.intsuperior.vista.JPFCrearEmpleado;
import ec.edu.intsuperior.vista.JPFEliminarEmpleado;
import ec.edu.intsuperior.vista.Loggin;

/**
 *
 * @author Santiago Solis
 */
public class Controlador {
    Loggin loggin=new Loggin(this);
    Administrador administrador= new Administrador(this);
    Empleado empleado=new Empleado(this);
    JPFCrearEmpleado jPFCrearEmpleado= new JPFCrearEmpleado(this);
    JPFEliminarEmpleado jPFEliminarEmpleado= new JPFEliminarEmpleado(this);
    
    public void showJPFCrearEmpleado(){
        jPFCrearEmpleado.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(jPFCrearEmpleado);
        jPFCrearEmpleado.setVisible(true);
        administrador.escritorio.repaint();
    }
    public void showJPFEliminarEmpleado(){
        jPFEliminarEmpleado.setSize(1500,1500);
        administrador.escritorio.removeAll();
        administrador.escritorio.add(jPFEliminarEmpleado);
        jPFEliminarEmpleado.setVisible(true);
        administrador.escritorio.repaint();
    }
    
    public void showLoggin(){
        loggin.setVisible(true);
    }
    public void closeLoggin(){
        loggin.setVisible(false);
    }
    public void showAdministrador(){
        administrador.setVisible(true);
    }
    public void closeAdministrador(){
        administrador.setVisible(false);
    }
    public void showEmpleado(){
        empleado.setVisible(true);
    }
      public void closeEmpleado(){
        empleado.setVisible(false);
    }
}
