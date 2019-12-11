package com.ops1ops.films.model;

import javax.persistence.*;

@Entity
@Table(name = "film_images")
public class FilmImage extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "film_id", referencedColumnName = "id", nullable = false)
    private Film film;

    @Column(name = "url", nullable = false)
    private String url;
}
