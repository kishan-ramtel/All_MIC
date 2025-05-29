package com.latest.allmic.dtos.audio;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AudioDTO {

    @NotNull
    private Long id;

    @NotNull
    private String title;

    private String description;

    @NotNull
    private String audioURl;

    @NotNull
    private Long duration;

    @NotNull
    private String audioProfileURL;

    @NotNull
    private List<String> genre;
}
