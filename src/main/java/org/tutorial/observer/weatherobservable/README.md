# Step1 기상 모니터링 애플리케이션 알아보기
1. 기상 모니터링 애플리케이션의 구성 파악
    - 기상 스테이션 (실제 기상 정보를 수집하는 물리 장비)
    - WeatherData 객체(기상 스테이션으로 부터 오는 정보를 추적하는 객체)
    - 사용자에게 현재 기상 조건을 보여주는 디스플레이 장비
2. WeatherData 객체로 아래 항목을 디스플레이 장비에 갱신해 가면서 보여주는 애플리케이션이 필요함
    - 현재 조건
    - 기상 통계
    - 기상 예보
# Step2 Weather 클래스 살펴보기
1. WeatherData 클래스는 온도, 습도, 기압을 반환하는 getter 메소드 3개가 존재함
2. WeatherData 에서 갱신된 값을 가져올 때마다 호출되는 measurementsChanged 메소드가 존재함
# Step3 기상 스테이션용 코드 추가하기
1. 디스플레이 정보를 표기하기 위한 Display 인터페이스를 추가
   - 각 디스플레이의 정보를 갱신하기 위한 update 메소드와 화면을 표기하기 위한 display 메소드가 존재함
2. WeatherData 클래스의 measurementsChanged 메소드에서는 최신 측정 값을 조회하여, 각 display 를 갱신
