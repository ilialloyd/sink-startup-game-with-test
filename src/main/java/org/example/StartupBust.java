package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StartupBust {
    private GameHelper helper = new GameHelper();

    private List<Startup> startups = new ArrayList<>();

    int numOfGuess = 0;

    public void setupGame() {
        //create and initialize Startups objects
        Startup startup1 = new Startup();
        startup1.setName("facebook");
        Startup startup2 = new Startup();
        startup2.setName("twitter");
        Startup startup3 = new Startup();
        startup3.setName("airbnb");
        startups.add(startup1);
        startups.add(startup2);
        startups.add(startup3);


        System.out.println("Your goal is to sink three Startups");
        System.out.println("facebook, twitter, Airbnb");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {
        // ask player to guesses and calls the checkUserGuess() untill Startup objects removed from play
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();

    }
// WITH THIS METHOD i GET ConcurrentModificationException SO SOLVE THIS i USED iTERATOR


//    public void checkUserGuess(String userGuess) {
////        loop through all remaining Startup objects and calls each Startup object's  checkYourself() method
//
//        numOfGuess++;
//        String result = "miss";
//
//        for(Startup startupToTest:startups){
//            result= startupToTest.checkYourself(userGuess);
//
//            if(result.equals("hit")){
//                break;
//            }
//            if(result.equals("kill")){
//                startups.remove(startupToTest);
//            }
//
//
//        }
//        System.out.println(result);
//    }


    //This method works fine and don't get any exception
    public void checkUserGuess(String userGuess) {
//        loop through all remaining Startup objects and calls each Startup object's  checkYourself() method


        numOfGuess++;
        String result = "miss";

        for (Iterator<Startup> startupIterator = startups.iterator(); startupIterator.hasNext(); ) {
            Startup startupToTest = startupIterator.next();
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                startupIterator.remove();
            }
        }
        System.out.println(result);
    }


    public void finishGame() {
        //prints message about user's performance based on how many guesses it took to sink all the Statup objects
        System.out.println("All startups are dead! Your stock is now worthless");
        if (numOfGuess <= 18) {
            System.out.println("It only took you " + numOfGuess + " guesses.");
            System.out.println("Your got out before your options sank.");
        }else {
            System.out.println("Took you long enough. " + numOfGuess + " guesses");
            System.out.println("Fish are dancing with your options.");
        }
    }

}

