package top.fqq.nacosdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/5/10 10:41
 */
@RestController
//开启配置文件动态刷新
@RefreshScope
public class ConfigController {


    @Value("${nacos.testId}")
    private String testId;

    @RequestMapping("/getTestId")
    public String getTestId() {
        return testId;
    }
}
