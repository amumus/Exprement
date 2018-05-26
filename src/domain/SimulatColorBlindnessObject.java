package domain;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class SimulatColorBlindnessObject implements Serializable{
	private MultipartFile image;
	private double lambda;
	public SimulatColorBlindnessObject() {
		super();
		lambda = 0;
		type="r";
	}
	private String type;
	public double getLambda() {
		return lambda;
	}
	public void setLambda(double lambda) {
		this.lambda = lambda;
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
