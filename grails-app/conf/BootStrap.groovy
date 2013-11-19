import edu.pucmm.pwa.clase18112013.domain.Estudiante
import edu.pucmm.pwa.clase18112013.domain.Materia

class BootStrap {

    def init = { servletContext ->

        /**
         * Creando los objetos automaticos.
         */
        (1..25).each {
            def estu=new Estudiante(nombre: "Estudiante $it", matricula: it).save(failOnError: true);
            (1..5).each { indice->
                def materia=new Materia(nombre: "Materia $indice");
                estu.addToListaMateriales(materia);
            }
        }
    }
    def destroy = {
    }
}
