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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class DownloadController {
	@RequestMapping(value="/download")
	public ResponseEntity<byte []> download(HttpServletRequest request,
			@RequestParam("filename") String filename,
			Model model)throws Exception{
//		String path = "\\upload";
		String path = "D:\\myFile\\";
		File file = new File(path+File.separator+filename);
		System.out.println(path+File.separator+filename);
		HttpHeaders headers = new HttpHeaders();
		String downloadFielName = new String(filename.getBytes("UTF-8"),"iso-8859-1");
		headers.setContentDispositionFormData("attachment", downloadFielName);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		
		return new ResponseEntity<byte []>(FileUtils.readFileToByteArray(file),
				headers,HttpStatus.CREATED);
	}
	
	
}
