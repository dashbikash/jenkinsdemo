/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bikash.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bikash
 */
@RestController
public class MainController {
    
	@GetMapping("/")
	public String index(){
		return "Hello Jenkins from springboot.";
	}
}
