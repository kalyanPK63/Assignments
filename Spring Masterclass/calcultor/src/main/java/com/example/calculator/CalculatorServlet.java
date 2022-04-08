package com.example.calculator;

import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

//        int p = Integer.parseInt(request.getParameter("p"));
//        int t = Integer.parseInt(request.getParameter("t"));
//        int r = Integer.parseInt(request.getParameter("r"));
//
//        double SimpleInterest = (p*(t*12)*(0.01*r))/100;
//
////        response.getWriter().println("Interest = "+SimpleInterest);
//        request.setAttribute("SimpleInterest", SimpleInterest);
        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request,response);
    }

}