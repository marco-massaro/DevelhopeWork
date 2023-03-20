package javaoopAdvanced.exercises._3;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     * then recreates a new list of unique items
     * <p>
     * You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here
        list = new ArrayList<>(new HashSet<>(list));

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     * the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");

        System.out.println(toSet(list));
        System.out.println(toSet(set));
    }

    // Write your method for exercise 2 here
    private static Set<String> toSet(Collection<String> list) {
        return new HashSet<String>(list);
    }

    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the List `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here
        for (String word : words) {
            Integer counter = wordCount.get(word);
            if (counter == null) {
                counter = 0;
            }
            wordCount.put(word,counter+1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: List. Lists are ordered incrementally.
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: Map. Maps REQUIRE us to use a key and a value for each entry, in this case: Students.
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: List. You can create country objects and give them the age attribute and sort them in a list using the .sort() method
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: Maps are perfect for catalogues. The key can be a String called product name and the value can be a Double called price
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: List. Lists store information in exactly this order
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: Map. The key would be a string named cityName and the value is an Integer named popuplation
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: Map. The key = bookTitle and the value = a Book object containing information such as author + publication dates.
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: Map. Key = string called courseName and the value = a List or a Set of professor names teaching that course.
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer:List or Map. I personally would prefer a map but it depends on whether I want to access the movies by their titles or sequentially
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer:List or Map depending on how I want to access the info. If I want to access the flights by their destination instead of their index, a Map is better
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: List or Map again based on access preference. I prefer Maps: key = article title and value = an Article object containing info
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer:List or Map. I prefer Maps: key = String songname and the value = a Song object containing info about the song
     */

}
