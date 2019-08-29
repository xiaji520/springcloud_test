package cn.xiaji.springcloud.client;
//encoding: utf-8

import cn.xiaji.springcloud.domain.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author: xj
 * @contact: xiaruji520@gmail.com
 * @file: UserClientHystrixFallbackFactory.java
 */
/*

 */
@Component
//UserClient 表示对那个接口进行托底处理
public class UserClientFeignHystrixFallbackFactory implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable throwable) {
        return new UserClient() {
            public User getUserById(Long id) {
                return new User(id, "用户不存在!");
            }
        };
    }
}