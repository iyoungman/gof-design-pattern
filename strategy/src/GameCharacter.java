/**
 * Created by YoungMan on 2019-04-24.
 */

public class GameCharacter {

	//접근
	Weapon weapon;

	//칼이나 검으로 교환
	void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	/**
	 * 델리게이트
	 * 자신이 들고있는 무기에 따라서 공격
	 */
	void attack() {
		if (weapon == null) {
			System.out.println("맨손 공격");
			return;
		}
		weapon.attack();
	}
}
