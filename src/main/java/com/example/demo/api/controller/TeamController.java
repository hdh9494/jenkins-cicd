package com.example.demo.api.controller;

import com.example.demo.api.service.TeamQueryService;
import com.example.demo.api.dto.TeamAllResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/teams")
public class TeamController {
    private final TeamQueryService teamQueryService;

    public TeamController(TeamQueryService teamQueryService) {
        this.teamQueryService = teamQueryService;
    }

    @GetMapping("/all")
    public List<TeamAllResponse> findAll() {
        return this.teamQueryService.findAll();
    }
}
