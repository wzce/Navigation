package com.nju.edu.cn.nvg.service.navigation;

import com.nju.edu.cn.nvg.pojos.entity.Link;
import com.nju.edu.cn.nvg.service.BaseService;

import java.util.List;

public interface LinkService extends BaseService<Link> {
    List<Link>  getLinkOfCategory(Long categoryId);
}
