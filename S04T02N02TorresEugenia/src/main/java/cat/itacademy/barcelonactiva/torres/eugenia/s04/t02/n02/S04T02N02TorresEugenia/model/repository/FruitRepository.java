package cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n02.S04T02N02TorresEugenia.model.repository;
import cat.itacademy.barcelonactiva.torres.eugenia.s04.t02.n02.S04T02N02TorresEugenia.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {

}