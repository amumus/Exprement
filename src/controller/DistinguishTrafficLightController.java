package controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mathworks.toolbox.javabuilder.MWException;
import DistinguishTrafficLight.DistinguishGreenTrafficLight;
import DistinguishTrafficLight.DistinguishRedTrafficLight;
import DistinguishTrafficLight.DistinguishTrafficLight;
import domain.DistinguishTrafficLightObject;
@Controller
public class DistinguishTrafficLightController {
	@RequestMapping(value="/distinguishTrafficLightDeal",method=RequestMethod.POST)
	public String register(HttpServletRequest request,
			@ModelAttribute DistinguishTrafficLightObject distinguishTrafficLightObject
			,Model model)throws Exception{
		System.out.println(distinguishTrafficLightObject.getType());
		System.out.println(distinguishTrafficLightObject.getImage().getOriginalFilename());
		if(!distinguishTrafficLightObject.getImage().isEmpty()) {
			String path = "D:\\myFile\\";
			String filename = distinguishTrafficLightObject.getImage().getOriginalFilename();
			File filepath = new File(path,filename);
			if(!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();//没有该文件夹，建空文件夹
			}
			String filePath=path+filename;
			String newFilename = "output_"+filename;
			String filePath2=path+newFilename;
			
			distinguishTrafficLightObject.getImage().transferTo(new File(filePath));
			try {
				if(distinguishTrafficLightObject.getType().equals("red")) {
					DistinguishRedTrafficLight distinguishRedTrafficLight = new DistinguishRedTrafficLight();
					Object[] result = distinguishRedTrafficLight.distinguishRedTrafficLight(1, filePath,filePath2);
					
				}else if(distinguishTrafficLightObject.getType().equals("green")) {
					DistinguishGreenTrafficLight distinguishGreenTrafficLight = new DistinguishGreenTrafficLight();
					Object[] result = distinguishGreenTrafficLight.distinguishGreenTrafficLight(1, filePath,filePath2);
				}else {
					DistinguishTrafficLight distinguishTrafficLight = new DistinguishTrafficLight();
					Object[] result = distinguishTrafficLight.distinguishTrafficLight(1,filePath,filePath2);
				}				
			} catch (MWException e) {
				e.printStackTrace();
			}
			model.addAttribute("path", path);
			model.addAttribute("newFilename",newFilename);
			model.addAttribute("distinguishTrafficLightObject",distinguishTrafficLightObject);

			return "distinguishTrafficLightInfo";
		}
		
		return "error";
	}
}
