package cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n01.S04T02N01TorresEugenia.modelo.services;

import cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n01.S04T02N01TorresEugenia.modelo.domain.Fruta;
import cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n01.S04T02N01TorresEugenia.modelo.repository.FrutaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FrutaService {

    @Autowired
    private FrutaRepo frutaRepo;

     

        public Fruta addFruta(Fruta fruta){
            return frutaRepo.save(fruta);
        }

    public Fruta updateFruta(Fruta fruta){
        return frutaRepo.save(fruta);
    }
        public void deleteFruta(int idFruta) {
            frutaRepo.deleteById(idFruta);
        }

        public Fruta getFruta(int idFruta) {
            Optional<Fruta> fruta = frutaRepo.findById(idFruta);
            return fruta.orElse(null);
        }

        public List<Fruta> getAllFrutas() {

            return frutaRepo.findAll();
        }

    }

