package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //파일을 리턴 할꺼기 때문에
public class HttpRespController {

    @GetMapping("/txt")
    public String txt(){
        return "a.txt";  // 프레임 워크를 사용하기 때문에 틀이 정해져 있음) 일반 정적 파일들은 resources/static 폴더 내부가 디폴트 경로이다.
    }

    @GetMapping("/mus") // 코드 해석이 안됨
    public String mus(){
        return "b"; // 머스태치 템플릿 엔진 라이브러리 등록 완료 - templates 폴더안에 .mustache을 나두면 확장자 없이 파일명만 적으면
        //자동으로 찾아감.
    }

    @GetMapping("/jsp")
    public String jsp(){
        return "c"; // ViewResolver가 발동
    }



}
