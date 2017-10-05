
public class TestRecipeBook {

	public static void main(String[] args) {
		Ingredient i = new Ingredient("Chicken", "Pounds", 350);
		System.out.println("Testing Ingredient");
		System.out.println(i.getCalories());
		System.out.println(i.getMeasuringUnit());
		System.out.println(i.getName());
		System.out.println(i);
		Ingredient g = new Ingredient("Chicken", "Pounds", 350);
		System.out.println(i.equals(g));
		
		System.out.println("Testing RecipeIngredient");
		RecipeIngredient r = new RecipeIngredient("Chicken", "Pounds", 350, 5);
		System.out.println(r.getCalories());
		System.out.println(r.getMeasuringUnit());
		System.out.println(r.getName());
		System.out.println(r.getQuantity());
		System.out.println(r);
		RecipeIngredient t = new RecipeIngredient("Chicken", "Pounds", 350, 5);
		System.out.println(r.equals(t));
		
		System.out.println("Testing CookingRecipe");
		CookingRecipe c = new CookingRecipe("Chicken Soup");
		c.addOrUpdateRecipeIngredient(i, 5);
		System.out.println(c);
		System.out.println(c.getRecipeIngredient("Chicken"));
		c.addOrUpdateRecipeIngredient(i, 7);
		System.out.println("\n");
		System.out.println(c);
		System.out.println(c.getRecipeIngredient(i));
		System.out.println("\n");
		RecipeIngredient water = new RecipeIngredient("Water", "Liters", 0, 10);
		RecipeIngredient salt = new RecipeIngredient("Salt", "Grams", 10, 10);
		c.addOrUpdateRecipeIngredient(water, 10);
		c.addOrUpdateRecipeIngredient(salt, 10);
		System.out.println(c);
		c.removeRecipeIngredient(water);
		c.removeRecipeIngredient("Salt");
		System.out.println("\n" + c);
		System.out.println(c.calculateCalories());
		System.out.println(c.getNumberOfIngredients());
		CookingRecipe d = new CookingRecipe("Chicken Soupe");
		d.addOrUpdateRecipeIngredient(i, 7);
		System.out.println(d);
		System.out.println(d.equals(c));
		System.out.println("\n");
		System.out.println("Testing RecipeBook");
		RecipeBook re = new RecipeBook("Bad Cooking");
		RecipeIngredient[] test = new RecipeIngredient[] {r,water,salt};
		re.addRecipe("Chicken Soup", test);
		System.out.println(re);
		re.removeRecipe("Chicken Soup");
		System.out.println(re);
		re.addRecipe("Chicken Soup", test);
		System.out.println(re.findRecipes(test)[0]);
		System.out.println(re.findRecipesWithFewIngredients(5)[0]);
		System.out.println(re.findRecipesWithFewIngredients(1));
		RecipeIngredient[] test1 = new RecipeIngredient[] {t,water,salt};
		re.addRecipe("Chicken Rue", test1);
		System.out.println(re.findRecipesLowCalories()[0]);
		RecipeBook rt = new RecipeBook("Bad Cooking");
		rt.addRecipe("Chicken Rue", test1);
		System.out.println(rt.equals(re));
		rt.addRecipe("Chicken Soup", test);
		System.out.println(rt.equals(re));
		
	}
}
