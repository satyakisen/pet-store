package com.naruto.petstoreserver.pet;

import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pet")
@Getter
@Setter
@Builder
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JsonProperty(required = true)
    private String name;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "photourls", columnDefinition = "jsonb")
    @JsonProperty(required = true)
    private List<String> photoUrls;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private List<Tag> tags;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private Category category;

    public Pet() {
    }

    public Pet(int id, String name, List<String> photoUrls, List<Tag> tags, Category category) {
        this.id = id;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.category = category;
    }
}
