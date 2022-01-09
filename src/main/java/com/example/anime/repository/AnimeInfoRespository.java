package com.example.anime.repository;

import com.example.anime.model.AnimeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeInfoRespository extends JpaRepository<AnimeInfo, Long>
{
}
