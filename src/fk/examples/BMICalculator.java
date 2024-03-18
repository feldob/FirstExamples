package fk.examples;

public class BMICalculator {

	public static void main(String[] args) {

		Person[] persons = new Person[2];
		persons[0] = new Person("Skeletor", 3, 1.90);
		persons[1] = new Person("Jabba The Hut", 1433, 3.60);

		for (Person person : persons) {
			bmiStatusToString(person);
		}
	}

	public static String calculateBMICategory(double weight, double height) {
		double bmi = calculateBMI(weight, height);
		return getBMICategoryFor(bmi);
	}

	private static String getBMICategoryFor(double bmi) {
		if (bmi < 18.5) {
			return "Underweight";
		} else if (bmi >= 18.5 && bmi < 25) {
			return "Normal weight";
		} else if (bmi >= 25 && bmi < 30) {
			return "Overweight";
		} else if (bmi >= 30 && bmi < 40) {
			return "Obese";
		} else {
			return "Severely Obese";
		}
	}

	public static double calculateBMI(double weight, double height) {
		return weight / (height * height);
	}

	private static void bmiStatusToString(Person person) {
		double bmi = calculateBMI(person.getWeight(), person.getHeight());
		String category = getBMICategoryFor(bmi);
		System.out.println(person.getName() + " is " + category + ".");
	}
}
