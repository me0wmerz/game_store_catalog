//package com.musicmundo.musicstorecatalog.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.musicmundo.musicstorecatalog.model.Album;
//import com.musicmundo.musicstorecatalog.repository.AlbumRepository;
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
//import java.time.LocalDate;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(AlbumInventoryController.class)
//public class AlbumControllerTest {
//
//    @MockBean
//    private AlbumRepository albumRepo;
//
//    private ObjectMapper mapper = new ObjectMapper();
//
//    private Album mockOutput;
//    private Album createInput;
//    private Album createOutput;
//
//    private String allAlbumsJson;
//    private String mockOutputJson;
//    private String createInputJson;
//    private String createOutputJson;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
//        Album inputAlbum = new Album(1,"Greatest Hits", 1, LocalDate.of(2010, 1, 5), 1,new BigDecimal("19.99"));
//    }
//
//    @Test
//    public void shouldCreateAlbum() throws Exception {
//        mockMvc.perform(post("/album")
//                        .content(createInputJson)
//                        .contentType(MediaType.APPLICATION_JSON)
//                ).andDo(print())
//                .andExpect(status().isCreated())
//                .andExpect(content().json(createOutputJson));
//    }
//
//    @Test
//    public void shouldGetAllAlbums() throws Exception {
//        mockMvc.perform(get("/album"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(allAlbumsJson));
//    }
//
//    @Test
//    public void shouldGetAlbumById() throws Exception {
//        mockMvc.perform(get("/album/" + albumId))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(mockOutputJson));
//    }
//
//    @Test
//    public void shouldUpdateAlbum() throws Exception {
//        mockMvc.perform(put("/album/" + albumId)
//                        .content(createAlbumJson)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//    @Test
//    public void shouldDeleteAlbum() throws Exception {
//        mockMvc.perform(delete("/album/" + albumId))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//}