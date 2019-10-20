package com.boot.kuberenetes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KubernateController {

	@RequestMapping("/message/{name}")
	@ResponseBody
	public Response displayMessage(@PathVariable("name") String name){
		Response response= new Response();
		response.setName(name);
		response.setMessage("welcome to kubernates:::"+name+"Demo");
		response.setStatus("sucess");
		return response;
	}
}
