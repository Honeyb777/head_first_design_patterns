# Step1 오리의 행동을 디자인하는 방법
1. 오리의 행동이 다양한 경우 클래스 집합을 유연하게 구성해야함
   - Duck 의 인스턴스에 행동을 할당하는 방법
   - 예로 MallardDuck 인스턴스를 새로 만들고 특정 형식의 fly 메소드를 할당하는 방법
   - 오리의 행동을 동적으로 변경하는 방법 ( Setter 메소드 )
2. 오리의 fly 메소드와 quack 메소드를 행동이라고 표현하고 인터페이스화 한다
   - 오리의 나는 행동은 FlyBehavior 인터페이스
   - 오리의 소리내는 행동은 QuackBehavior 인터페이스
# Step2 오리 행동 통합하기
1. 오리의 나는 행동과 소리내는 행동을 Duck 클래스에서 정의한 메소드를 써서 구현하지 않고 다른 클래스에 위임
   - flyBehavior 와 quackBehavior 인터페이스 형식의 인스턴스 변수를 추가\
     (특정 구상 클래스 형식으로 선언하지 않음)
2. 각 오리 객체에서는 실행시에 이 변수에 특정 행동 형식(FlyWithWings, Squeak 등)의 레퍼런스를 다형적으로 설정하여 사용
3. 나는 행동과 소리내는 행동은 Duck 클래스에서 직접 처리하지 않고, performFly 메소드와 performQuack() 메소드에 의해 참조되는 객체를 통해 사용
4. MallardDuck 인스턴스 변수의 경우 생성자에서 quackBehavior 인스턴스 변수와 flyBehavior 인스턴스 변수를 상속받음
   - 이때 타입은 Quack 형식과 FlyWithWings 형식을 사용함 