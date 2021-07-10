import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculateServlet", value = "/calculate")
public class DiscountCalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("Description");
        float price = Float.parseFloat(request.getParameter("Price"));
        float discountPercent = Float.parseFloat(request.getParameter("Discount"));

        if (discountPercent < 1 && discountPercent > 0 && price >= 2000) {
            float discountAmount = (float) (price * discountPercent * 0.01);

            PrintWriter writer = response.getWriter();
            response.setContentType("text/html");
            writer.println("Product: " + description);
            writer.println("<br/>Price Before: " + price);
            writer.println("<br/>Discount Amount: " + discountAmount);
            writer.println("<br/>Price After: " + (price - discountAmount));
            writer.close();
        } else {
           PrintWriter exceptionWriter = response.getWriter();
           response.setContentType("text/html");
           response.setStatus(404);
           exceptionWriter.println("Product not found!");
        }
    }
}
