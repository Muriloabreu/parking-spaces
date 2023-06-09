package com.api.parkingspaces.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.parkingspaces.services.ResponsibleCarService;

@Controller
@CrossOrigin(originPatterns = "*", maxAge = 3600) /*Para permitir ser acessado de qualquer fonte*/
@RequestMapping("/parking-spaces/responsible") /*Mapeamento a nível de classe*/
public class ResponsibleCarController {
	
	@Autowired
	ResponsibleCarService responsibleCarService;

}
