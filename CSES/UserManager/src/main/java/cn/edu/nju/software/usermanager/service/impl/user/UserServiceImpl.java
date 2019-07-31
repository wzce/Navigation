package cn.edu.nju.software.usermanager.service.impl.user;

import cn.edu.nju.software.usermanager.dao.mapper.UserMapper;
import cn.edu.nju.software.usermanager.domain.entity.User;
import cn.edu.nju.software.usermanager.service.impl.BaseServiceImpl;
import cn.edu.nju.software.usermanager.service.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User,UserMapper> implements UserService{
}
