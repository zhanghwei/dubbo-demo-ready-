package com.zhanghengwei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhanghengwei.pojo.Article;
import com.zhanghengwei.pojo.Condition;

public interface ArticleDao {

	List<Article> list(@Param("con")String con);

}
