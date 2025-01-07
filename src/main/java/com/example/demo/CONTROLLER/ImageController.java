package com.example.demo.CONTROLLER;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.POJO.Images.Images;
import com.example.demo.SERVICE.ImageService;

@RestController
@RequestMapping("/img")
public class ImageController {
	@Autowired
	private ImageService imageService;
	@GetMapping
	public Images getData(@RequestParam("img") MultipartFile file) throws IOException {
		Images img=new Images();
		img= imageService.PrepareImage(file, img);
		return img;
		
	}

}
