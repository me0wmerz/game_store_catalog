//package com.musicmundo.musicstorecatalog.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.musicmundo.musicstorecatalog.model.Album;
//import com.musicmundo.musicstorecatalog.model.Artist;
//import com.musicmundo.musicstorecatalog.repository.AlbumRepository;
//import com.musicmundo.musicstorecatalog.repository.ArtistRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(AlbumInventoryController.class)
//public class ArtistControllerTests {
//    @MockBean
//    private ArtistRepository albumRepo;
//
//    private ObjectMapper mapper = new ObjectMapper();
//
//    private Artist mockOutput;
//    private Artist createInput;
//    private Artist createOutput;
//    private List<Artist> aList = aList = new ArrayList<>();;
//
//    private String allArtistsJson;
//    private String mockOutputJson;
//    private String createInputJson;
//    private String createOutputJson;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
////        Artist inputArtist = new Artist(1, "TestArtist", "@TestIG", "@TestTwitter");
////        Label inputLabel = new Label(9, "TestLabel", "www.test.com");
//
//        Artist inputArtist = new Artist(1,);
//    }
//
//    @Test
//    public void shouldCreateArtist() throws Exception {
//        mockMvc.perform(post("/artist")
//                        .content(createInputJson)
//                        .contentType(MediaType.APPLICATION_JSON)
//                ).andDo(print())
//                .andExpect(status().isCreated())
//                .andExpect(content().json(createOutputJson));
//    }
//
//    @Test
//    public void shouldGetAllArtists() throws Exception {
//        mockMvc.perform(get("/artist"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(allArtistsJson));
//    }
//
//    @Test
//    public void shouldGetArtistById() throws Exception {
//        mockMvc.perform(get("/artist/" + artistId))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(mockOutputJson));
//    }
//    //
////    @Test
////    public void shouldReport404WhenFindAlbumByInvalidId() throws Exception {
////        mockMvc.perform(get("/artist/" + nonExistentArtistId))
////                .andDo(print())
////                .andExpect(status().isNotFound());
////    }
////
//    @Test
//    public void shouldUpdateArtist() throws Exception {
//        mockMvc.perform(put("/artist/" + artistId)
//                        .content(createArtistJson)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//    @Test
//    public void shouldDeleteArtist() throws Exception {
//        mockMvc.perform(delete("/artist/" + artistId))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//}
