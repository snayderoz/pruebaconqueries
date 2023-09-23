package pe.edu.upc.practicar01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.practicar01.entities.Course;
import pe.edu.upc.practicar01.repositories.ICourseRepository;
import pe.edu.upc.practicar01.servicesinterfaces.ICourseService;

import java.util.List;

@Service
public class CourseServiceImplement implements ICourseService {
    @Autowired
    private ICourseRepository cR;

    @Override
    public void insert(Course course) {
        cR.save(course);
    }

    @Override
    public List<Course> list() {
        return cR.findAll();
    }

    @Override
    public List<String[]> quantifyCoursesByUniversity() {
        return cR.quantifyCoursesByUniversity();
    }

}
