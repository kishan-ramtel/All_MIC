package com.latest.allmic.dtos.history;

import com.latest.allmic.dtos.audio.AudioDTO;
import com.latest.allmic.dtos.user.UserDTO;
import lombok.*;

import java.time.LocalDateTime;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoryDTO {

    private Long id;

    private AudioDTO audioDTO;

    private UserDTO userDTO;

    private LocalDateTime createdAt;

}
