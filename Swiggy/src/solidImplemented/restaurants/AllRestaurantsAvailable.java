package solidImplemented.restaurants;

import java.util.ArrayList;

public class AllRestaurantsAvailable {

    public void restaurantsList(){
        ArrayList<String> restaurants = new ArrayList<String>();
        restaurants.add("Paradise");
        restaurants.add("KFC");

        //printing all available restaurants

        System.out.println("Here are the List of Restaurants");
        for (int i = 0; i < restaurants.size(); i++)
            System.out.println(restaurants.get(i));
    }
}
