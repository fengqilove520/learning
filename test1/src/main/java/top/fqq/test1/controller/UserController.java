package top.fqq.test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/5/8 9:53
 */
@RestController
@RequestMapping("/api/user")
public class UserController {


    @PostMapping("getUserId")
    public String getUserId(){
       return "123";
    }

}
