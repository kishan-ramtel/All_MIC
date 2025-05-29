package com.latest.allmic.dtos.playlist;

import com.latest.allmic.dtos.audio.AudioDTO;
import com.latest.allmic.dtos.user.UserDTO;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayListDTO {

    private Long id;

    private UserDTO userDTO;

    private AudioDTO audioDTO;

    private Integer playListNo;

    private String playListName;

    private LocalDateTime addedAt;

}
