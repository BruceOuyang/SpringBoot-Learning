package club.bugmaker.multisubmit.controller;

import club.bugmaker.multisubmit.annotation.LocalLock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * FooController
 *
 * @Author Bruce
 * @Date 2019/6/25 18:20
 * @Version 1.0
 **/
@RestController
@RequestMapping("/foo")
public class FooController {

    @LocalLock(key = "foo:arg[0]")
    @GetMapping
    public String get(@RequestParam("token") String token) {
        return "success-" + token;
    }
}
