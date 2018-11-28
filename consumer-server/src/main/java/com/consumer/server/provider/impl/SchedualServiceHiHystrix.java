package com.consumer.server.provider.impl;

import com.consumer.server.provider.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * 断路策略
 */
@Component
public class SchedualServiceHiHystrix  implements SchedualServiceHi {


    @Override
    public String sayHiFromClientOne(String name) {

        return "name>>>>>>>>"+"Service temporarily unavailable";
    }
}
