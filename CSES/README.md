该项目是使用spring cloud搭建的一个微服务项目

运行项目：

    先clone项目到本地
    1.maven的方式：
        进入根目录，执行mvn install
        然后一次进入各个子项目，执行mvn clean install spring-boot:run即可，服务启动的顺序，要求先启动config，然后是rigister、gateway这
        三个服务，这三个服务要求先启动，其他服务的顺序不要求。
        
        注意：对于usermanager服务，要求先在本地建立一个数据库cses_usermanager，然后修改application.yml里的数据库账户的用户名、密码然后再
        执行编译启动即可，flaaway会自动执行建表语句。
        
        启动之后，发送http://localhost:4000/usermanager/v1/user/identifyCode/mail?hardCode=wqeqw12ewee222e2e&email=2393147618@qq.com
        请求就可以使用用户管理的邮件注册接口发送验证码，调用通知服务的邮件功能，收到邮件。
        
        调用http://localhost:4000/usermanager/v1/user/manager/ 获取所有的用户。
        
        服务端口：
         gateway:4000
         config:8888
         register:8761
         usermanager:11000
         notification:11002
         
         
         暂时没有使用到docker（后期看能不能加上）
         
         使用gradle的筒子得自行了解，因为我不懂，顾恒清会，对，可以问他！
         
        
        