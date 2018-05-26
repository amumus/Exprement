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
import org.springframework.web.multipart.MultipartFile;

import com.mathworks.toolbox.javabuilder.MWException;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import distinguishColors.DistinguishColors;
import domain.Color;
import domain.SimulatColorBlindnessObject;
import domain.Temp;
import simulatColorBlindness.SimulatColorBlindness;
@Controller
public class DistinguishColorsController {
	@RequestMapping(value="/distinguishColorsDeal",method=RequestMethod.POST)
	public String register(HttpServletRequest request,
			@RequestParam("file") MultipartFile file,
			Model model)throws Exception{
		if(!file.isEmpty()) {
			String path = "D:\\myFile\\";
			String filename = file.getOriginalFilename();
			File filepath = new File(path,filename);
			if(!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();//没有该文件夹，建空文件夹
			}
			String filePath=path+filename;
			file.transferTo(new File(filePath));
			Color color = null;
			try {
				DistinguishColors distinguishColors = new DistinguishColors();
				Object result[] = distinguishColors.distinguishColors(2, filePath);
				String [] arr1 = result[0].toString().split("\\s+");
				String [] arr2 = result[1].toString().split("\\s+");
				color= new Color(Double.parseDouble(arr1[0]),
						Double.parseDouble(arr1[1]),
						Double.parseDouble(arr1[2]),
						Double.parseDouble(arr2[0]),
						Double.parseDouble(arr2[1]),
						Double.parseDouble(arr2[2]),
						Double.parseDouble(arr2[3]),
						Double.parseDouble(arr2[4]),
						Double.parseDouble(arr2[5]),
						Double.parseDouble(arr2[6])
						);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(color!=null)
				model.addAttribute("result", color.analysisColor());
			model.addAttribute("path", path);
			model.addAttribute("filename",filename);
			return "distinguishColorInfo";
		}
		
		return "error";
	}
	
}
