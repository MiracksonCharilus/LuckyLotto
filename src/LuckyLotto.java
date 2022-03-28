import java.util.*;
public class LuckyLotto {

    public static void main(String[] args) {
        //int[][] luckyNumbers = giveMeLuckyLotto();
        printLottoTickts(giveMeLuckyLotto());

    }

    public static int[][] giveMeLuckyLotto() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many tickets do you want to buy?");
        int numTickets = keyboard.nextInt();
        Random myRan = new Random();
        int[][] myTickets = new int[numTickets][6];
        for (int tickets = 0; tickets < myTickets.length; tickets++) {
            for (int luckyNums = 0; luckyNums < myTickets[tickets].length; luckyNums++) {
                myTickets[tickets][luckyNums] = myRan.nextInt(1, 60);
            }

        }
        return myTickets;
    }

    public static void printLottoTickts(int[][] luckyNumbers) {
        for (int i = 0; i < luckyNumbers.length; i++) {
            System.out.print("Ticket #" + (i + 1) + " is ");
            for (int j = 0; j < luckyNumbers[i].length; j++) {
                System.out.print(luckyNumbers[i][j] + " ");
            }
            System.out.println("");
        }
    }
}