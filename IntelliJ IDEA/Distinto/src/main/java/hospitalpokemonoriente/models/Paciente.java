package generation.hospitalpokemonoriente.models;

import jakarta.persistence.*;

// esa anotacion permite saber cuales son las tablas que se van a crear objetos entre otros
@Entity
@Table(name = "pacientes")

public class Paciente {
    @Id
    //ID sirve para indicar la llave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //GeneratedValue sirve para ver que estrategia tomara para generar esa ID
    private int id;
    @Column(name = "paciente_nombre")
    private String nombre;
    @Column(name = "paciente_apellido")
    private String apellido;
}