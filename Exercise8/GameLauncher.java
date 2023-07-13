
package Exercise8;

public class GameLauncher {
    public void launchGame(Game game,Object object){
        if(object=="start"){
            game.starting("Game starting now");
        }else if(object=="pause"){
            game.pausing("Game pausing now");
        }else if(object=="stop"){
            game.pausing("Game stoping now");
        }     
    }
}
