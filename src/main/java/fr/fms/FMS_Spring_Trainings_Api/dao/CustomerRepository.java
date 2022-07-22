package fr.fms.FMS_Spring_Trainings_Api.dao;

import fr.fms.FMS_Spring_Trainings_Api.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;


@CrossOrigin("*")
@RepositoryRestResource
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByMail(String mail);
}
