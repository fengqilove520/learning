package top.fqq.transactionaldemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.fqq.transactionaldemo.service.TestService;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/4/15 16:21
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/add")
    public Boolean add(){
        testService.add();
        return true;
    }
}
