package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NowServlet extends HttpServlet {
	//필드
	private String location;
	
	
	//생성자
	public NowServlet() {
		System.out.println("NowServlet 객체 생성");  //클라이언트가 최초로 요청할때만 실행
	}
	//초기화 메소드
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("NowServlet 초기화");
		location = config.getInitParameter("location");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		// OutputStream os = response.getOutputStream(); //그림이든 문자든 여러개를 다 출력할때
		// 사용

		PrintWriter out = response.getWriter(); // 문자열만 출력하고자 PrintWriter
												// //출력스트림에 의해 들어가는 내용은 본문내용에
												// 들어간다
		out.println("<html>");
		out.println("<head><meta charset='UTF-8'></head>");
		out.println("<body>");
		out.println("현재 " + location + "시간: " + new Date().toString());
		out.println("</body>");
		out.println("</html>");

	}

}
