package com.example.projectSpringBoot.service.impl;

import com.example.projectSpringBoot.convert.NewConverter;
import com.example.projectSpringBoot.dto.NewDTO;
import com.example.projectSpringBoot.entity.Category;
import com.example.projectSpringBoot.entity.News;
import com.example.projectSpringBoot.repository.ICategoryRepository;
import com.example.projectSpringBoot.repository.INewRepository;
import com.example.projectSpringBoot.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NewServiceImpl implements INewService {
    @Autowired
    private INewRepository newRepository;

    @Autowired
    private ICategoryRepository  categoryRepository;

    @Autowired
    private NewConverter newConverter;

    @Override
    public NewDTO save(NewDTO newDTO) {
        Category category = categoryRepository.findOneByCode(newDTO.getCategoryCode());
        News newEntity = newConverter.toEntity(newDTO);
        newEntity.setCategory(category);
        newEntity = newRepository.save(newEntity);
        return newConverter.toDTO(newEntity);
    }

    @Override
    public List<NewDTO> getAllNews() {
        return((List<News>) newRepository.findAll()).stream().map(
                this:: getNewDTO
        ).collect(Collectors.toList());
    }

    private NewDTO getNewDTO(News newEntity){
        NewDTO newDTO = new NewDTO();
        newDTO.setTitle(newEntity.getTitle());
        newDTO.setThumbnail(newEntity.getThumbNail());
        newDTO.setShortDescription(newEntity.getShortDescription());
        newDTO.setContent(newEntity.getContent());
        return newDTO;
    }
}
