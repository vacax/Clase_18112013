package edu.pucmm.pwa.clase18112013.services

import edu.pucmm.pwa.clase18112013.domain.Estudiante
import grails.transaction.Transactional

@Transactional
class EstudianteService {

    /**
     *
     * @return
     */
    public List<Estudiante> getListaEstudiante() {
          return Estudiante.list();
    }
}
