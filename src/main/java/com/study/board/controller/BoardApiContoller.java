package com.study.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.exception.CustomException;
import com.study.exception.ErrorCode;

@RestController
@RequestMapping("/api")
public class BoardApiContoller {
	
	@GetMapping("/test")
	public String test() {
		throw new RuntimeException("Holy@! Exception");
	}

	@GetMapping("/test2")
	public String test2() {
		throw new CustomException(ErrorCode.POST_NOT_FOIND);
	}

}
