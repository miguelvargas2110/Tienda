/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas.bl;

/**
 *
 * @author migue
 */
public class Cliente {

    String nombre, apellidos, id, direccion, telefono, juridica_natural, nit_email, nacimiento;

    public String getJuridica_natural() {
        return juridica_natural;
    }

    public void setJuridica_natural(String juridica_natural) {
        this.juridica_natural = juridica_natural;
    }

    public String getNit_email() {
        return nit_email;
    }

    public void setNit_email(String nit_email) {
        this.nit_email = nit_email;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
