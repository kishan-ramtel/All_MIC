package com.latest.allmic.entity.audio;

import com.latest.allmic.entity.genre.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "audio_genre")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AudioGenre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "audio_id", nullable = false)
    private Audio audio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genre_id", nullable = false)
    private Genre genre;

    private LocalDateTime addedAt;

    @PrePersist
    protected void onCreate(){
        this.addedAt =LocalDateTime.now();
    }
}
