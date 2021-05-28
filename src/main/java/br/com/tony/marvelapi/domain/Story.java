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
    @OneToMany
    private List<StorySummary> items;
}
