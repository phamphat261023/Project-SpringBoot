package com.example.projectSpringBoot.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NewDTO extends AbstractDTO<NewDTO> {
    private String title;
    private String content;
    private String shortDescription;
    private String categoryCode;
    private String thumbnail;
}
