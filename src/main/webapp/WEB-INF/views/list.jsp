<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/btstyle.css" />
</head>
<body>
	<h3>리스트 list</h3>
		<div class="container" >
		    <a href="empno" title="Button slide blue/green" class="button btnSlide btnBlueGreen">
		      <span class="top" data-content="Slide">사원번호</span>
		      <span class="bottom" data-content="Slide">empno</span>
		    </a>
		    <a href="ename" title="Button slide lightblue" class="button btnSlide btnLightBlue">
		      <span class="top" data-content="Slide">이름 정렬</span>
		      <span class="bottom" data-content="Slide">ename</span>
		    </a>
		    <a href="hiredate" title="Button slide orange" class="button btnSlide btnOrange">
		      <span class="top" data-content="Slide">입사일 정렬</span>
		      <span class="bottom" data-content="Slide">hiredate</span>
		    </a>
		    <a href="sal" title="Button slide purple" class="button btnSlide btnPurple">
		      <span class="top" data-content="Slide">연봉 정렬</span>
		      <span class="bottom" data-content="Slide">sal</span>
		    </a>
		    <div class="clear"></div>
	  </div>
  <br />&nbsp;&nbsp;&nbsp;<hr />
	<table width="800" border="1">
		<tr>
			<td>사원번호</td>
			<td>이름</td>
			<td>직책</td>
			<td>MGR</td>
			<td>입사일</td>
			<td>연봉</td>
			<td>DEPTNO</td>
		</tr>
		
		<c:forEach items="${list }" var="dto">
			<tr>
				<td>${dto.empno }</td>
				<td>${dto.ename }</td>
				<td>${dto.job }</td>
				<td>${dto.mgr }</td>
				<td>${dto.hiredate}</td>
				<td>${dto.sal}</td>
				<td>${dto.deptno }</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>