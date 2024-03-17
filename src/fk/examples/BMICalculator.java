package fk.examples;
public class BMICalculator {

	public static void main(String[] args) {
		// Set weight and height
		double weight = 170; // in kilograms
		double height = 1.75; // in meters

		String bmiCategory = calculateBMICategory(weight, height);
		System.out.println("Your BMI category is: " + bmiCategory);
	}

	public static String calculateBMICategory(double weight, double height) {
		double bmi = calculateBMI(weight, height);

		if (bmi < 18.5) {
			return "Underweight";
		} else if (bmi >= 18.5 && bmi < 25) {
			return "Normal weight";
		} else if (bmi >= 25 && bmi < 30) {
			return "Overweight";
		} else {
			return "Obese";
		}
	}

	public static double calculateBMI(double weight, double height) {
		return weight / (height * height);
	}
}
