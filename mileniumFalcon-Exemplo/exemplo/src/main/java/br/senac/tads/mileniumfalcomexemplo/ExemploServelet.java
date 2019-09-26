package br.senac.tads.mileniumfalcomexemplo;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author victor.salves5
 */
@WebServlet(name = "ExemploServlet", urlPatterns = "/exemplo-servlet")
public class ExemploServelet extends HttpServlet{

@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
response.setContentType("text/html");

System.out.println("Test");

try (PrintWriter out = response.getWriter()){
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println(" <title>Start Page</title>");
out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
out.println("</head>");
out.println("<body>");
out.println("<h1>Hello World!</h1>");
DateFormat formater = new SimpleDateFormat("DD/MM/yyyy HH:mm>ss");
Date dataAcesso = new Date();
out.println("<p>Data e hora de acesso: "+ formater.format(dataAcesso));
out.println(" </body>");
out.println("</html>");

}


}

    
    
}
