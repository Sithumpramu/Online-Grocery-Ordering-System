package manager;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

public class DriverdetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ss = request.getSession();
		try {
		
		
		List <Drivers> driver = DButil.getDeliveryDrivers();
		ss.setAttribute("driver", driver);
		
		
		
		}
		catch(Exception e){
			e.getStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("DeliverManagement.jsp");
		dispatcher.forward(request, response);
 
		
	}

}
