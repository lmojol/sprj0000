package com.tech.sprj0000.dao;

import java.util.ArrayList;

import com.tech.sprj0000.dto.BTDto;

public interface IDao {
	public ArrayList<BTDto> list();
	public ArrayList<BTDto> empno(String flag,String empno);
	public ArrayList<BTDto> hiredate(String string, String hiredate);
	public ArrayList<BTDto> sal(String string, String sal);
	public ArrayList<BTDto> ename(String flag, String ename);
	


}
