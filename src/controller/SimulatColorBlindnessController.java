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

import domain.SimulatColorBlindnessObject;
import simulatColorBlindness.SimulatColorBlindness;
@Controller
public class SimulatColorBlindnessController {
	@RequestMapping(value="/simulatColorBlindnessDeal",method=RequestMethod.POST)
	public String register(HttpServletRequest request,
			@ModelAttribute SimulatColorBlindnessObject simulatColorBlindnessObject
			,Model model)throws Exception{
		if(!simulatColorBlindnessObject.getImage().isEmpty()) {
			String path = "D:\\myFile\\";
			String filename = simulatColorBlindnessObject.getImage().getOriginalFilename();
			File filepath = new File(path,filename);
			if(!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();//没有该文件夹，建空文件夹
			}
			String filePath=path+filename;
			String newFilename = "output_"+filename;
			String filePath2=path+newFilename;
			System.out.println(filePath);
			simulatColorBlindnessObject.getImage().transferTo(new File(filePath));
			try {
				SimulatColorBlindness simulatColorBlindness = new SimulatColorBlindness();
				Object[] result = simulatColorBlindness.simulatColorBlindness(1, filePath
						,simulatColorBlindnessObject.getLambda()
						,simulatColorBlindnessObject.getType(),filePath2);
			} catch (MWException e) {
				e.printStackTrace();
			}
			model.addAttribute("path", path);
			model.addAttribute("simulatColorBlindnessObject",simulatColorBlindnessObject);
			model.addAttribute("newFilename",newFilename);
			return "simulatColorBlindnessInfo";
		}
		
		return "error";
	}
	
}
