package com.tech.sprj0000.BTController;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.sprj0000.dao.IDao;
import com.tech.sprj0000.dto.BTDto;

@Controller
public class BTController {
	private static final Logger logger = LoggerFactory.getLogger(BTController.class);
	
	static boolean flag=true;
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model) {
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		
		ArrayList<BTDto> list = dao.list();
		model.addAttribute("list",list);
		
		return "list";
	}
	
	@RequestMapping("empno")
	public String empno(HttpServletRequest request, Model model) {
		logger.info("empno gogogogogogogogo");
		IDao dao = sqlSession.getMapper(IDao.class);
		
		String empno="EMPNO";
		ArrayList<BTDto> list = null;
		if (flag) {
			list=dao.empno("1",empno);
			flag=false;
		}else {
			list=dao.empno("2",empno);
			flag=true;
			
		}
		System.out.println("flaggggg : "+flag);
		model.addAttribute("list",list);
		
		return "list";
	}
	
	@RequestMapping("ename")
	public String ename(HttpServletRequest request, Model model) {
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		String ename = " ENAME ";
		ArrayList<BTDto> list = null;
		
		if (flag) {
			list = dao.ename("1",ename);
			flag=false;
		}else {
			list = dao.ename("2",ename);
			flag=true;
		}
		
		
		model.addAttribute("list",list);

		
		return "list";
	}
	
	@RequestMapping("hiredate")
	public String hiredate(HttpServletRequest request, Model model) {
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		String hiredate = "";
		ArrayList<BTDto> list = null;
		
		if (flag) {
			hiredate = "HIREDATE";
			list = dao.hiredate("1",hiredate);
			flag=false;
		}
		else {
			hiredate = "HIREDATE";
			list = dao.hiredate("2", hiredate);
			flag=true;
		}
		
		model.addAttribute("list",list);

		
		return "list";
	}
	
	@RequestMapping("sal")
	public String sal(HttpServletRequest request, Model model) {
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		String sal = "SAL";
		ArrayList<BTDto> list = null;
		
		if (flag) {
			list = dao.sal("1",sal);
			flag = false;
		}
		else {
			list = dao.sal("2",sal);
			flag = true;
		}
		
		model.addAttribute("list",list);

		
		return "list";
		//redirect일시 컨트롤러의  list 로 돌아감으로  sal 로 order by 안됨??
	}
}
