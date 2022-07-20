package fr.fms.FMS_Spring_Trainings_Api.dao;

import java.util.Optional;

import fr.fms.FMS_Spring_Trainings_Api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {


}
