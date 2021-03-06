# StrategyPattern

### 인터페이스
* 인터페이스(인터페이스에 구현할 것은 결국 기능이다) 무기 : 공격
* 기능에 대한 선언과 구현을 분리
* 기능을 사용 통로

### 델리게이트
* 위임하다,떠넘기다
* 한 객체에서 다른 객체의 기능을 호출하여 사용한다

### 전략패턴  
![image](https://user-images.githubusercontent.com/25604495/56599141-ef412c80-6630-11e9-8e48-1f95a1bdffae.png)  
* 여러 알고리즘을 하나의 추상적인 접근점(인터페이스)을 만들어 접근 점에서 서로 교환 가능하도록 하는 패턴

### 요구 사항
* 신작 게임에서 캐릭터의 무기를 구현
* 무기는 두가지 종류가 있다
  + 칼
  + 검
* 칼과 검은 방식은 다르지만 무기라는 접합점을 가지고 있다

### 요구 사항 유지 보수
* 무기 중 도끼 추가

### 장점
* 유지보수 할 때 효율적이다(도끼 기능을 추가할 때 간단하게 추가)
* 인터페이스로 메소드명을 강제해 설계를 하여 다른 메소드를 못쓰게 막는 효과(협업시 유용)
