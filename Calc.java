import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	@WebServlet("/hello")
	public class Hello extends HttpServlet {
		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			out.println("Hello from Servlet");
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}

	}
*/

/**
 * @author Celio-Vieira
*/

@WebServlet("/calc")
public class Calc extends HttpServlet {

	@Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Pega os dados do form html submetidos
		String _marca = request.getParameter("marca");
		String _modelo = request.getParameter("modelo");
		Integer _capacidade = request.getParameter("capacidade");
		Integer _distancia = request.getParameter("distancia");
		Integer _consumo = request.getParameter("consumo");

		/** Calculos
		 * Calcula quantidade consumida
		 * Calcula quantidade de litros restantes
		*/
		Integer qtd_consumido = _capacidade / _distancia; //Km/l
		Integer qtd_litros_rest = _capacidade - qtd_consumido;

		request.setAttribute("Marca", _marca);
		request.setAttribute("Modelo", _modelo);
		request.setAttribute("Capacidade-do-Tanque", _capacidade);
		request.setAttribute("Distancia-Percorrida", _distancia);
		request.setAttribute("Consumo", _consumo);
		request.setAttribute("Consumido", qtd_consumido);
		request.setAttribute("Restante", qtd_litros_rest);

		request.getRequestDispatcher("resposta.jsp").forward(request, response);
	}
}
