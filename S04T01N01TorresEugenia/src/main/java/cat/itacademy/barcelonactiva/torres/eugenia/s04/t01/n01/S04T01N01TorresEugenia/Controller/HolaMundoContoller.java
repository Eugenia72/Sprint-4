package cat.itacademy.barcelonactiva.torres.eugenia.s04.t01.n01.S04T01N01TorresEugenia.Controller;

import org.springframework.web.bind.annotation.*;
@RestController
public class HolaMundoContoller {


    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "nombre", defaultValue = "UNKNOWN") String name) {
        return "Hola " + name + " estás ejecutando un proyecto Maven!";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nombre}"})
    public String saluda2(@PathVariable(required = false) String nombre) {
        if(nombre == null) {
            nombre = "UNKNOWN";
        }

            return "Hola " + nombre + " estás ejecutando un proyecto Maven!";
    }

}

