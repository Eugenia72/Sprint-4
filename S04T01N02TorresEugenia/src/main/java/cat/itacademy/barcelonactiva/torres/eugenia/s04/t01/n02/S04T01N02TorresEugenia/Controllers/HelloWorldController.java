package cat.itacademy.barcelonactiva.torres.eugenia.s04.t01.n02.S04T01N02TorresEugenia.Controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name = "nombre", defaultValue = "UNKNOWN") String nombre) {
        return "Hola, " + nombre + " estás ejecutando un proyecto Gradle.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{nombre}"})
    public String saluda2(@PathVariable(required = false) String nombre) {
        if (nombre == null) nombre = "UNKNOWN";
        return "Hola, " + nombre + ". estás ejecutando un proyecto Gradle.";
    }
}




