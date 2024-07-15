package cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n02.S04T02N02TorresEugenia.model.service;
import cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n02.S04T02N02TorresEugenia.model.domain.Fruit;
import cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n02.S04T02N02TorresEugenia.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public Fruit addFruit(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(int id) {
        fruitRepository.deleteById(id);
    }

    public Fruit getFruit(int id) {
        Optional<Fruit> fruit = fruitRepository.findById(id);
        return fruit.orElse(null);
    }

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

}