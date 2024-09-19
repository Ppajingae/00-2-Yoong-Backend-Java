package com.yoong.projectyoongbackend_java.domain.auth.member.controller;

import com.yoong.projectyoongbackend_java.common.dto.DefaultResponse;
import com.yoong.projectyoongbackend_java.domain.auth.member.dto.CreateMemberDto;
import com.yoong.projectyoongbackend_java.domain.auth.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MemberController{

    private final MemberService memberService = new MemberService();

    @PostMapping
    ResponseEntity<DefaultResponse> signUp(
            @RequestBody CreateMemberDto createMemberDto
    ) {

        return ResponseEntity.status(HttpStatus.OK).body(memberService.signUp(createMemberDto));
    }


//    fun signUp(
//            @RequestBody createMemberDto: CreateMemberDto
//    ): ResponseEntity<DefaultResponse> = ResponseEntity.status(HttpStatus.OK).body(memberService.signUp(createMemberDto))


}
