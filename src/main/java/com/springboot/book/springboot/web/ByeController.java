package com.springboot.book.springboot.web;


import com.springboot.book.springboot.web.dto.ByeResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {

    @GetMapping("/bye")
    public String bye() { return "bye"; }

    @GetMapping("/bye/dto")
    public ByeResponseDto byeDto(@RequestParam("name") String name) {
        return new ByeResponseDto(name);
    }

}
