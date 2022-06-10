//package com.musicmundo.musicstorecatalog.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.musicmundo.musicstorecatalog.model.Album;
//import com.musicmundo.musicstorecatalog.repository.AlbumRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
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
//public class TrackControllerTests {
//    @MockBean
//    private TrackRepository trackRepo;
//
//    private ObjectMapper mapper = new ObjectMapper();
//
//    private Track mockOutput;
//    private Track createInput;
//    private Track createOutput;
//    private List<Track> tList = tList = new ArrayList<>();;
//
//    private String allTracksJson;
//    private String mockOutputJson;
//    private String createInputJson;
//    private String createOutputJson;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
////        Label inputLabel = new Label(9, "TestLabel", "www.test.com");
//
//        Track inputTrack = new Track(1, 1, "TestTrack", 100);
//    }
//
//    @Test
//    public void shouldCreateTrack() throws Exception {
//        mockMvc.perform(post("/track")
//                        .content(createInputJson)
//                        .contentType(MediaType.APPLICATION_JSON)
//                ).andDo(print())
//                .andExpect(status().isCreated())
//                .andExpect(content().json(createOutputJson));
//    }
//
//    @Test
//    public void shouldGetAllTracks() throws Exception {
//        mockMvc.perform(get("/track"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(allTracksJson));
//    }
//
//    @Test
//    public void shouldGetTrackById() throws Exception {
//        mockMvc.perform(get("/track/" + trackId))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(mockOutputJson));
//    }
//    //
////    @Test
////    public void shouldReport404WhenFindTrackByInvalidId() throws Exception {
////        mockMvc.perform(get("/track/" + nonExistentTrackId))
////                .andDo(print())
////                .andExpect(status().isNotFound());
////    }
////
//    @Test
//    public void shouldUpdateTrack() throws Exception {
//        mockMvc.perform(put("/track/" + trackId)
//                        .content(createTrackJson)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//    @Test
//    public void shouldDeleteTrack() throws Exception {
//        mockMvc.perform(delete("/track/" + trackId))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//}
