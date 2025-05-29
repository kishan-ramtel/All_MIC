package com.latest.allmic.entity.audio;

import com.latest.allmic.entity.audioGenre.AudioGenre;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "audio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(length = 2000)
    private String description;

    @Column(nullable = false)
    private String audioURl;

    @Column(nullable = false)
    private Long duration;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "audio", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<AudioGenre> audioGenres = new HashSet<>();

    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
    }
}
