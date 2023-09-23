package pe.edu.upc.practicar01.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="University")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversity;
    @Column(name = "nameUniversity",nullable = false,length = 50)
    private String nameUniversity;
    @Column(name = "adressUniversity",nullable = false,length = 50)
    private String adressUniversity;
    @Column(name = "creationDateUniversity",nullable = false)
    private LocalDate creationDateUniversity;
    @Column(name = "typeUniversity",nullable = false,length = 50)
    private String typeUniversity;

    public University() {
    }

    public University(int idUniversity, String nameUniversity, String adressUniversity, LocalDate creationDateUniversity, String typeUniversity) {
        this.idUniversity = idUniversity;
        this.nameUniversity = nameUniversity;
        this.adressUniversity = adressUniversity;
        this.creationDateUniversity = creationDateUniversity;
        this.typeUniversity = typeUniversity;
    }

    public int getIdUniversity() {
        return idUniversity;
    }

    public void setIdUniversity(int idUniversity) {
        this.idUniversity = idUniversity;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String getAdressUniversity() {
        return adressUniversity;
    }

    public void setAdressUniversity(String adressUniversity) {
        this.adressUniversity = adressUniversity;
    }

    public LocalDate getCreationDateUniversity() {
        return creationDateUniversity;
    }

    public void setCreationDateUniversity(LocalDate creationDateUniversity) {
        this.creationDateUniversity = creationDateUniversity;
    }

    public String getTypeUniversity() {
        return typeUniversity;
    }

    public void setTypeUniversity(String typeUniversity) {
        this.typeUniversity = typeUniversity;
    }
}
