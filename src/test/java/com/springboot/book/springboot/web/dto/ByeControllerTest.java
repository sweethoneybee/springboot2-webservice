package com.springboot.book.springboot.web.dto;

import com.springboot.book.springboot.web.ByeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ByeController.class)
public class ByeControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void bye가_리턴된다() throws Exception {
        String bye = "bye";

        mvc.perform(get("/bye"))
                .andExpect(status().isOk())
                .andExpect(content().string(bye));
    }
}
