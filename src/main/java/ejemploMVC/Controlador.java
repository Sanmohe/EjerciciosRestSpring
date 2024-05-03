package ejemploMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//Indica que esta clase sera el Controlador
public class Controlador {

		@RequestMapping
		//Indica que este método se encarga de mapear el archivo JSP de la vista
		public String muestraPagina() {
			return "paginaEjemplo";
			//Devuelve el archivo JSP
		}
		
	
}
