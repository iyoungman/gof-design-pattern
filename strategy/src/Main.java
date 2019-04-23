/**
 * Created by YoungMan on 2019-04-24.
 */

public class Main {

	public static void main(String[] args) {

		GameCharacter gameCharacter = new GameCharacter();

		gameCharacter.attack();

		gameCharacter.setWeapon(new Knife());
		gameCharacter.attack();

		gameCharacter.setWeapon(new Sword());
		gameCharacter.attack();

		gameCharacter.setWeapon(new Ax());
		gameCharacter.attack();
	}
}
