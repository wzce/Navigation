package cn.edu.nju.software.usermanager.service.impl.verify;

import cn.edu.nju.software.usermanager.dao.mapper.IdentifyCodeMapper;
import cn.edu.nju.software.usermanager.domain.entity.IdentifyCode;
import cn.edu.nju.software.usermanager.service.impl.BaseServiceImpl;
import cn.edu.nju.software.usermanager.service.verify.VerifyService;
import org.springframework.stereotype.Service;

@Service
public class VerifyServiceImpl extends BaseServiceImpl<IdentifyCode,IdentifyCodeMapper> implements VerifyService{

}
