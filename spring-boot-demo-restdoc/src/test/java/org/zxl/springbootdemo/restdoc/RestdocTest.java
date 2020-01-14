package org.zxl.springbootdemo.restdoc;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.zxl.springbootdemo.restdoc.controller.RestdocController;

import static org.hamcrest.Matchers.containsString;
//import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RestdocController.class)
@AutoConfigureRestDocs(outputDir = "target/snippets")
public class RestdocTest {
    @Autowired
    private MockMvc mockMvc;

    /*
     * 1、mockMvc.perform执行一个请求。
     * 2、MockMvcRequestBuilders.get("XXX")构造一个请求。
     * 3、ResultActions.param添加请求传值
     * 4、ResultActions.accept(MediaType.TEXT_HTML_VALUE))设置返回类型
     * 5、ResultActions.andExpect添加执行完成后的断言。
     * 6、ResultActions.andDo添加一个结果处理器，表示要对结果做点什么事情
     *   比如此处使用MockMvcResultHandlers.print()输出整个响应结果信息。
     * 7、ResultActions.andReturn表示执行完成后返回相应的结果。
     */
    @Test
    public void test1() throws Exception {
        this.mockMvc.perform(get("/test1").param("name", "zxl")).andDo(print())
                .andExpect(status().isOk())
//                .andExpect(content().string(containsString("Hello World")))
                .andDo(document("test1"));
    }


    @Test
    public void test2() throws Exception {
        this.mockMvc.perform(get("/test2").param("age", "30")).andDo(print())
                .andExpect(status().isOk())
//                .andExpect(content().string(containsString("Hello World")))
                .andDo(document("test2"));
    }
}
