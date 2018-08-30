import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Servlet extends HttpServlet  implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		public void doGet(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException,IOException 
				{ 
				PrintWriter pw=res.getWriter(); 
				res.setContentType("text/html"); 
				pw.println("<html>"); 
				pw.println("<body>"); 
				pw.println("Servername:"+req.getServerName()+"<br>"); 
				pw.println("Addr:"+req.getRemoteAddr()+"<br>"); 
				pw.println("User:"+req.getRemoteUser()+"<br>"); 
				pw.println("Port no:"+req.getServerPort()+"<br>"); 
				pw.println("Servletname:"+this.getServletName()+"<br>"); 
				pw.println("</body>"); 
				pw.println("</html>"); 
				} 

	}

}
