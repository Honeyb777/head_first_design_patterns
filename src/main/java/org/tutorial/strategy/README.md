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
# Step3 동적으로 행동 지정하기
1. 오리의 행동을 즉석에서 변경하기 위한 flyBehavior 와 quackBehavior 를 수정 할 수 있는 Setter 메소드 추기 
2. Duck 클래스의 서브 클래스 ModelDuck 의 생성자에 FlyNoWay 형식과 Quack 형식을 사용해 구성
3. flyBehavior 인터페이스 형식의 FlyRocketPowered 클래스를 추가
4. MiniDickSimulator 클래스에서 ModelDuck 인스턴스를 새로 만들고 performFly 메소드를 호출
5. 이후 ModelDuck 인스턴스에 Setter 메소드를 통해 flyBehavior 인터페이스 형식의 FlyRocketPowered 형식으로 수정
6. ModelDuck 인스턴스의 performFly 메소드를 호출하여 수정된 flyBehavior 인터페이스 형식을 확인
   
