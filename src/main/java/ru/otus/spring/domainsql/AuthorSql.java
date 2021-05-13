package ru.otus.spring.domainsql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "authors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorSql {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="author_id", unique = true, nullable = false)
    private long id;

    @Column(name ="author_name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthorSql(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
