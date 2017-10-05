
public class RecipeIngredient extends Ingredient{
	
	private float q;
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name,measuringUnit,caloriesPerUnit);
		q = quantity;
	}
	
	public float getQuantity() {
		return q;
	}
	
	public void setQuantity(float i) {
		q = i;
	}
	public String toString() {
		return "Recipe Ingredient\n" +"name= " + this.getName() +"\n" + "Measuring Unit = " + this.getMeasuringUnit() + "\n" + "Calories= " + this.getCalories() + "\n" + "Quantity= " + q;	
	}
	
	public boolean equals(RecipeIngredient i) {
		if (i.getName().equals(this.getName()))
			if(i.getMeasuringUnit().equals(this.getMeasuringUnit()))
				if(i.getCalories()==this.getCalories())
					if(i.getQuantity() == q)
						return true;
		return false;
	}
}
