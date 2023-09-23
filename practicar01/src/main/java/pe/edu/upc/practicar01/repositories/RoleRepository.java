package pe.edu.upc.practicar01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.practicar01.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}