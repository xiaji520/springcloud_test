package cn.xiaji.springcloud.client;

import cn.xiaji.springcloud.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//最终会根据接口产生代理对象,远程访问服务提供者,就需要远程服务提供者的名称
@FeignClient(value = "USER-PROVIDER", fallbackFactory
        = UserClientFeignHystrixFallbackFactory.class)
@RequestMapping("/user/provider")
public interface UserClient {

    // user/provider/{id} 通过它来确定唯一要调用的远程方法
    @RequestMapping("/{id}")
    User getUserById(@PathVariable("id") Long id);

}
