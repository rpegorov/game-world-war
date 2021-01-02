import service.game.GameService;
import service.game.impl.GameServiceImpl;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameServiceImpl();
        gameService.startGame();
    }
}
