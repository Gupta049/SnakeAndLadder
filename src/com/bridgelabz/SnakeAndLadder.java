package com.bridgelabz;


public class SnakeAndLadder {
    static final int WIN_POSITION = 100;
    static int diceCountP1=0;
    static  int diceCountP2 = 0;
    static  int playerPositionOne = 0;
    static  int playerpositionTwo = 0;

    static void whoWonFunction(String player, int playerPosition, int diceCount){
        System.out.println(player + " Won ");
        System.out.println("Position : " + playerPosition);
        System.out.println(" and Dice Rolled : " + diceCount + " times to win ");
    }

    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game");
        int playerChance = 0;

        while (playerPositionOne < WIN_POSITION && playerpositionTwo < WIN_POSITION) {
            int diceValue = (int) (Math.random() * 10) % 6 + 1;
            System.out.println("Dice Value = " + diceValue);

            // generating random number for checking player positions
            int randomOption = (int) (Math.random() * 10 % 3);
            System.out.println("Choice = " + randomOption);

            if (playerChance % 2 == 0) {
                switch (randomOption) {
                    case 0:
                        System.out.println("No Play");
                        break;
                    case 1:
                        diceCountP1++;
                        playerPositionOne = playerPositionOne + diceValue;
                        //If crossing 100
                        if (playerPositionOne > WIN_POSITION) {
                            playerPositionOne = playerPositionOne - diceValue;
                        }
                        System.out.println("Player 1 --> " + playerPositionOne);

                        if (playerPositionOne == WIN_POSITION)
                            whoWonFunction("Player 1", playerPositionOne, diceCountP1);
                        break;
                    case 2:
                        diceCountP1++;
                        playerPositionOne = playerPositionOne - diceValue;
                        //If crossing below 0
                        if (playerPositionOne < 0) {
                            playerPositionOne = 0;
                        }
                        System.out.println("Player 1 --> " + playerPositionOne);

                        if (playerPositionOne == WIN_POSITION)
                            whoWonFunction("Player 1", playerPositionOne, diceCountP1);
                        break;
                }
            }else{
                    switch (randomOption) {
                        case 0:
                            System.out.println("no play");
                            break;
                        case 1:
                            diceCountP2++;
                            playerpositionTwo = playerpositionTwo + diceValue;
                            //If crossing 100
                            if(playerpositionTwo > WIN_POSITION){
                                playerpositionTwo = playerpositionTwo - diceValue;
                            }
                            System.out.println("Player 2 --> " + playerpositionTwo);
                            if(playerpositionTwo == WIN_POSITION)
                                whoWonFunction("Player 2",playerpositionTwo,diceCountP2);
                            break;
                        case 2:
                            diceCountP2++;
                            playerpositionTwo = playerpositionTwo - diceValue;
                            //If crossing below 0
                            if(playerpositionTwo < 0){
                                playerpositionTwo = 0;
                            }
                            System.out.println("Player 2 --> " + playerpositionTwo);

                            if(playerpositionTwo == WIN_POSITION)
                                whoWonFunction("Player 2",playerpositionTwo,diceCountP2);
                            break;
                }
            }
            playerChance++;
        }
    }
}


