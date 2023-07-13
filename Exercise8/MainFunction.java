
package Exercise8;

import java.util.Scanner;

public class MainFunction {
 
    public static void main(String[] args) {
        
        SinglePlayerGame singlePlayerGame = new SinglePlayerGame();
        MultiplayerGame multiplayerGame = new MultiplayerGame();
        GameLauncher gameLauncher = new GameLauncher();
        int op=0;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("1.  Single play");
            System.out.println("2.  Multiple play");
            System.out.println("3.  Exit game");
            System.out.print("Choose option on the menu = ");
            op=scanner.nextInt();
            switch (op) {
                case 1:
                {   boolean check = true;
                    while(check){
                        System.out.print("Enter for start game now (start/pause/stop/again/close)  = ");
                        String option = scanner.next();
                        if(option.equals("start")){
                            gameLauncher.launchGame(singlePlayerGame,"start");
                        }else if(option.equals("pause")){
                            gameLauncher.launchGame(singlePlayerGame,"pause");
                        }else if(option.equals("stop")){
                            gameLauncher.launchGame(singlePlayerGame,"stop");
                        }else if(option.equals("again")){
                            singlePlayerGame.playingAgain();
                        }else if(option.equalsIgnoreCase("close")){
                            break;
                        }
                        else{
                            System.out.println("Command not found");
                        }
                        
                    }
                    
                }break;
                case 2:{
                    boolean check = true;
                    while(check){
                        System.out.print("Enter for start game now (start/pause/stop/again/close)  = ");
                        String option = scanner.next();
                        if(option.equals("start")){
                            gameLauncher.launchGame(multiplayerGame,"start");
                        }else if(option.equals("pause")){
                            gameLauncher.launchGame(multiplayerGame,"pause");
                        }else if(option.equals("stop")){
                            gameLauncher.launchGame(multiplayerGame,"stop");
                        }else if(option.equals("again")){
                            multiplayerGame.playingAgain();
                        }else if(option.equalsIgnoreCase("close")){
                            break;
                        }
                        else{
                            System.out.println("Command not found");
                        }          
                    }
                }break;
                case 3:{
                    System.exit(0);
                }break;
                
            }
        }while(op!=3);
        
    }
}
