package com.example.demo.api.dto;

import com.example.demo.api.entity.Team;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class TeamAllResponse {
    private Long id;
    private String name;
    private String manager;
    private Integer totalSalary;
    private List<MemberResponse> memberList;

    public TeamAllResponse(Team team) {
        this.id = team.getId();
        this.name = team.getName();
        this.manager = team.getManager();
        this.totalSalary = team.getTotalSalary();
        this.memberList = team.getMemberList().stream().map(MemberResponse::new).collect(Collectors.toList());
    }
}
