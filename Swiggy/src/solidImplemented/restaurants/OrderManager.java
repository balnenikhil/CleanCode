package solidImplemented.restaurants;

import solidImplemented.restaurants.details.KFC;
import solidImplemented.restaurants.details.Paradise;
import solidImplemented.restaurants.details.RestaurantDetails;

public class OrderManager {
    public static void dishesInRestaurantList(String restaurantName){
        if(restaurantName.equals("Paradise")){
            RestaurantDetails restaurantDetails = new Paradise();
            restaurantDetails.dishesAvailableInRestaurant();
        }
        if(restaurantName.equals("KFC")){
            RestaurantDetails restaurantDetails = new KFC();
            restaurantDetails.dishesAvailableInRestaurant();
        }
    }
    RestaurantDetails restaurantDetails;
    public Integer dishPrice(String dishName, String restaurantName){
        if(restaurantName.equals("Paradise")){
             restaurantDetails= new Paradise();    // referencing using paradise p = new paradise is highly coupled;
           return restaurantDetails.priceOfDish(dishName);
        }
        if(restaurantName.equals("KFC")){
             restaurantDetails = new KFC();        // // referencing using kfc k = new kfc is highly coupled;
           return restaurantDetails.priceOfDish(dishName);
        }
        return 0;
    }
}
