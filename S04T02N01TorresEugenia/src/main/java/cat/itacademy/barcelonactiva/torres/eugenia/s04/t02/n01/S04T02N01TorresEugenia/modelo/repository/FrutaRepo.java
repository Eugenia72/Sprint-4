package cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n01.S04T02N01TorresEugenia.modelo.repository;

import cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n01.S04T02N01TorresEugenia.modelo.domain.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FrutaRepo extends JpaRepository<Fruta, Integer> {

}
