package com.example.anime.model;

import javax.persistence.*;

@Entity
@Table(name = "AnimeInfo")
public class AnimeInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "anime_id")
    private Anime anime;

    @Lob
    @Column(name = "animeLogo")
    private String animeLogo;

    @Column(name = "year")
    private int year;

    @Column(name = "age")
    private int age;

    @Column(name = "duration")
    private String duration;

    @Column(name = "genre")
    private String genre;

    @Lob
    @Column(name = "discription")
    private String discription;

    @Lob
    @Column(name = "trailer")
    private String trailer;

    @Lob
    @Column(name = "animePoster")
    private String poster;

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

    public AnimeInfo()
    {
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Anime getAnime()
    {
        return anime;
    }

    public void setAnime(Anime anime)
    {
        this.anime = anime;
    }

    public String getAnimeLogo()
    {
        return animeLogo;
    }

    public void setAnimeLogo(String animeLogo)
    {
        this.animeLogo = animeLogo;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getDuration()
    {
        return duration;
    }

    public void setDuration(String duration)
    {
        this.duration = duration;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public String getDiscription()
    {
        return discription;
    }

    public void setDiscription(String discription)
    {
        this.discription = discription;
    }

    public String getTrailer()
    {
        return trailer;
    }

    public void setTrailer(String trailer)
    {
        this.trailer = trailer;
    }

    public String getPoster()
    {
        return poster;
    }

    public void setPoster(String poster)
    {
        this.poster = poster;
    }

}
