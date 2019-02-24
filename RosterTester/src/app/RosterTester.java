package app;

import java.util.Arrays;

public class RosterTester {

    public static void main(String[]args){
        // create a roster with a max size of 16
        ClassRoster test = new ClassRoster("tester", 16);
        // add names to the roster
        // attempt to add more than maxSize name
        for(int i = 0; i < 17; i++){
            test.addName();
        }
        // show the names were sorted alphabetically
        System.out.print("ALPHA: ");
        System.out.println(test.getNames());
        // randomize the list of names
        System.out.print("SHUFFLED: ");
        System.out.println(test.shuffleNames());
        System.out.println("Shuffle didn't mess up my list:");
        System.out.println(test.getNames());
        // select a random name
        System.out.print("COLD CALL: ");
        System.out.println(test.coldCall());
        // split the roster into two groups
        System.out.print("2 GROUPS: ");
        System.out.println(Arrays.deepToString(test.randomGroups(2)));
        // split the roster into three groups
        System.out.print("3 GROUPS: ");
        System.out.println(Arrays.deepToString(test.randomGroups(3)));
        // split the roster into four groups
        System.out.print("4 GROUPS: ");
        System.out.println(Arrays.deepToString(test.randomGroups(4)));
    }
}
