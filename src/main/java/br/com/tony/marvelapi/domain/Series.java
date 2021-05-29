package br.com.tony.marvelapi.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Series {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer available;
    private Integer returned;
    private String collectionURI;
    @OneToMany(cascade=CascadeType.PERSIST)
    private List<SeriesSummary> items;

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

    public List<SeriesSummary> getItems() {
        return items;
    }
}
