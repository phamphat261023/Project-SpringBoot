package com.example.projectSpringBoot.api;

import com.example.projectSpringBoot.dto.NewDTO;
import com.example.projectSpringBoot.entity.News;
import com.example.projectSpringBoot.service.impl.NewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewAPI {
    @Autowired
    private NewServiceImpl newService;
    @GetMapping("")
    public List<NewDTO> getAllNews(){
        List<NewDTO> getNew = newService.getAllNews();
        return getNew;
    }

    @PostMapping("")
    public NewDTO createNew(@RequestBody NewDTO model){
        return newService.save(model);
    }

    @PutMapping("/{id}")
    public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") long id){
        model.setId(id);
        return newService.save(model);
    }

    @DeleteMapping("")
    public void deleteNew(@RequestBody long[] id){

    }
}
