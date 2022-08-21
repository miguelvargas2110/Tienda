/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas.bl;


/**
 *
 * @author migue
 */
public class productosBL {
    
    String codigo, nombre, descripcion, valorUnitario, cantidadExistencia, tipoProductos, peso_temperatura, pais_codigo, fechaEnvasado_caducidad;

    public String getFechaEnvasado_caducidad() {
        return fechaEnvasado_caducidad;
    }

    public void setFechaEnvasado_caducidad(String fechaEnvasado_caducidad) {
        this.fechaEnvasado_caducidad = fechaEnvasado_caducidad;
    }

    
    public String getPeso_temperatura() {
        return peso_temperatura;
    }

    public void setPeso_temperatura(String peso_temperatura) {
        this.peso_temperatura = peso_temperatura;
    }

    public String getPais_codigo() {
        return pais_codigo;
    }

    public void setPais_codigo(String pais_codigo) {
        this.pais_codigo = pais_codigo;
    }

    public String getTipoProductos() {
        return tipoProductos;
    }

    public void setTipoProductos(String tipoProductos) {
        this.tipoProductos = tipoProductos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(String cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
    
    
}