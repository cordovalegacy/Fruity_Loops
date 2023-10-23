package com.springboot.server.controller; //this line is to give FruitController functionality
import com.springboot.server.model.FruitModel; //this line is to grab the fruit model class (ingredients)
import org.springframework.web.bind.annotation.*; //this gives us access to annotations
import java.util.ArrayList; //this gives us the arraylist wrapper class

@RestController //this is for api calls
@RequestMapping("/api") //this is to define the base api route
@CrossOrigin //this is for cors access
public class FruitController {

    @GetMapping("/getAllFruits") //this is to define the endpoint for get requests
    public ArrayList<FruitModel> getAllFruits() { //this is the method attached to the route
        ArrayList<FruitModel> fruits = new ArrayList<>(); //this will be the list we return to the frontend
        fruits.add(new FruitModel("Apple Seed", 5)); //we instantiate the class directly in the adding of ArrayList
        fruits.add(new FruitModel("Sweet Pea", 6));
        fruits.add(new FruitModel("Blueberry", 7));
        fruits.add(new FruitModel("Raspberry", 8));
        fruits.add(new FruitModel("Cherry", 9));
        fruits.add(new FruitModel("Strawberry", 10));
        fruits.add(new FruitModel("Small Lime", 11));
        fruits.add(new FruitModel("Big Lime", 12));
        fruits.add(new FruitModel("Peach", 13));
        fruits.add(new FruitModel("Lemon", 14));
        fruits.add(new FruitModel("Apple", 15));
        fruits.add(new FruitModel("Avocado", 16));
        fruits.add(new FruitModel("Turnip", 17));

        return fruits; //return the list
    }
}




