package top.fqq.test.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/5/8 10:45
 */
@FeignClient(name = "test")
@RequestMapping("/service/user")
public interface UserApi {

    @PostMapping("/getUserId")
    String getUserId();
}
