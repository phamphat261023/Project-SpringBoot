package com.example.projectSpringBoot.convert;

import com.example.projectSpringBoot.dto.NewDTO;
import com.example.projectSpringBoot.entity.News;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {
    public News toEntity(NewDTO dto){
        News newEntity = new News();
        newEntity.setTitle(dto.getTitle());
        newEntity.setThumbNail(dto.getThumbnail());
        newEntity.setShortDescription(dto.getShortDescription());
        newEntity.setContent(dto.getContent());
        return newEntity;
    }

    public NewDTO toDTO(News newEntity){
        NewDTO newDTO = new NewDTO();
        newDTO.setTitle(newEntity.getTitle());
        newDTO.setThumbnail(newEntity.getThumbNail());
        newDTO.setShortDescription(newEntity.getShortDescription());
        newDTO.setContent(newEntity.getContent());
        return newDTO;
    }
}
