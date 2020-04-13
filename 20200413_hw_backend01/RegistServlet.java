package com.ssafy.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Context Root 패스는 자동 추가되므로 적으면 안됨
@WebServlet("/product/regist.do")
public class RegistServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		String info = request.getParameter("info");
		
		StringBuilder html = new StringBuilder();
		
		html.append("<!DOCTYPE html>");
		html.append("<html>");
		html.append("	<head>");
		html.append("		<title> 상품 정보 출력 </title");
		html.append("		<meta charset='utf-8'>");
		html.append("	</head>");
		html.append("	<body>");
		html.append("		<div>");
		html.append("			<h2> 상품명 : " + name + "</h2>");
		html.append("		</div>");
		html.append("		<div>");
		html.append("			<h2> 상품 가격 : " + price + "원</h2>");
		html.append("		</div>");
		html.append("		<div>");
		html.append("			<h2> 상품 설명 : " + info + "</h2>");
		html.append("		</div>");
		html.append("		<div>");
		html.append("			<a href='regist.html'> 상품 등록 </a>");
		html.append("		</div>");
		html.append("	</body>");
		html.append("</html>");
		
		// 브라우저에게 전송하는 컨텐트의 내용을 해석할 수 있게 해야함 -> MIME 타입 설정
		response.setContentType("text/html;charset=utf-8");
//		response.setContentType("text/xml;charset=utf-8");
//		response.setContentType("text/plain;charset=utf-8");
		
		// 모든 처리가 되었으면 response
		// 응답 객체 얻기 (이미지 - 바이트 처리)
//		OutputStream out = response.getOutputStream();
		
		// 응답 객체 얻기 (문자열 처리)
		PrintWriter out = response.getWriter();
		out.println(html.toString());
		out.close();
	}
}
