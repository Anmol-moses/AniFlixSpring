package com.example.anime.model;

import javax.persistence.*;

@Entity
@Table(name = "Anime")
public class Anime
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "episodes")
    private int episodes;

    @Lob
    @Column(name = "image")
    private String image;

    @Column(name = "genre")
    private String genre;

    public String getSlug()
    {
        return slug;
    }

    public void setSlug(String slug)
    {
        this.slug = slug;
    }

    @Lob
    @Column(name = "slug")
    private String slug;

    public Anime()
    {
    }

    public Anime(long id, String name, int episodes, String image, String genre)
    {
        this.id = id;
        this.name = name;
        this.episodes = episodes;
        this.image = image;
        this.genre = genre;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getEpisodes()
    {
        return episodes;
    }

    public void setEpisodes(int episodes)
    {
        this.episodes = episodes;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }
}
