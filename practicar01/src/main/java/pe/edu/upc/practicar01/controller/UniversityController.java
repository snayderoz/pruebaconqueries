package pe.edu.upc.practicar01.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.practicar01.dtos.CreditsUniversityDTO;
import pe.edu.upc.practicar01.dtos.UniversityDTO;
import pe.edu.upc.practicar01.entities.University;
import pe.edu.upc.practicar01.servicesinterfaces.IUniversityService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/universidades")
public class UniversityController {
    @Autowired
    private IUniversityService uS;

    @PostMapping
    public void registrar(@RequestBody UniversityDTO dto) {
        ModelMapper m = new ModelMapper();
        University u = m.map(dto, University.class);
        uS.insert(u);
    }

    @PutMapping
    public void modificar(@RequestBody UniversityDTO dto) {
        ModelMapper m = new ModelMapper();
        University u = m.map(dto, University.class);
        uS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {uS.delete(id);}

    @GetMapping("/{id}")
    public UniversityDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UniversityDTO dto = m.map(uS.listarId(id), UniversityDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<UniversityDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UniversityDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscar")
    public List<UniversityDTO> buscar(@RequestBody LocalDate fecha) {
        return uS.findByCreationDateUniversity(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UniversityDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/sumacreditos")
    @PreAuthorize("hasAuthority('USER')")
    public List<CreditsUniversityDTO> sumaCreditosPorUniversidad() {

        List<String[]> lista=uS.creditsByUniversity();
        List<CreditsUniversityDTO> listaDTO=new ArrayList<>();
        for(String[] data:lista){
            CreditsUniversityDTO dto=new CreditsUniversityDTO();
            dto.setNameUniversity(data[0]);
            dto.setSumCredits(Integer.parseInt(data[1]));
            listaDTO.add(dto);

        }
        return listaDTO;
    }

}
