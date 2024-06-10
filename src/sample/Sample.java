package sample;

public class Sample {

	public static void main(String[] args) {
		double weight = 60;
		double height = 1.7;
		double BMI = weight / height / height;
		System.out.println("BMIは" + BMI + "です");
		System.out.println("BMIは" + Math.floor(BMI) + "です");
		System.out.println("BMIは" + Math.ceil(BMI) + "です");
		System.out.println("BMIは" + ((double) Math.round(BMI * 10)) / 10 + "です");
	}
}
