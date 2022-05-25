package solidImplemented.restaurants.details;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Paradise implements RestaurantDetails {

    HashMap<String, Integer> DishesWithPrice = new HashMap<String, Integer>();
    @Override
    public void dishesAvailableInRestaurant() {
        DishesWithPrice.put("Chicken Biryani", 300);
        DishesWithPrice.put("Fish Soup", 200);

        // printing Available Dishes
        Set set = DishesWithPrice.entrySet();
        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println("Dish Name is: " + entry.getKey() + " Dish Price is : " + entry.getValue());
        }
    }

    @Override
    public Integer priceOfDish(String dishName){
        DishesWithPrice.put("Chicken Biryani", 300);
        DishesWithPrice.put("Fish Soup", 200);
       return DishesWithPrice.get(dishName);
    }
}
