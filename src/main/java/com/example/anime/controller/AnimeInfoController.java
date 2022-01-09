package com.example.anime.controller;

import com.example.anime.exception.ResourceNotFoundException;
import com.example.anime.model.AnimeInfo;
import com.example.anime.repository.AnimeInfoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://animeangular.s3-website.us-east-2.amazonaws.com")
@RestController
@RequestMapping("/api/v1")
public class AnimeInfoController
{
    @Autowired
    private AnimeInfoRespository animeInfoRespository;

    @GetMapping("/animeInfo")
    public List<AnimeInfo> getAllAnimeInfo(){
        return animeInfoRespository.findAll();
    }

    @GetMapping("/animeInfo/{id}")
    public ResponseEntity<AnimeInfo> getAnimeById(@PathVariable Long id){
        AnimeInfo animeInfo = animeInfoRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Anime does not exists id: " + id));
        return ResponseEntity.ok(animeInfo);
    }

    @PostMapping("/animeInfo")
    public AnimeInfo createAnime(@RequestBody AnimeInfo anime)
    {
        return animeInfoRespository.save(anime);
    }
}
