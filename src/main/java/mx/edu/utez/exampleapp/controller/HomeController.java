package mx.edu.utez.exampleapp.controller;
import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import mx.edu.utez.exampleapp.model.Vacante;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String index(Model modelo) {
		modelo.addAttribute("name","Mario");
		modelo.addAttribute("age","22");
		
		LinkedList<Vacante> listVacantes = new LinkedList<>();		
		Vacante objVacante = new Vacante();
		objVacante.setId((long)1);
		objVacante.setNombre("Database manager");
		objVacante.setDescripcion("Create procedure...");
		objVacante.setSalario(25000.0);
		listVacantes.add(objVacante);
		
		listVacantes.add(new Vacante((long)2,"Developer","Test",20000.5));
		listVacantes.add(new Vacante((long)3,"Hola","Mundo",900.5));
		
		modelo.addAttribute("vacantes", listVacantes);
		
		return "index";
	}
}
