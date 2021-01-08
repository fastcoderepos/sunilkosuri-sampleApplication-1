package com.fastcode.example.domain.Temp;

import java.time.*;
import java.util.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(schema = "DVDRENTAL", name = "LANGUAGE")
public class Language {

    @OneToMany(
        targetEntity = com.fastcode.example.domain.Temp.Film.class,
        mappedBy = "language",
        cascade = CascadeType.MERGE
    )
    private Set<Film> films = new HashSet<Film>();

    @Id
    @Column(name = "LANGUAGE_ID")
    private int languageId;

    @Basic
    @Column(name = "LAST_UPDATE", nullable = false)
    private LocalDateTime lastUpdate;

    @Basic
    @Column(nullable = false, length = 20)
    private String name;

    public Language() {}

    public Language(int languageId) {
        this.languageId = languageId;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}