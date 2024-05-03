package ejemploMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorFormulario {

	// MÉTODO QUE PROPORCIONA EL FORMULARIO
	@RequestMapping("/muestraFormulario")
		/* Indica que el método se encarga de solicitar el formulario al servidor. Entre
		 * paréntesis se introduce la URL (con / al principio) que el usuario usa para
		 * que el servidor devuelva e formulario
		 */
	public String muestraFormulario() {
		return "rellenaFormulario";
	}

		

	// MÉTODO QUE RESPONDE MANDANDO LA VISTA
	@RequestMapping("/procesaFormulario")
		/* Indica que el método se encarga de procesar el formulario y devolver una
		 * respuesta. Entre paréntesis se introduce la URL (con / al principio)
		 */
	public String procesaFormulario() {
		return "formularioCompletado";
	}

	
	
	// MÉTODO QUE PROCESA LA INFORMACIÓN DEL FORMULARIO Y MANDA LA VISTA
	@RequestMapping("/procesaFormulario2")
	public String procesaFormulario2(HttpServletRequest request, Model modelo) {
		// Recibe como parámetros la petición HTTP y el modelo

		String nombre = request.getParameter("nombreIntroducido");
			//Captura el dato que procede del formulario Hay que indicar el ID del dato del formulario (NAME)
		
		nombre += ", tararí que te vi";
			// Se añaden más datos al dato recibido en el formulario

		String mensajeFinal = "¿Quieres ser millonari@? " + nombre;
			// Mensaje o dato final que se quiere devolver como respuesta

		modelo.addAttribute("mensajeRespuesta", mensajeFinal);
			/*Se añaden los datos al modelo, indicando un ID al atributo añadido (String) y
			 * el objeto (valor) que se añade, en este caso, el mensaje final.
			 */

		return "formularioCompletado";
		// Finalmente, se devuelve la vista
	}
	
}

