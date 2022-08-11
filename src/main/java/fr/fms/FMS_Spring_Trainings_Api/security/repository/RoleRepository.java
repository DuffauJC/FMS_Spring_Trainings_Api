package fr.fms.FMS_Spring_Trainings_Api.security.repository;

import java.util.Optional;

import fr.fms.FMS_Spring_Trainings_Api.security.models.ERole;
import fr.fms.FMS_Spring_Trainings_Api.security.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
