﻿## 配置文件加载位置

springboot 启动会扫描以下位置的application.properties或者application.yml文件作为Spring boot的默认配置文件  
–file:./config/  
–file:./  
–classpath:/config/  
–classpath:/  
优先级由高到底，高优先级的配置会覆盖低优先级的配置；  
SpringBoot会从这四个位置全部加载主配置文件；**互补配置**；


==我们还可以通过spring.config.location来改变默认的配置文件位置==  
**项目打包好以后，我们可以使用命令行参数的形式，启动项目的时候来指定配置文件的新位置；指定配置文件和默认加载的这些配置文件共同起作用形成互补配置；**  
java -jar jarName.jar --spring.config.location=C:/application.properties