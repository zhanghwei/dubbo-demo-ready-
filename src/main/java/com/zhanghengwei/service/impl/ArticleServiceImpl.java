package com.zhanghengwei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhanghengwei.dao.ArticleDao;
import com.zhanghengwei.pojo.Article;
import com.zhanghengwei.pojo.Condition;
import com.zhanghengwei.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	private ArticleDao articleDao;
	
	@Override
	public List<Article> list(String con) {
		// TODO Auto-generated method stub
		System.out.println("+++"+con);
		return articleDao.list(con);
	}

}
