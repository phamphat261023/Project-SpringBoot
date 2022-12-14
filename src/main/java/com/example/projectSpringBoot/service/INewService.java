package com.example.projectSpringBoot.service;

import com.example.projectSpringBoot.dto.NewDTO;
import com.example.projectSpringBoot.repository.INewRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface INewService {
    NewDTO save(NewDTO newDTO);
    public List<NewDTO> getAllNews();
    //NewDTO update(NewDTO newDTO);
}
