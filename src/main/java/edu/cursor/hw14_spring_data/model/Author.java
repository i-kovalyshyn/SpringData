package edu.cursor.hw14_spring_data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "authors")
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "First_Name", nullable = false)
    private String fName;
    @Column(name = "Last_Name", nullable = false)
    private String lName;
    @ManyToMany( fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="author_books", joinColumns= {@JoinColumn(name="author_id", referencedColumnName="id")},
        inverseJoinColumns={@JoinColumn(name="book_id", referencedColumnName = "id")})
    @JsonIgnore
    private Set<Book> books = new HashSet<>();

    public Author() {
    };

}
