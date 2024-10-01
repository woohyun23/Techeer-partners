package Techeer_partners.Techeer_partners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){

        model.addAttribute("data", "hello!! ");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //ResponseBody : http에서 header, body 중 body부분에 데이터를 직접 넣겠다는 의미
    public String helloString(@RequestParam("name") String name){

        return "hello " + name; //"hello Spring" 문자를 요구
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        // getter, setter를 쓰는 이유 : name이 private으로 되어 있어 쉽게 꺼낼 수 없으므로
        // getter, setter를 통해 데이터를 넣고 뺄 수 있음
    }
}