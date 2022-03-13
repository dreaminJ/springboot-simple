# springboot_simple
Spring boot 단순 DB 연결테스트를 위한 구성

DB 서버에서 현재 시간을 조회한다. 

==Dao 적용- Mapper를 쓰지 않았을 경우와의 차이점 

* Mapper는 인터페이스 + 어노테이션 or 인터페이스 + xml이 쌍을 이루어야 한다. 
* Dao는 Class로 구현하며 SqlSession을 등록해줘야 한다.
* 네임스페이스 + “.” + SQL ID or SQL ID로 지정해서 SQL 메소드를 호출해야 한다.
* DAO는 데이터 객체가 DB에 직접적으로 접근한다. 
