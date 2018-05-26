package domain;

public class Temp implements Comparable<Temp> {
	String colorName;
	double size;

	public Temp(String colorName, double size) {
		super();
		this.colorName = colorName;
		this.size = size;
	}

	public Temp() {
		super();
	}

    @Override
    public int compareTo(Temp o) {
    	if(this.size>o.size)
    		return -1;
       return 1;
    }

}