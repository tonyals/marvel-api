package br.com.tony.marvelapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String path;
    private String extension;

    public Long getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public String getExtension() {
        return extension;
    }
}
