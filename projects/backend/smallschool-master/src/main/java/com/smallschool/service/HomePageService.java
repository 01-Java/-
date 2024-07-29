package com.smallschool.service;

import com.smallschool.entity.ProductDetails;
import com.smallschool.mapper.HomaPageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
*   按照限量排名进行首页展示
*   搜索功能
* */
@Service
public class HomePageService {
    //products 表
@Autowired
    private HomaPageMapper homePageMapper;

    public List<ProductDetails> getRecommend(){
       return  homePageMapper.homeRecommend();
    }

    public List<ProductDetails> getCategory(String category){
        return homePageMapper.homeByCategory(category);
    }

    public List<ProductDetails> getSearch(String search){
        return homePageMapper.homeSearch(search);
    }
}