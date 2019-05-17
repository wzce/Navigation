package com.nju.edu.cn.nvg.web.controller;


import com.github.pagehelper.PageInfo;
import com.nju.edu.cn.nvg.pojos.entity.Link;
import com.nju.edu.cn.nvg.service.navigation.LinkService;
import com.nju.edu.cn.nvg.util.Code;
import com.nju.edu.cn.nvg.util.Page;
import com.nju.edu.cn.nvg.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping("/link")
public class LinkController {

    @Autowired
    LinkService linkService;

    @RequestMapping(method = RequestMethod.GET)
    public Response getAll(@RequestParam(defaultValue = "-1") Long categoryId) {
        //查询，判断是否需要模糊查询
        List<Link> linkList = linkService.getLinkOfCategory(categoryId);

        //封装返回形式
        PageInfo pageInfo = new PageInfo(linkList);
        Page page = new Page(1, linkList.size(), pageInfo.getTotal());
        return Response.success(linkList, page);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Response addLink(@RequestBody Link link) throws NoSuchAlgorithmException {

        if(link==null || StringUtils.isEmpty(link.getName()) || link.getCategoryId()==null || link.getCategoryId()==0){
            return Response.error(new Code(Code.ERROR.Exception_001));
        }

        linkService.add(link);
        return Response.success();
    }


}
