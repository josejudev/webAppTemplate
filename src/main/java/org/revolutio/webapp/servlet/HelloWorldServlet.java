package org.revolutio.webapp.servlet;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello-world")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, SecurityException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"utf-8\" />");
        out.print("<title>Hola Mundo desde Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Hola Mundo desde Servlet</h1>");
        out.print("</body>");
        out.print("</html>");
        out.close();



    }
}

