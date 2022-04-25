package com.bezkoder.springjwt.models;


import javax.persistence.*;

@Entity
@Table(name="tasks")
public class Task {

    @Id
    @SequenceGenerator(name="task_seq", sequenceName = "task_seq", allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "task_seq")
    private  Long id;
    private  String title;

    public Task() {

    }

    public Task(long i, String task1) {
        id = i;
        title = task1;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


}
