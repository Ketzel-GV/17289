package mx.uv.fei.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantillaControlador {

    @RequestMapping("/plantilla")  
    public String plantilla(Model model){
        model.addAttribute("mensaje", " Hols mundo");
        return "pagina";

    }
}