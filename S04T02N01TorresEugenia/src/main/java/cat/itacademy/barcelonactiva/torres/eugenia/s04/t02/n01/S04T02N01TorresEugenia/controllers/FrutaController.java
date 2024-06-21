package cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n01.S04T02N01TorresEugenia.controllers;
import cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n01.S04T02N01TorresEugenia.modelo.domain.Fruta;
import cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n01.S04T02N01TorresEugenia.modelo.services.FrutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/fruta")
public class FrutaController {

    @Autowired
    private FrutaService frutaService;


    @PostMapping("/add")
    public ResponseEntity<Fruta> addFruta(@RequestBody Fruta fruta){
        Fruta newFruta = frutaService.addFruta(fruta);
        return new ResponseEntity<>(newFruta,HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Fruta> updateFruta(@RequestBody Fruta fruta){
        Fruta newFruta = frutaService.updateFruta(fruta);
        return new ResponseEntity<>(newFruta,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruta(@PathVariable int id){
        frutaService.deleteFruta(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruta> getFruta(@PathVariable int id){
        Fruta fruta = frutaService.getFruta(id);
        return new ResponseEntity<>(fruta,HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruta>>getAllFruta(){
        List<Fruta> frutas = frutaService.getAllFrutas();
        return new ResponseEntity<>(frutas,HttpStatus.OK);
    }
}
