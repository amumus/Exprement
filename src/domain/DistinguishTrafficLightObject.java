package domain;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class DistinguishTrafficLightObject implements Serializable{
	private MultipartFile image;
	private String type;	
	public DistinguishTrafficLightObject() {
		super();
		type="red";
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
}
