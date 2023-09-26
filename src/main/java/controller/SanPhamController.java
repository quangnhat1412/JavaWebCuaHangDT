package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SanPhamDao;
import model.SanPham;

/**
 * Servlet implementation class SanPhamController
 */
@WebServlet("/san-pham")
public class SanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SanPhamController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Khai báo tiếng việt
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String hanhDong = request.getParameter("hanhDong");
		if (hanhDong.equals("hien-thi-lsp")) {
			hienThiLSP(request, response);
		} else if (hanhDong.equals("hien-thi-sp")) {
			hienThiSP(request, response);
		}else if(hanhDong.equals("null")){
	        // Nếu hanhDong không được thiết lập hoặc không khớp với "hien-thi-lsp" hoặc "hien-thi-sp"
	        // thì mặc định chạy hienThiSP
	        hienThiSP(request, response);
	    }
	}

	private void hienThiSP(HttpServletRequest request, HttpServletResponse response) {
		
		
	}

	private void hienThiLSP(HttpServletRequest request, HttpServletResponse response) {
		try {
			SanPhamDao spdao = new SanPhamDao();
			ArrayList<SanPham> sps = spdao.selectAll();
			request.setAttribute("dssp", sps);
			
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
