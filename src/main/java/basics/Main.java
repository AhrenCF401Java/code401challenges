import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main{
    public static void main(String[]args){
        String proofLife ="Im Alive";
        System.out.println(proofLife);

        //test pluralize
        String dog = "dog";
        int numOfDogs= 3;
        System.out.println(pluralize(dog,numOfDogs));

        // test flip
        int times= 5;
        System.out.println(flipNHeads(times));
        
        clock();
        

    }

    public static String pluralize(String word, int howMany){
        if(howMany>1){
            word = word +"s";
        }
        return word;
    }

    public static String flipNHeads(int n){
        Random rnd = new Random();
        int tails = 0;
        int heads = 0;
        for(int i=0; i<n; i++){
            double rndnum = rnd.nextDouble();
            if (rndnum > 0.5){
                heads++;
                System.out.println("Heads");
            }else{
                tails++;
                System.out.println("Tails");
            }
        }
        String headFlips="It took "+n+" flips to flip "+heads+" heads in a row";  
        return headFlips;
    }
    // help from https://stackoverflow.com/questions/20608971/showing-the-time-every-second
    public static void clock(){
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String checkTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            while(true){
                System.out.println(time + " inwhile");
                if(checkTime.equals(time)){
                    checkTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    System.out.println(checkTime +" checkTime");

                }else{
                    time = checkTime;
                    System.out.println(time);
                }
            }

        
        


        // while(somtthing is incrementing?)
    }

}




