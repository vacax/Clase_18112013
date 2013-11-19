package app

import com.vaadin.ui.Button
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import com.vaadin.grails.Grails
import edu.pucmm.pwa.clase18112013.domain.Estudiante
import edu.pucmm.pwa.clase18112013.domain.Materia
import edu.pucmm.pwa.clase18112013.services.EstudianteService

/**
 *
 *
 * @author
 */
class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

		VerticalLayout layout = new VerticalLayout()

        String homeLabel = Grails.i18n("default.home.label")
        Label label = new Label(homeLabel)
        layout.addComponent(label)

        // example of how to get Grails service and call a method
        // List<User> users = Grails.get(UserService).getListOfUsers()
        //    for (User user : users) {
        //    	layout.addComponent(new Label(user.name))
        // }

        def listaEstudiante=Grails.get(EstudianteService).listaEstudiante;
        listaEstudiante.each {
            //def l=new Label()
            def b=new Button(it.nombre+" - "+Materia.findAllByEstudiante(it).size());
            b.data=it; //pasando la referencia al objeto una forma..
            b.addClickListener(new Button.ClickListener() {
                @Override
                void buttonClick(Button.ClickEvent clickEvent) {
                    def tempBoton=clickEvent.button;
                    println("Evento en el servidor, presiono el Estudiante: "+((Estudiante)tempBoton.data).nombre);
                }
            })
            layout.addComponent(b);

            Materia.findAllByEstudiante(it).each { materia->
                layout.addComponent(new Label("Nombre Estudiante: "+materia.estudiante.nombre))
            }
        }



		setContent(layout)
    }
}
