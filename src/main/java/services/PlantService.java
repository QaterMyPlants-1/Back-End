package services;

import models.Plant;
import models.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Service(value = "plantService")
public interface PlantService {

    List<Plant> findAllPlants();

    List<Plant> findAllUserPlants(long userId);

    Plant findPlantById(long plantid);

    Plant findPlantByName(String name);

    Plant save(User user, Plant plant);


    void deletePlantById(long plantid);

    void deletePlantByName(String name);





}
