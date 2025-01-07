package com.example.demo.SERVICE;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.POJO.Images.Images;
import com.example.demo.REPOSITORY.ImagesRepo;
@Service
public class ImageService {
	@Autowired
	private ImagesRepo imagesRepo;
	public Images PrepareImage(MultipartFile file,Images logo) throws IOException {
		
		logo.setImageData(file.getBytes());
		logo.setType(file.getContentType());
		logo.setName(file.getOriginalFilename());
		return logo;
		
	}
	public Images SaveImage(Images logo) {
		
		logo=imagesRepo.save(logo);
		return logo;
		
	}
	public void deleteData(Images img) {
		imagesRepo.delete(img);
		// TODO Auto-generated method stub
		
	}

}
