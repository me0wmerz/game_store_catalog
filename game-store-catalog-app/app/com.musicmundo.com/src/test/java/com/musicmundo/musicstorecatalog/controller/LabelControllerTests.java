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
//import java.util.List;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//public class LabelControllerTests {
//    @MockBean
//    private LabelRepository labelRepo;
//
//    private ObjectMapper mapper = new ObjectMapper();
//
//    private Label mockOutput;
//    private Label createInput;
//    private Label createOutput;
//    private List<Label> lList = lList = new ArrayList<>();;
//
//    private String allLabelsJson;
//    private String mockOutputJson;
//    private String createInputJson;
//    private String createOutputJson;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
////        Artist inputLabel = new Label(1, "TestLabel", "@TestIG", "@TestTwitter");
////        Label inputLabel = new Label(9, "TestLabel", "www.test.com");
//
//        Album inputLabel = new Label(1,"ABC Records", "www.abcrecords.com");
//    }
//
//    @Test
//    public void shouldCreateLabel() throws Exception {
//        mockMvc.perform(post("/label")
//                        .content(createInputJson)
//                        .contentType(MediaType.APPLICATION_JSON)
//                ).andDo(print())
//                .andExpect(status().isCreated())
//                .andExpect(content().json(createOutputJson));
//    }
//
//    @Test
//    public void shouldGetAllLabels() throws Exception {
//        mockMvc.perform(get("/label"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(allLabelsJson));
//    }
//
//    @Test
//    public void shouldGetLabelById() throws Exception {
//        mockMvc.perform(get("/label/" + labelId))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(mockOutputJson));
//    }
//    //
////    @Test
////    public void shouldReport404WhenFindAlbumByInvalidId() throws Exception {
////        mockMvc.perform(get("/label/" + nonExistentLabelId))
////                .andDo(print())
////                .andExpect(status().isNotFound());
////    }
////
//    @Test
//    public void shouldUpdateLabel() throws Exception {
//        mockMvc.perform(put("/label/" + labelId)
//                        .content(createLabelJson)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//    @Test
//    public void shouldDeleteLabel() throws Exception {
//        mockMvc.perform(delete("/label/" + labelId))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//}
