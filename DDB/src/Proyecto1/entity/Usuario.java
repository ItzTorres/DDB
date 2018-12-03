package Proyecto1.entity;
// Generated 2/12/2018 04:37:45 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private String nombre;
     private String apPaterno;
     private String apMaterno;
     private String fechaContratacion;
     private Double salario;
     private String password;
     private String direccion;
     private String telefono;
     private String tipo;
     private String email;
     private Set ventas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Usuario(int idUsuario, String nombre, String apPaterno, String apMaterno, String fechaContratacion, Double salario, String password, String direccion, String telefono, String tipo, String email, Set ventas) {
       this.idUsuario = idUsuario;
       this.nombre = nombre;
       this.apPaterno = apPaterno;
       this.apMaterno = apMaterno;
       this.fechaContratacion = fechaContratacion;
       this.salario = salario;
       this.password = password;
       this.direccion = direccion;
       this.telefono = telefono;
       this.tipo = tipo;
       this.email = email;
       this.ventas = ventas;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApPaterno() {
        return this.apPaterno;
    }
    
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }
    public String getApMaterno() {
        return this.apMaterno;
    }
    
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    public String getFechaContratacion() {
        return this.fechaContratacion;
    }
    
    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public Double getSalario() {
        return this.salario;
    }
    
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }




}

