package edu.pucmm.pwa.clase18112013.domain

class Materia {

    String nombre;

    static belongsTo = [estudiante :Estudiante]

    static constraints = {
    }

    static mapping = {
        estudiante lazy: false
    }
}
