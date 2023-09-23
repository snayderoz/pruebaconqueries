package pe.edu.upc.practicar01.dtos;

import java.time.LocalDate;

public class UniversityDTO {
    private int idUniversity;
    private String nameUniversity;
    private String adressUniversity;
    private LocalDate creationDateUniversity;
    private String typeUniversity;

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
