import java.util.ArrayList;

public class RecipeBook {
	private String n;
	private ArrayList<CookingRecipe> recipes;
	public RecipeBook(String bookName) {
		n = bookName;
		recipes = new ArrayList<CookingRecipe>();
	}
	
	public String getName() {
		return n;
	}
	public ArrayList<CookingRecipe> getRecipes(){
		return recipes;
	}
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).getName().equals(name))
				return null;
		}
		CookingRecipe c = new CookingRecipe(name);
		for (int i = 0; i < ingredients.length; i++) {
			c.addOrUpdateRecipeIngredient(ingredients[i], ingredients[i].getQuantity());
		}
		recipes.add(c);
		return c;
	}
	
	public CookingRecipe removeRecipe(String name) {
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).getName().equals(name))
				return recipes.remove(i);
		}
		return null;
	}
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
		CookingRecipe[] store = new CookingRecipe[recipes.size()];
		int index = 0;
		boolean correct = true;
		for (int i = 0; i < recipes.size(); i++) {
			for (int g = 0; g < ingredients.length;g++) {
				if (recipes.get(i).getRecipeIngredient(ingredients[g]) == null) {
					correct = false;
					g = ingredients.length;
				}
			}
			if (correct) {
				store[index] = recipes.get(i);
				index++;
			}
			else {
				correct = true;
			}
		}
		if (index == 0) {
			return null;
		}
		return store;
	}
	
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
		CookingRecipe[] store = new CookingRecipe[recipes.size()];
		int index = 0;
		for (int i = 0; i < recipes.size(); i++) {
			if (recipes.get(i).getNumberOfIngredients() < numberOfIngredients) {
				store[index] = recipes.get(i);
				index++;
			}
		}
		if (index == 0) {
			return null;
		}
		return store;
	}
	
	public CookingRecipe[] findRecipesLowCalories() {
		float lowest = recipes.get(0).calculateCalories();
		CookingRecipe[] store = new CookingRecipe[recipes.size()];
		int index = 0;
		for (int i = 0; i< recipes.size(); i++) {
			if (recipes.get(i).calculateCalories() < lowest) {
				lowest = recipes.get(i).calculateCalories();
			}
		}
		for (int i = 0; i< recipes.size(); i++) {
			if (recipes.get(i).calculateCalories() == lowest) {
				store[index] = recipes.get(i);
				index++;
			}
		}
		return store;
	}
	
	public String toString() {
		String s = n + "Recipes: " + "\n";
		for (int i = 0; i < recipes.size(); i++) {
			s += recipes.get(i).getName() + "\n";
		}
		return s;
	}
	public boolean equals(RecipeBook r) {
		boolean found = false;
		if (r.getName().equals(n)) {
			for (int i = 0; i < r.getRecipes().size(); i++) {
				for(int g = 0; g < recipes.size(); g++) {
					if (recipes.get(g).equals(r.getRecipes().get(i)))
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
