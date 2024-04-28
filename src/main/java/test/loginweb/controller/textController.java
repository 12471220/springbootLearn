package test.loginweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class textController {
    @GetMapping("/page/jsontest")
    public Map<String,Object> jsontest(){
        Map <String,Object>data = new HashMap<>();
        data.put("status",200);
        data.put("msg","success");
        data.put("data",new HashMap<String,Object>(){
            {
                put("name","lisi");
                put("age",20);
            }
        });
        return data;
    }

}
