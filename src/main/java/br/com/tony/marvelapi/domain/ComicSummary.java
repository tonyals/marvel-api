package br.com.tony.marvelapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ComicSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String resourceURI;
    private String name;

    public Long getId() {
        return id;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public String getName() {
        return name;
    }
}
