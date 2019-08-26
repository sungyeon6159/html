package com.naver.eng.appserver.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naver.eng.appserver.business.NicknameBusiness;


@Controller
public class ContentController

{   @Autowired  
	NicknameBusiness nbo;
	
	@RequestMapping("/input")
    public Object input(Map<String, Object> model) throws Exception {
		// 정보를 입력 받는 화면.
		NicknameBusiness fastNick = new NicknameBusiness();// 임포트 : 컨트롤 씨프트5
		String name = fastNick.getNickName ("ff"); 
		//싱글턴 패턴? ioc를 사용하는 이유이다. 객체를 내가 아니라 컴퓨터가 관리하도록 하는 시스템
		String name1 = nbo.getNickName("ff");
		
		model.put("nick", name);
		model.put("nick1", name1);
		
		return "input";
    }

	@RequestMapping("/list")
    public Object list(Map<String, Object> model) throws Exception {
		// 입력된 정보의 리스트 노출.
		return "index";
    }

	@RequestMapping("/view")
    public Object view(Map<String, Object> model) throws Exception {
		// 입력된 컨텐츠의 상세 화면.
		return "index";
    }
}
