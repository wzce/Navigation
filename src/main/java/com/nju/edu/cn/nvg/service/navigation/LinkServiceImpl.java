package com.nju.edu.cn.nvg.service.navigation;

import com.nju.edu.cn.nvg.dao.mapper.LinkMapper;
import com.nju.edu.cn.nvg.pojos.entity.Link;
import com.nju.edu.cn.nvg.service.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl extends BaseServiceImpl<Link, LinkMapper> implements LinkService {
    @Override
    public List<Link> getLinkOfCategory(Long categoryId) {
        return mapper.selectAll();
    }
}
