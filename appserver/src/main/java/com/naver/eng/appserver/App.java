package com.naver.eng.appserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
// 프리마커 , 핸들바 ,핵사모날 api???

//싱클톤 어노테이션! 객체를 대신한다!!!메모리를 차지않는 것이 장점이다.
//→단, 멤버변수를 사용하지 않는다! 스프링 프레임 워크
// 어노테이션 서비스를 붙이면 스프링 빔팩토리로 보내는것!  그걸 다시 오토와이어로 꺼내서 사용할수있다.
// 컨트롤러 

// 디비 sql,jpl, 제어의 역행, 레이어드 아키택쳐,oop, ioc제어의 역행 ,인터페이스기반,롤백???하는방법