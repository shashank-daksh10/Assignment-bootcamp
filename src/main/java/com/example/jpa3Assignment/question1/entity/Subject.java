package com.example.jpa3Assignment.question1.entity;


import com.example.jpa3Assignment.question1.entity.Author;
import jakarta.persistence.*;

@Entity
public class Subject {
    @Id
    int id;
    private String SubjectName;



    @JoinColumn(name = "author_id")
    @ManyToOne()
    private Author author;

    public Subject() {
    }

    public Subject(int id, String subjectName,Author author) {
        this.id = id;
        SubjectName = subjectName;
        this.author=author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", SubjectName='" + SubjectName + '\'' +
                '}';
    }
}
