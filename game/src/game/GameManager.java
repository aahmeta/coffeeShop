package game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " adl� oyun eklendi.");
		
	}

	@Override
	public void upDate(Game game) {
		System.out.println(game.getGameName() + " adl� oyun g�ncellendi.");

		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " adl� oyun silindi.");
		
	}

}
