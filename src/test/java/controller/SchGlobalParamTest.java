package controller;

import com.controller.SchGlobalParamController;
import com.dao.SchGlobalParamMapper;
import com.entity.SchGlobalParam;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Date;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class SchGlobalParamTest {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new SchGlobalParamController()).build();
    }


    /*@Test
    public void testSchGlobalParamController() throws Exception {
        // 测试UserController
        RequestBuilder request = null;

        // 1、get查一下user列表，应该为空
        request = get("/scheduler/globalParams");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));

        // 2、post提交一个user
        request = post("/scheduler/globalParams")
                .param("id", "6")
                .param("paramName", "f")
                .param("paramValue", "f")
                .param("paramDesc", "f")
                .param("paramTime", "2017-12-18")
                .param("isDeleted", "0")
                .param("updateBy", "f");
        mvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 3、get获取user列表，应该有刚才插入的数据
        request = get("/scheduler/globalParams");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":6,\"paramName\":\"f\",\"paramValue\":f,\"paramDesc\":f,\"paramTime\":20171218,\"isDeleted\":0,\"updateBy\":f}]")));

        // 4、put修改id为1的user
        request = put("/globalParams/{6}")
                .param("id", "6")
                .param("paramName", "e")
                .param("paramValue", "e")
                .param("paramDesc", "e")
                .param("paramTime", "2017-12-18")
                .param("isDeleted", "0")
                .param("updateBy", "e");
        mvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 5、get一个id为1的user
        request = get("/users/1");
        mvc.perform(request)
                .andExpect(content().string(equalTo("{\"id\":1,\"name\":\"测试终极大师\",\"age\":30}")));

        // 6、del删除id为1的user
        request = delete("/globalParams/{6}");
        mvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 7、get查一下user列表，应该为空
        request = get("/scheduler/globalParams");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));
    }*/

}
