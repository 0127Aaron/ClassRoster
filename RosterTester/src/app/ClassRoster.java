package app;

import java.util.ArrayList;
import java.util.Collections;

public class ClassRoster extends Roster{
    private int maxSize;

    public ClassRoster(String title, int maxSize){
        super(title);
        this.maxSize = maxSize;
    }

   
    public void addName(){
        System.out.println("Size is currently: " + this.getNames().size());
        if(this.getNames().size() < maxSize){
            super.addName();
        }
        else{
            System.out.println("You're full");
        }
    }

    public void sortNames(){
        int i,j;
 	    String key;
        for (j = 1; j < this.getNames().size(); j++) {
            key = this.getNames().get(j);
            i = j - 1;
            while (i >= 0) {
              if (key.compareTo(this.getNames().get(i)) > 0) {
                break;
              }
              this.getNames().set(i+1,this.getNames().get(i));
              i--;
            }
            this.getNames().set(i+1, key);
       
        } 
        
    }

    public String coldCall(){
        int x = (int)Math.random()*this.getNames().size();
        return this.getNames().get(x);
    }

    public ArrayList<String> shuffleNames(){
        ArrayList<String> x = this.getNames();
        Collections.shuffle(x);
    return x;
    }

    public String[][] randomGroups(int groupCount){
        String[][] result;
        int num=0;
        if(groupCount < 2 || groupCount >= this.getNames().size()){
            System.out.println("Your requst doesnot make sense.");
            result = new String[1][1];
        }
        else{
            if(this.getNames().size() % groupCount == 0){ 
                result = new String[groupCount][(this.getNames().size() / groupCount)];
            }
            else{
                result = new String[groupCount][(this.getNames().size() / groupCount) + 1];
            }
        
            ArrayList<String> x = this.getNames();
            Collections.shuffle(x);
            System.out.println("didi" + x);

            for(int didi = 0; didi < groupCount; didi++){
                for(int n = 0; n < result[0].length; n++){
                    result[didi][n] = x.get(num);
                    num++;
                    if(num == x.size()){
                    break;}
                }
            }
    }

        return result;
    }
    


    
}