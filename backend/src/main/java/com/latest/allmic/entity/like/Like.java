package com.latest.allmic.entity.like;

import com.latest.allmic.entity.audio.Audio;
import com.latest.allmic.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "like")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean liked;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "audio_id")
    private Audio audio;

    private LocalDateTime addedAt;

    @PrePersist
    protected void onCreate(){
        this.addedAt = LocalDateTime.now();
    }
}
