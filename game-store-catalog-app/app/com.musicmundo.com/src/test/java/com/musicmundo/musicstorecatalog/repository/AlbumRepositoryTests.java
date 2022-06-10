package com.musicmundo.musicstorecatalog.repository;

import com.musicmundo.musicstorecatalog.model.Album;
import com.musicmundo.musicstorecatalog.model.Artist;
import com.musicmundo.musicstorecatalog.model.Label;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AlbumRepositoryTests {

//    @Autowired
//    TrackRepository trackRepository;
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    ArtistRepository artistRepository;
    @Autowired
    LabelRepository labelRepository;

    @Before
    public void setUp() throws Exception {
//        trackRepository.deleteAll();
        albumRepository.deleteAll();
        artistRepository.deleteAll();
        labelRepository.deleteAll();
    }

    @Test
    public void addGetDeleteAlbum() {

        // Need to create a Label and an Artist first
        Label label = new Label();
        label.setName("Good Music Records");
        label.setWebsite("www.GMR.com");
        label = labelRepository.save(label);

        Artist artist = new Artist();
        artist.setName("Stu Boy");
        artist.setInstagram("@StuTheCat");
        artist.setTwitter("@StuTheCat");
        artist = artistRepository.save(artist);

        Album album = new Album();
        album.setTitle("Greatest Hits");
        album.setArtistId(artist.getId());
        album.setReleaseDate(LocalDate.of(2010, 1, 5));
        album.setLabelId(label.getId());
        album.setListPrice(new BigDecimal("19.95"));

        album = albumRepository.save(album);

        Optional<Album> album1 = albumRepository.findById(album.getId());

        assertEquals(album1.get(), album);

        albumRepository.deleteById(album.getId());

        album1 = albumRepository.findById(album.getId());

        assertFalse(album1.isPresent());

    }

    @Test
    public void getAllAlbums() {

        // Need to create a Label and an Artist first
        Label label = new Label();
        label.setName("Wonderful Tunes");
        label.setWebsite("www.wonderfultunes.com");
        label = labelRepository.save(label);

        Artist artist = new Artist();
        artist.setName("Noni Noni");
        artist.setInstagram("@NoniGurlie");
        artist.setTwitter("@TheOneAndOnlyNoni");
        artist = artistRepository.save(artist);

        Album album = new Album();
        album.setTitle("Greatest Hits");
        album.setArtistId(artist.getId());
        album.setLabelId(label.getId());
        album.setReleaseDate(LocalDate.of(2020, 6, 5));
        album.setListPrice(new BigDecimal("22.95"));

        album = albumRepository.save(album);

        album = new Album();
        album.setTitle("Happy Happy");
        album.setArtistId(artist.getId());
        album.setLabelId(label.getId());
        album.setReleaseDate(LocalDate.of(2022, 4, 7));
        album.setListPrice(new BigDecimal("14.95"));

        album = albumRepository.save(album);

        List<Album> aList = albumRepository.findAll();

        assertEquals(aList.size(), 2);

    }

    @Test
    public void updateAlbum() {

        Label label = new Label();
        label.setName("Lovely Records");
        label.setWebsite("www.lovelyentertainment.com");
        label = labelRepository.save(label);

        Artist artist = new Artist();
        artist.setName("Terry Jerry");
        artist.setInstagram("@TheTJ");
        artist.setTwitter("@ItsMeTJ");
        artist = artistRepository.save(artist);

        Album album = new Album();
        album.setTitle("Greatest Hits");
        album.setArtistId(artist.getId());
        album.setLabelId(label.getId());
        album.setReleaseDate(LocalDate.of(2000, 7, 7));
        album.setListPrice(new BigDecimal("9.95"));

        album = albumRepository.save(album);

        album.setTitle("Too Fast Too Furious");
        album.setReleaseDate(LocalDate.of(2000, 8, 8));
        album.setListPrice(new BigDecimal("11.99"));

        albumRepository.save(album);

        Optional<Album> album1 = albumRepository.findById(album.getId());
        assertEquals(album1.get(), album);

    }
}
