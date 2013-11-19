package edu.pucmm.pwa.clase18112013.domain

class Estudiante {

    int matricula;
    String nombre;

    static hasMany = [listaMateriales : Materia]


    static constraints = {
    }

    static mapping = {
        //listaMateriales lazy: false
    }
}
