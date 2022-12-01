package com.example.demo.api.service;

import com.example.demo.api.dto.MemberResponse;
import com.example.demo.api.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberQueryService {
    private final MemberRepository memberRepository;

    public MemberQueryService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<MemberResponse> findAll() {
        return this.memberRepository.findAll()
                .stream()
                .map(MemberResponse::new)
                .collect(Collectors.toList());
    }

    public List<MemberResponse> find(Integer age, String gender, Integer salary, String nationality) {
        return null;
    }
}
