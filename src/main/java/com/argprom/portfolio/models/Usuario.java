package com.argprom.portfolio.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter@Setter@Column(name="id")
    private Long id;
    @Getter@Setter@Column(name = "nombre")
    private String nombre;
    @Getter@Setter@Column(name="apellido")
    private String apellido;

    @Getter@Setter@Column(name="email")
    private String email;

    @Getter@Setter@Column(name="contrasena")
    private String clave;
    @Getter@Setter@Column(name="descrip")
    private String descripcion;
    
    public Usuario(){}
    public Usuario(Long id, String nombre, String apellido, String email, String clave, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.clave = clave;
        this.descripcion = descripcion;
    }
    //Metodos del usuario
}
