/*
 * Lucien
 */
package com.example.movieticket.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import lombok.NonNull;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "movies")
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

}
