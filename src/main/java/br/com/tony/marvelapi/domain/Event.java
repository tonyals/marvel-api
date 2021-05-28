package br.com.tony.marvelapi.domain;

import javax.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer available;
    private Integer returned;
    private String collectionURI;
    @OneToOne
    private EventSummary items;
}
