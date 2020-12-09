package ch.cloud.common.api.user.result;

/*
 *  作者 Alan.chen
 *  时间 2020/1/17-9:55
 */

import ch.cloud.common.api.user.support.UserReq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ch-spring-user")
public interface UserServiceAPI {

    @RequestMapping("/hello")
    String helloFeign(@RequestParam("name") String name);

    @RequestMapping(value = "/helloAlan")
    String helloAlan(@RequestBody UserReq userReq);
}
