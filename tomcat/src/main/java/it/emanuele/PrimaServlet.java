package it.emanuele;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimaServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        Writer w = resp.getWriter();
        
        w.write("<!DOCTYPE html>\r\n"
        		+ "<html>\r\n"
        		+ "<head>\r\n"
        		+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
        		+ "<style>\r\n"
        		+ "body {\r\n"
        		+ "  margin: 0;\r\n"
        		+ "  font-family: Arial, Helvetica, sans-serif;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".topnav {\r\n"
        		+ "  position: relative;\r\n"
        		+ "  overflow: hidden;\r\n"
        		+ "  background-color: #333;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".topnav a {\r\n"
        		+ "  float: left;\r\n"
        		+ "  color: #f2f2f2;\r\n"
        		+ "  text-align: center;\r\n"
        		+ "  padding: 14px 16px;\r\n"
        		+ "  text-decoration: none;\r\n"
        		+ "  font-size: 17px;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".topnav a:hover {\r\n"
        		+ "  background-color: #ddd;\r\n"
        		+ "  color: black;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".topnav a.active {\r\n"
        		+ "  background-color: #04AA6D;\r\n"
        		+ "  color: white;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".topnav-centered a {\r\n"
        		+ "  float: none;\r\n"
        		+ "  position: absolute;\r\n"
        		+ "  top: 50%;\r\n"
        		+ "  left: 50%;\r\n"
        		+ "  transform: translate(-50%, -50%);\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ ".topnav-right {\r\n"
        		+ "  float: right;\r\n"
        		+ "}\r\n"
        		+ "\r\n"
        		+ "/* Responsive navigation menu (for mobile devices) */\r\n"
        		+ "@media screen and (max-width: 600px) {\r\n"
        		+ "  .topnav a, .topnav-right {\r\n"
        		+ "    float: none;\r\n"
        		+ "    display: block;\r\n"
        		+ "  }\r\n"
        		+ "  \r\n"
        		+ "  .topnav-centered a {\r\n"
        		+ "    position: relative;\r\n"
        		+ "    top: 0;\r\n"
        		+ "    left: 0;\r\n"
        		+ "    transform: none;\r\n"
        		+ "  }\r\n"
        		+ "}\r\n"
        		+ "</style>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "\r\n"
        		+ "<!-- Top navigation -->\r\n"
        		+ "<div class=\"topnav\">\r\n"
        		+ "\r\n"
        		+ "  <!-- Centered link -->\r\n"
        		+ "  <div class=\"topnav-centered\">\r\n"
        		+ "    <a href=\"#home\" class=\"active\">Home</a>\r\n"
        		+ "  </div>\r\n"
        		+ "  \r\n"
        		+ "  <!-- Left-aligned links (default) -->\r\n"
        		+ "  <a href=\"#news\">News</a>\r\n"
        		+ "  <a href=\"#contact\">Contact</a>\r\n"
        		+ "  \r\n"
        		+ "  <!-- Right-aligned links -->\r\n"
        		+ "  <div class=\"topnav-right\">\r\n"
        		+ "    <a href=\"#search\">Search</a>\r\n"
        		+ "    <a href=\"#about\">About</a>\r\n"
        		+ "  </div>\r\n"
        		+ "  \r\n"
        		+ "</div>\r\n"
        		+ "\r\n"
        		+ "<div style=\"padding-left:16px\">\r\n"
        		+ "  <h2>Responsive Top Navigation with Centered and Right-Aligned Links</h2>\r\n"
        		+ "  <p>Resize the browser window to see the responsive effect.</p>\r\n"
        		+ "</div>\r\n"
        		+ "\r\n"
        		+ "</body>\r\n"
        		+ "</html>\r\n"
        		+ "");
        w.flush();
        w.close();
    }
	
	
}
