package org.j8unit.spring.showcase.mvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.j8unit.spring.runners.J8SpringJUnit4ClassRunner;
import org.j8unit.spring.showcase.SpringContext;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(J8SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringContext.class })
@WebAppConfiguration
public class FooBarControllerImplTest
implements FooBarControllerTest {

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private FooBarController subjectUnderTest;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testControllerFoo()
    throws Exception {
        this.mockMvc.perform(get("/foobar").accept(MediaType.parseMediaType("application/json"))).andExpect(status().isOk());
    }

    @Override
    public FooBarController createNewSUT() {
        return this.subjectUnderTest;
    }

}
