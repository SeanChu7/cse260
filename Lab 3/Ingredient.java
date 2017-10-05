
public class Ingredient {

	private String n;
	private String m;
	private int calories;
	
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		n = name;
		m = measuringUnit;
		calories = caloriesPerUnit;
	}
	
	public String getName() {
		return n;
	}
	public String getMeasuringUnit() {
		return m;
	}
	public int getCalories() {
		return calories;
	}
	
	public String toString() {
		return "Ingredient\n" +"Name= " + n +"\n" + "Measuring Unit = " + m + "\n" + "Calories= " + calories;
	}
	public boolean equals(Ingredient i) {
		if (i.getName().equals(n))
			if(i.getMeasuringUnit().equals(m))
				if(i.getCalories()==calories)
					return true;
		return false;
	}
}
