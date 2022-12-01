package com.example.demo.api.dto;

import com.example.demo.api.entity.Member;
import lombok.Data;

@Data
public class MemberResponse {
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private String salary;
    private String nationality;
//    private TeamResponse team;

    public MemberResponse(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.age = member.getAge();
        this.gender = member.getGender();
        this.salary = member.getSalary();
        this.nationality = member.getNationality();
//        this.team = new TeamResponse(member.getTeam());
    }
}
