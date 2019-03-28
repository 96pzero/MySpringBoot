* 调用时去掉文件的后缀名即可。

* @PropertySource：加载指定的配置文件；前提是application.properties文件不存在，否则会优先级高的会覆盖优先级低的。  
* @ImportResource：导入Spring的配置文件，让配置文件里面的内容生效；  
1、添加一个Service；
2、配置类@Configuration------>Spring配置文件
3、使用@Bean给容器中添加组件Service
4、注：测试前先把前面@ImportResource的注解给去除或注释