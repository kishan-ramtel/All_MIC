package com.latest.allmic.entity.playlist;


import com.latest.allmic.entity.audio.Audio;
import com.latest.allmic.entity.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "playlist", uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "audio_id", "plyLisNo"}))
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PlayList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "audio_id")
    private Audio audio;

    @Column(nullable = false)
    private Integer plyLisNo;

    @Column(length = 60)
    private String plyLisName;

    private LocalDateTime addedAt;

    @PrePersist
    protected void onCreate(){
        this.addedAt = LocalDateTime.now();
    }

}
