package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.OperatingClass.OperatingClass;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int number1, number2;
        String operator;
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        number1 = Integer.parseInt(request.getParameter("number1"));
        number2 = Integer.parseInt(request.getParameter("number2"));
        operator = request.getParameter("operator");

        OperatingClass oc = new OperatingClass(number1, number2, operator);
        oc.calc();

        out.write("<!DOCTYPE html>");
        out.write("<head><title>calculator</title></head>");
        if (operator.equals("/")) {
            out.write(number1 + " " + operator + " " + number2 + " = " + oc.getResult2());
        } else {
            out.write(number1 + " " + operator + " " + number2 + " = " + oc.getResult1());
        }
    }

}
