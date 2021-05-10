package top.fqq.test.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;
import top.fqq.test.api.UserApi;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/5/8 9:53
 */
@RestController
public class UserController implements UserApi {

    @Override
    public String getUserId(){
        return "test";
    }

}
