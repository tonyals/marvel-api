package br.com.tony.marvelapi.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer available;
    private Integer returned;
    private String collectionURI;
    @OneToMany(cascade=CascadeType.PERSIST)
    private List<StorySummary> items;

    public Long getId() {
        return id;
    }

    public Integer getAvailable() {
        return available;
    }

    public Integer getReturned() {
        return returned;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public List<StorySummary> getItems() {
        return items;
    }
}
