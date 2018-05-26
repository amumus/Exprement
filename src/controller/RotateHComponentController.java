package controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mathworks.toolbox.javabuilder.MWException;

import domain.RotateHComponentObject;
import domain.SimulatColorBlindnessObject;
import rotateHComponent.RotateHComponent;
import simulatColorBlindness.SimulatColorBlindness;
@Controller
public class RotateHComponentController {
	@RequestMapping(value="/RotateHComponentDeal",method=RequestMethod.POST)
	public String register(HttpServletRequest request,
			@ModelAttribute RotateHComponentObject rotateHComponentObject
			,Model model)throws Exception{
		if(!rotateHComponentObject.getImage().isEmpty()) {
			String path = "D:\\myFile\\";
			String filename = rotateHComponentObject.getImage().getOriginalFilename();
			File filepath = new File(path,filename);
			if(!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();//没有该文件夹，建空文件夹
			}
			String filePath=path+filename;
			String newFilename = "output_"+filename;
			String filePath2=path+newFilename;
			System.out.println(filePath);
			rotateHComponentObject.getImage().transferTo(new File(filePath));
			try {
				RotateHComponent rotateHComponent = new RotateHComponent();
				Object[] result = rotateHComponent.rotateHComponent(1, filePath
						,rotateHComponentObject.getH_Component()
						,filePath2);
			} catch (MWException e) {
				e.printStackTrace();
			}
			model.addAttribute("path", path);
			model.addAttribute("rotateHComponentObject",rotateHComponentObject);
			model.addAttribute("newFilename",newFilename);
			return "rotateHComponentInfo";
		}
		
		return "error";
	}
	
}
