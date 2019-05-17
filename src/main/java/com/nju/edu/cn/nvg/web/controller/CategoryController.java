package com.nju.edu.cn.nvg.web.controller;

//import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageInfo;
import com.nju.edu.cn.nvg.pojos.entity.Category;
import com.nju.edu.cn.nvg.service.navigation.CategoryService;
import com.nju.edu.cn.nvg.util.Code;
import com.nju.edu.cn.nvg.util.Page;
import com.nju.edu.cn.nvg.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;


    @RequestMapping(method = RequestMethod.GET)
    public Response categoryList() {

        //查询，判断是否需要模糊查询
        List<Category> categoryList=categoryService.getAll();

        //封装返回形式
        PageInfo pageInfo = new PageInfo(categoryList);
        Page page = new Page(1, categoryList.size(), pageInfo.getTotal());
        return Response.success(categoryList, page);
    }


    @RequestMapping(method = RequestMethod.POST)
    public Response addCategory(@RequestBody Category category) throws NoSuchAlgorithmException {

        if(category==null || StringUtils.isEmpty(category.getName())){
            return Response.error(new Code(Code.ERROR.Exception_001));
        }

        categoryService.add(category);
        return Response.success();
    }


    @RequestMapping(method = RequestMethod.DELETE)
    public Response delCategory  (Long[] ids) {
        if (0 != categoryService.batchDelete(ids, -1L)) {
//            redisService.delSessionByIds(ids, false);
            return Response.success();
        }
        return Response.error(new Code(Code.ERROR.ERROR_COMMON_DELETE));
    }

}
