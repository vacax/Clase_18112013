class UrlMappings {

	static mappings = {

        "/"(controller: 'app', action: 'index')

        "/restful/$action(.${format})?"(controller: 'app')

       /* "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')*/
	}
}
