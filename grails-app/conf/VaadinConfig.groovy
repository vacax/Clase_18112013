vaadin {

    // Your Vaadin UI classes that extends com.vaadin.ui.UI.
    // The application will be available at e.g. http://localhost:8080/grails-vaadin7-demo/
    mapping = [
            "/vd/*": "app.MyUI"
    ]

    // This is optional because the servlet is provided by default.
    // servletClass = "com.mycompany.MyGrailsAwareApplicationServlet"

    productionMode = false

    widgetset = "app.AppWidgetSet"
}

environments {
    production {
        vaadin {
            productionMode = true
        }
    }
}
