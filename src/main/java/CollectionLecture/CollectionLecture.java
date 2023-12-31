package CollectionLecture;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionLecture {

    public static void main(String[] args) {


        ArrayList<String> pokemon = new ArrayList<>();

        pokemon.add("Pikachu");
        pokemon.add("Charmander");
        pokemon.add("Bulbasaur");
        pokemon.add("Squirtle");
        System.out.println(pokemon);

        System.out.println();

        System.out.println("How many pokemon have i captured?");
        System.out.println(pokemon.size());

        System.out.println();

        pokemon.add(3, "Wartortle");
        System.out.println(pokemon);

        System.out.println();

        System.out.println("Here is a pokemon from my list:");
        System.out.println(pokemon.get(3));

        System.out.println();

        pokemon.set(3, "Blastoise");
        System.out.println(pokemon);

        pokemon.add("Gastly");

        System.out.println(pokemon);
        System.out.println(pokemon.indexOf("Gastly"));
        System.out.println(pokemon.lastIndexOf("Gastly"));


        for (String name : pokemon){
            System.out.println("Here's a pokemon from our list: "+name);
        }

        System.out.println();

        pokemon.remove("Squirtle");

        int count = 1;
        for (String name : pokemon){
            System.out.println("#"+count++ + " "  + name);
        }

        System.out.println();

        pokemon.remove(3);

        int counting = 1;
        for (String name : pokemon){
            System.out.println("#"+counting++ + " "  + name);
        }

        boolean blueEyes = pokemon.contains("Blue Eyes");
        System.out.println(blueEyes);

        boolean Gastly = pokemon.contains("Gastly");
        System.out.println(Gastly);

        boolean empty = pokemon.isEmpty();
        System.out.println(empty);


        System.out.println("__________");

        HashMap<String, String> cats = new HashMap<>();
        cats.put("Kenny", "Peanut");
        cats.put("Kenny", "Pinch");
        cats.put("Jessica", "Cali");

        System.out.println(cats);

        System.out.println(cats.get("Kenny"));

        System.out.println(cats.get("gilly"));

        String anyCats = cats.getOrDefault("gilly", "No Cat");
        System.out.println(anyCats);

        String jessHaveCat = cats.getOrDefault("Jessica", "No Cat");
        System.out.println(jessHaveCat);

        //-- if key key-found, do nothing, if not add pair
        String ifAbsent = cats.putIfAbsent("Kenny", "Peanut");
        System.out.println(ifAbsent);

        System.out.println(cats);

        String isAbsent = cats.putIfAbsent("Gilly", "Peanut");
        System.out.println(isAbsent);

        System.out.println(cats);


        boolean containGilly = cats.containsKey("Gilly");
        System.out.println("Does it contain Gilly:" +containGilly);


        cats.remove("Gilly");
        System.out.println(cats);

        cats.clear();

        System.out.println("Cleared out: "+cats.isEmpty());

    }
}
