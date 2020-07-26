package repositories;

import models.Plant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlantRepository extends CrudRepository {

    Plant findPlantByName(String name);

    List<Plant> findPlantByUserId(long id);
}
