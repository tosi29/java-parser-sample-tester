package org.tosi29.javaparsertester;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {
    private static final String byField = "/value/by/field";

    @RequestMapping("/simple/request")
    public String simpleRequestMappingAnnotation() {
        return "This is response.";
    }

    @GetMapping("/simple/get")
    public String simpleGetMappingAnnotation() {
        return "This is get response.";
    }

    @PostMapping("/simple/post")
    public String simplePostMappingAnnotation() {
        return "This is post response.";
    }

    @RequestMapping(value = "/normal/valueonly")
    public String normalRequestMappingByValueOnly() {
        return "";
    }

    @RequestMapping(value = "/normal/get/value", method = RequestMethod.GET)
    public String normalRequestMappingByValue() {
        return "";
    }

    @RequestMapping(path = "/normal/post/path", method = RequestMethod.POST)
    public String normalRequestMappingByPath() {
        return "";
    }

    @GetMapping(value = "/value/and/path", path = "/value/and/path")
    public String bothValueAndPath() {
        return "";
    }

    @GetMapping(byField)
    public String valueByFinalField() {
        return "";
    }

}
