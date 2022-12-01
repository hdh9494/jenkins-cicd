package com.example.demo.api.service;

import com.example.demo.api.dto.TeamAllResponse;
import com.example.demo.api.repository.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TeamQueryService {
    private final TeamRepository teamRepository;

    public TeamQueryService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<TeamAllResponse> findAll() {
        return this.teamRepository.findAll()
                .stream()
                .map(TeamAllResponse::new)
                .collect(Collectors.toList());
    }

}
