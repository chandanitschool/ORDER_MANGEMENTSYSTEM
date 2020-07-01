package com.demo.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.exception.ApiError;
import com.demo.exception.OrderNotFoundException;

@Controller
@ControllerAdvice
public class GlobalExceptionRestController {
	
	@ExceptionHandler(value = OrderNotFoundException.class)
	public ResponseEntity<ApiError> handledOrderNotFoundException() {
		
		ApiError  error= new ApiError(400, "Order not found", new Date());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		
		
		
	}

}
