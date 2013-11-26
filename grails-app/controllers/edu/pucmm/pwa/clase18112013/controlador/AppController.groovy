package edu.pucmm.pwa.clase18112013.controlador

import edu.pucmm.pwa.clase18112013.domain.Estudiante
import grails.converters.JSON
import grails.converters.XML

class AppController {

    def index() {
        println("Re-enviado a Vaadin")
        redirect(url: '/vd/')
    }


    def llamadaGrails(){
        render "Los parametros enviados: "+params.toQueryString();
    }

    def listaEstudiante(){
        println("....");
        def estudiantes = Estudiante.list()

        withFormat {
            html {[listaEstudiante:estudiantes]}
            js { render "<script>alert('hello')</script>" }
            xml { render estudiantes as XML }
            json { render estudiantes as JSON }
        }

    }


}
