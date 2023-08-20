//Will move to project and development likely
import java.util.Arrays;
import java.util.Random;
public class raffle {

public static void main(String[] args) {
       String raffleNameList[] = {"Henry", "Rick"};
       Random random = new Random();
        //Select from List
       int raffleDrawWinner = random.nextInt(raffleNameList.length);
       System.out.println(raffleNameList[raffleDrawWinner]);
}
}