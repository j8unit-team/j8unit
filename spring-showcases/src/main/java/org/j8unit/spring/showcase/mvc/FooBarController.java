package org.j8unit.spring.showcase.mvc;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FooBarController {

    @RequestMapping(value = "/foobar", produces = { APPLICATION_JSON_VALUE })
    public String foo() {
        return "bar";
    }
}
