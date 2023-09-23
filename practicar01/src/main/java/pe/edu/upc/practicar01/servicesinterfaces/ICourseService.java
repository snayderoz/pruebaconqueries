package pe.edu.upc.practicar01.servicesinterfaces;

import pe.edu.upc.practicar01.entities.Course;

import java.util.List;

public interface ICourseService {
    public void insert(Course course);
    public List<Course> list();
    public List<String[]> quantifyCoursesByUniversity();

}
