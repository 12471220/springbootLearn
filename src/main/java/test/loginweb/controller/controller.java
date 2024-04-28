package test.loginweb.controller;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import test.loginweb.entity.user;
import test.loginweb.mapper.userMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class controller {
    HttpSession ss;
    @Autowired
    private userMapper um;

    @GetMapping("/login/index")
    public String index(Model m){
        if(ss==null)
            return "login";

        m.addAttribute("usr","114514");
        m.addAttribute("psw","1919810");
        return "index";
    }

    @PostMapping("/login/login")
    public String hello(HttpServletRequest request, @RequestParam(value = "usr") String user,@RequestParam("psw") String pass) {

        ss = request.getSession();
        if(ss.getAttribute("save")==null){
            System.out.println("session is null");
            ss.setAttribute("save", "you had been login");
        }
        else{
            System.out.println(ss.getAttribute("save"));
        }
        System.out.println("user: "+user);
        System.out.println("pass: "+pass);
        // 设置要返回的视图的逻辑名称
        // 此处假设您已经配置了视图解析器，可以将逻辑名称解析为实际的视图路径
        return "index";
    }
    @GetMapping("/test/t1")
    //测试数据库
    public String t1(Model m){
        List<user> users = um.selectList(null);
        for(user u:users){
            System.out.println(u.getUname()+"    "+u.getPsw());
        }
        user user = users.get(0);

        m.addAttribute("usr",user.getUname());
        m.addAttribute("psw",user.getPsw());
        return "index";
    }
    @GetMapping("/test/t2")
    public String t2(){
        //测试前端处理json
        Map<String,Object> data = new HashMap<>();
        return "jsonHANDLE";
    }
}
