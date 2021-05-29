package br.com.tony.marvelapi.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer available;
    private Integer returned;
    private String collectionURI;

    @OneToMany(cascade=CascadeType.PERSIST)
    private List<ComicSummary> items;

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

    public List<ComicSummary> getItems() {
        return items;
    }
}
