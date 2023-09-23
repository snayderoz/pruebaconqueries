package pe.edu.upc.practicar01.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.practicar01.entities.University;
import pe.edu.upc.practicar01.repositories.IUniversityRepository;
import pe.edu.upc.practicar01.servicesinterfaces.IUniversityService;

import java.time.LocalDate;
import java.util.List;

@Service
public class UniversityServiceImplement implements IUniversityService {
    @Autowired
    private IUniversityRepository uR;


    @Override
    public void insert(University university) {
        uR.save(university);
    }

    @Override
    public List<University> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUniversity) {
        uR.deleteById(idUniversity);
    }

    @Override
    public University listarId(int idUniversity) {
        return uR.findById(idUniversity).orElse(new University());
    }

    @Override
    public List<University> findByCreationDateUniversity(LocalDate creationDateUniversity) {
        return uR.findByCreationDateUniversity(creationDateUniversity);
    }

    @Override
    public List<String[]> creditsByUniversity() {
        return uR.creditsByUniversity();
    }


}
