package pe.edu.upc.practicar01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.practicar01.entities.Course;

import java.util.List;
@Repository
public interface ICourseRepository extends JpaRepository<Course, Integer> {
    @Query(value = "select u.name_university,count(c.id_course)\n" +
            " from university u inner join course c\n" +
            " on u.id_university=c.id_university\n" +
            " group by u.name_university",nativeQuery = true)
    public List<String[]> quantifyCoursesByUniversity();
}
