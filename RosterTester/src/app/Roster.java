package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
abstract class Roster{
    private ArrayList<String> names;
    private String title;

    public void addName(){
        System.out.println("please give me a name");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        for(String x : names){
            if(x.equals(name)){
                System.out.println("The name is on List. Try again.");
                return;
            }
        }
        names.add(name);
        System.out.println("Got'em");
        
        this.sortNames();
    }
    public ArrayList<String> getNames(){
        return names;
    }
    public void setNames(ArrayList<String> names){
        this.names = names;
    }
    public void sortNames(){
        for(int n =0; n < names.size()-1; n++){
            int small = n;
            for(int m = n+1; m < names.size(); m++){
                if(names.get(small).compareTo(names.get(m)) > 0){
                    small = m;
                }
            }
            String temp = names.get(n);
            names.set(n,names.get(small));
            names.set(small,temp);
        }
    }
    public Roster(String title){
        this.names = new ArrayList<String>();
        this.title = title;
    }

} 