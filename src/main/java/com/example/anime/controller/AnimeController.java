package com.example.anime.controller;

import com.example.anime.exception.ResourceNotFoundException;
import com.example.anime.model.Anime;
import com.example.anime.model.AnimeInfo;
import com.example.anime.repository.AnimeInfoRespository;
import com.example.anime.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//http://animeangular.s3-website.us-east-2.amazonaws.com
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class AnimeController
{
    @Autowired
    private AnimeRepository animeRepository;

    @GetMapping("/animes")
    public List<Anime> getAllAnimes()
    {
        return animeRepository.findAll();
    }

    @PostMapping("/animes")
    public Anime createAnime(@RequestBody Anime anime)
    {
        return animeRepository.save(anime);
    }

    @GetMapping("/animes/{id}")
    public ResponseEntity<Anime> getAnimeById(@PathVariable Long id){
        Anime anime = animeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Anime does not exists id: " + id));
        return ResponseEntity.ok(anime);
    }

    @PutMapping("/animes/{id}")
    public ResponseEntity<Anime> updateAnime(@PathVariable Long id, @RequestBody Anime animeDetails){
        Anime anime = animeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Anime does not exists id: " + id));
        anime.setName(animeDetails.getName());
        anime.setEpisodes(animeDetails.getEpisodes());
        anime.setImage(animeDetails.getImage());
        anime.setGenre(animeDetails.getGenre());

        Anime updateAnime = animeRepository.save(anime);
        return ResponseEntity.ok(updateAnime);
    }
}
