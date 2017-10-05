import java.util.ArrayList;
public class CookingRecipe {

	private String n;
	private ArrayList<RecipeIngredient> ingredients;
	public CookingRecipe(String name) {
		n = name;
		ingredients = new ArrayList<RecipeIngredient>();
	}
	
	public String getName() {
		return n;
	}
	public ArrayList<RecipeIngredient> getIngredients(){
		return ingredients;
	}
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
		RecipeIngredient r = new RecipeIngredient(ingredient.getName(),ingredient.getMeasuringUnit(),ingredient.getCalories(),quantity);
		boolean duplicate = false;
		for (int i = 0; i < ingredients.size();i++) {
			if (r.getName().equals(ingredients.get(i).getName())) {
				duplicate = true;
				ingredients.get(i).setQuantity(quantity);
			}
		}
		if (!duplicate)
			ingredients.add(r);
	}
	
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for (int i =0; i < ingredients.size(); i++) {
			if (ingredient.equals((Ingredient)ingredients.get(i))){
				return ingredients.get(i);
			}
		}
		return null;
	}
	
	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for (int i = 0; i < ingredients.size(); i++) {
			if (ingredientName.equals(ingredients.get(i).getName()))
				return ingredients.get(i);
		}
		return null;
	}
	
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		for (int i = 0; i < ingredients.size(); i++) {
			if (ingredient.equals((Ingredient)ingredients.get(i)))
				return ingredients.remove(i);
		}
		return null;		
	}
	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
		for (int i = 0; i < ingredients.size(); i++) {
			if (ingredientName.equals(ingredients.get(i).getName()))
				return ingredients.remove(i);
		}
		return null;		
	}
	
	public float calculateCalories() {
		float sum = 0;
		for (int i = 0; i < ingredients.size(); i++) {
			sum += (ingredients.get(i).getCalories()*ingredients.get(i).getQuantity());
		}
		return sum;
	}
	
	public int getNumberOfIngredients() {
		return ingredients.size();
	}
	
	public String toString() {
		String s = n + "\n" + "Ingredients: " + "\n";
		for (int i = 0; i <ingredients.size(); i++) {
			s+= ingredients.get(i).getName() + "\n";
		}
		return s;
	}
	
	public boolean equals(CookingRecipe r) {
		boolean found = false;
		if (r.getName().equals(n)) {
			for (int i = 0; i < r.getIngredients().size(); i++) {
				for(int g = 0; g < ingredients.size(); g++) {
					if (ingredients.get(g).equals(r.getIngredients().get(i)))
						found = true;
				}
				if (!found)
					return false;
				found = false;
			}
			return true;
		}
			
		return false;
	}
}
