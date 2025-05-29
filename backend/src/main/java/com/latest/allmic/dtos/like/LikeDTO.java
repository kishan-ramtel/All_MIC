package com.latest.allmic.dtos.like;

import com.latest.allmic.dtos.audio.AudioDTO;
import com.latest.allmic.dtos.user.UserDTO;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LikeDTO {

    private Long id;

    private Boolean liked;

    private UserDTO userDTO;

    private AudioDTO audioDTO;
}
