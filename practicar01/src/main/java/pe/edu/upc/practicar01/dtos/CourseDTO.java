package pe.edu.upc.practicar01.dtos;

import pe.edu.upc.practicar01.entities.University;

public class CourseDTO {
    private int idCourse;
    private String nameCourse;
    private int creditsCourse;
    private String TypeCourse;
    private int semesterCourse;
    private University university;

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getCreditsCourse() {
        return creditsCourse;
    }

    public void setCreditsCourse(int creditsCourse) {
        this.creditsCourse = creditsCourse;
    }

    public String getTypeCourse() {
        return TypeCourse;
    }

    public void setTypeCourse(String typeCourse) {
        TypeCourse = typeCourse;
    }

    public int getSemesterCourse() {
        return semesterCourse;
    }

    public void setSemesterCourse(int semesterCourse) {
        this.semesterCourse = semesterCourse;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
