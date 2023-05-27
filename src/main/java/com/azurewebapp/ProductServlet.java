package com.azurewebapp;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve the list of products from the database
        ProductDAO productDAO = new ProductDAO();
        List<Product> products = productDAO.getAllProducts();

        // Display the products as an HTML table
        out.println("<html>");
        out.println("<head><title>Product List</title></head>");
        out.println("<body>");
        out.println("<h1>Product List</h1>");
        out.println("<table border=\"1\">");
        out.println("<tr><th>Product ID</th><th>Product Name</th><th>Quantity</th></tr>");

        for (Product product : products) {
            out.println("<tr>");
            out.println("<td>" + product.getProductId() + "</td>");
            out.println("<td>" + product.getProductName() + "</td>");
            out.println("<td>" + product.getQuantity() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the submitted data from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Process the data or perform any necessary actions

        // Forward the request to another JSP or servlet
        request.getRequestDispatcher("/another-servlet-or-jsp").forward(request, response);
    }
}
