package fr.fms.FMS_Spring_Trainings_Api.dao;

import fr.fms.FMS_Spring_Trainings_Api.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
@Repository
public interface OrderRepository extends JpaRepository<Orders,Long> {


}
