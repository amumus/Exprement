package domain;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;

import com.mathworks.toolbox.javabuilder.MWException;

import distinguishColors.DistinguishColors;

public class Color {
	private double black;
	private double gray;
	private double white;
	private double red;
	private double orange;
	private double yellow;
	private double green;
	private double cyan;
	private double blue;
	private double purple;

	public Color() {
		super();
	}

	public Color(double black, double gray, double white, double red, double orange, double yellow, double green,
			double cyan, double blue, double purple) {
		super();
		this.black = black;
		this.gray = gray;
		this.white = white;
		this.red = red;
		this.orange = orange;
		this.yellow = yellow;
		this.green = green;
		this.cyan = cyan;
		this.blue = blue;
		this.purple = purple;
	}

	public double getBlack() {
		return black;
	}

	public void setBlack(double black) {
		this.black = black;
	}

	public double getGrey() {
		return gray;
	}

	public void setGrey(double gray) {
		this.gray = gray;
	}

	public double getWhite() {
		return white;
	}

	public void setWhite(double white) {
		this.white = white;
	}

	public double getRed() {
		return red;
	}

	public void setRed(double red) {
		this.red = red;
	}

	public double getOrange() {
		return orange;
	}

	public void setOrange(double orange) {
		this.orange = orange;
	}

	public double getYellow() {
		return yellow;
	}

	public void setYellow(double yellow) {
		this.yellow = yellow;
	}

	public double getGreen() {
		return green;
	}

	public void setGreen(double green) {
		this.green = green;
	}

	public double getCyan() {
		return cyan;
	}

	public void setCyan(double cyan) {
		this.cyan = cyan;
	}

	public double getBlue() {
		return blue;
	}

	public void setBlue(double blue) {
		this.blue = blue;
	}

	public double getPurple() {
		return purple;
	}

	public void setPurple(double purple) {
		this.purple = purple;
	}

	public String analysisColor() {
		Temp[] temps = new Temp[10];
		temps[0] = new Temp("��ɫ", black);
		temps[1] = new Temp("��ɫ", gray);
		temps[2] = new Temp("��ɫ", white);
		temps[3] = new Temp("��ɫ", red);
		temps[4] = new Temp("��ɫ", orange);
		temps[5] = new Temp("��ɫ", yellow);
		temps[6] = new Temp("��ɫ", green);
		temps[7] = new Temp("��ɫ", cyan);
		temps[8] = new Temp("��ɫ", blue);
		temps[9] = new Temp("��ɫ", purple);
		Arrays.sort(temps);
		DecimalFormat    df   = new DecimalFormat("######0.00");  
		String result ="";
//		String result = "��ͼƬ��ռ��ɫ������ :"+temps[0].colorName+"\n���� ��";
//		int j = 0;
//		for ( j= 0; j < temps.length; j++) {
//			if (temps[j].size > 0.3) {
//				result += temps[j].colorName+" ";
//			}
//		}		
//		
//		for (;j < temps.length; j++) {
//			if(temps[j].size > 0.1) {
//				result += temps[j].colorName+" ";
//			}
//		}
//		result += "��ռ��������10%\n";
//		else if(temps[i].size > 0.1) {
//			result += temps[i].colorName+" ��ռ��������10%��";
//		}else if(temps[i].size > 0.01) {
//			result += temps[i].colorName+" ��ռ���٣�";
//		}else {
//			result += temps[i].colorName+" ����û�У�";
//		}

		for (int i = 0; i < temps.length; i++) {
			result += (temps[i].colorName+"����:"+df.format(temps[i].size*100)+"% ");
		}
		return result;
	}
	public static void main(String[] args) {
//		DistinguishColors distinguishColors;
//		try {
//			distinguishColors = new DistinguishColors();
//	
//			Object result[] = distinguishColors.distinguishColors(2, "D:\\manylight.jpg");
//			String[] arr1 = result[0].toString().split("\\s+");
//			String[] arr2 = result[1].toString().split("\\s+");
//			Color color = new Color(Double.parseDouble(arr1[0]), Double.parseDouble(arr1[1]),
//					Double.parseDouble(arr1[2]), Double.parseDouble(arr2[0]), Double.parseDouble(arr2[1]),
//					Double.parseDouble(arr2[2]), Double.parseDouble(arr2[3]), Double.parseDouble(arr2[4]),
//					Double.parseDouble(arr2[5]), Double.parseDouble(arr2[6]));
//			System.out.println(color.analysisColor());
//			for (int i = 0; i < result.length; i++) {
//				System.out.println(result[i].toString());
//				System.out.println(i);
//			}
//		} catch (MWException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.print("hello\nworld");
	}
}

