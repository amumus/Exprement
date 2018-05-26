package domain;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class RotateHComponentObject implements Serializable{
	private MultipartFile image;
	private double H_Component;
	public RotateHComponentObject() {
		super();
		H_Component = 120;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public double getH_Component() {
		return H_Component;
	}
	public void setH_Component(double h_Component) {
		H_Component = h_Component;
	}
	
}
