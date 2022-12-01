package com.example.demo.api.controller;

import com.example.demo.api.dto.MemberResponse;
import com.example.demo.api.service.MemberQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/members")
public class MemberController {
    private final MemberQueryService memberQueryService;

    public MemberController(MemberQueryService memberQueryService) {
        this.memberQueryService = memberQueryService;
    }

    @GetMapping("/all")
    public List<MemberResponse> findAll() { return this.memberQueryService.findAll(); }
}
