# Navigation
简单的导航网站后台

# 环境
Java1.8 mysql5.6及以上版本 Maven3

# 下载代码
git clone https://github.com/wzce/Navigation

# 数据库设置
在本地机器建立数据库，名称navigation

在navigation数据运行项目中的sql脚本进行建表，在resource目录下

修改resource目录下的application.properties文件中数据的用户名和密码为自己机器数据库的用户名和密码

命令行进入项目目录Navigation

# 编译运行

mvn clean install

mvn spring-boot:run

项目正常启动

在浏览器输入127.0.0.1:8888/api/link?categoryId=1 回车即可获得数据
