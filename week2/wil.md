Browser->Controller: 원하는 서비스요청, HTTP요청/응담, URL로 요청을 가장 먼저 처리, DTO를 사용하여 
                     서비스 계층과 데이터 주고 받음
Controller->Service(서비스 구현 가능): 원하는 서비스 전달
Service->DAO: 필요한 정보 요청, DTO(꼭 필요한 정보 모음, 데이터 전송 객체) 요청
DAO->DB: DAO가 DB에서 필요한 정보 추출, Entity(DB에서 Table과 대응됨)

Controller, Service, Repository, Entity

패키지 구조
계층형: 어플리케이션을 기능별로 나눈다
도메인형: 도메인 관련 모든 클래스를 포함, 유지보수하기 용이

원자성을 보장하기 위해서는 트랜잭션 단위로 처리(서비스 계층 메서드 위에 @transactional 붙이기)

스프링 어플리케이션 구조
Tocat, Spring Container(빈 저장소)
스프링 빈: 공용객체, 빈은 빈만 요구 가능, @Component, @ComponentScan

생성자 주입
1.안전하게 final로 선언
2.생성자에 @Autowired을 사용
3.만약 생성자가 하나만 있다면, @Autowired를 생략가능