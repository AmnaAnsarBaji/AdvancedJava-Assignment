
/*8a. Build a servlet program to create a cookie to get your name through text box and press submit button(
through HTML) to display the message by greeting Welcome back your name ! , you have visited this page
n times ( n = number of your visit ) along with the list of cookies and demonstrate the expiry of cookie also.*/
package com.cookiee;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")

public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");

        int count = 1;

        Cookie cookies[] = request.getCookies();

        if(cookies != null)
        {
            for(Cookie c : cookies)
            {
                if(c.getName().equals("count"))
                {
                    count =
                    Integer.parseInt(c.getValue()) + 1;
                }

                if(c.getName().equals("user"))
                {
                    name = c.getValue();
                }
            }
        }

        Cookie c1 = new Cookie("user", name);
        c1.setMaxAge(60);
        response.addCookie(c1);

        Cookie c2 =
        new Cookie("count", String.valueOf(count));

        c2.setMaxAge(60);
        response.addCookie(c2);

        out.println("<html><body>");

        out.println("<h2>Welcome back "
        + name + " !</h2>");

        out.println("<h3>You have visited this page "
        + count + " times</h3>");

        out.println("<h3>Cookie List</h3>");

        if(cookies != null)
        {
            for(Cookie c : cookies)
            {
                out.println("Cookie Name : "
                + c.getName() + "<br>");

                out.println("Cookie Value : "
                + c.getValue() + "<br><br>");
            }
        }

        out.println("Cookie expiry time = 60 sec");

        out.println("<br><br>");

        out.println("<a href='index.html'>Visit Again</a>");

        out.println("</body></html>");
    }
}
