# springCloud

## 已经实现的功能
>> 断路器

    hystrix
    使用@FeignClient 来实现服务的熔断和服务降级
    和服务的内部相互调用
    
>> 注册中心
    
    eureka-server
    注册中心默认也是服务，需要配置把自身排除(注册到注册中心的服务是服务者也是消费者)
    eureka:
      client:
        # 表示是否将自己注册到Eureka Server，默认为true。
        register-with-eureka: false
        # 表示是否从Eureka Server获取注册信息，默认为true。
        fetch-registry: false
        # 设置与Eureka Server交互的地址，查询服务和注册服务都需要依赖这个地址。默认是http://localhost:8761/eureka ；多个地址可使用,分隔
        service-url:
          defaultZone: http://localhost:${server.port}/eureka/
    
>> 配置中心
    
    config-client
    config-server
    
>> zuul服务分发
    
    zuul-server
    服务分发负载，根据路由来请求到不同的服务，可以自定义过滤器来拦截服务。
    #配置路由规则
    zuul:
      routes:
        service-hi:
          path: /hi
          serviceId: service-hi
        service-feign:
          path: /hi
          serviceId: service-feign