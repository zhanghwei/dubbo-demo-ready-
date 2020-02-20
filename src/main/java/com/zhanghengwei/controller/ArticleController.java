package com.zhanghengwei.controller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhanghengwei.pojo.Article;
import com.zhanghengwei.pojo.Condition;
import com.zhanghengwei.service.ArticleService;

@Controller
public class ArticleController {

	@Resource
	private ArticleService articleService;
	
	@RequestMapping("/list")
	public String list(Model m,String con) {
		System.out.println(con);
		List<Article> list=articleService.list(con);
		for (Article article : list) {
			System.out.println(article);
		}
		m.addAttribute("list", list);
		return "list";
		
	}
}
