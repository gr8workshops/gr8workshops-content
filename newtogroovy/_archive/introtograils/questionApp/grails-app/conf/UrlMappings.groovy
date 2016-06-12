class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

		"/showQuestions" (controller: "question", action: "index")
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
