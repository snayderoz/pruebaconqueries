package pe.edu.upc.practicar01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.practicar01.entities.University;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface IUniversityRepository extends JpaRepository<University, Integer> {
    List<University> findByCreationDateUniversity(LocalDate creationDateUniversity);

    @Query(value = "select u.name_university,sum(c.credits_course)\n" +
            " from university u inner join course c\n" +
            " on u.id_university=c.id_university\n" +
            " group by u.name_university",nativeQuery = true)
    List<String[]> creditsByUniversity();
}
