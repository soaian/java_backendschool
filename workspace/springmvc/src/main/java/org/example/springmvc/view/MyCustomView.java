package org.example.springmvc.view;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.View;

import java.io.PrintWriter;
import java.util.Map;



public class MyCustomView implements View {
    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType(getContentType());
        PrintWriter out = response.getWriter(); // 통로를 얻어옴
        out.println("<html><body>");
        out.println("<h1>Custom View Content</h1>");
        out.println("<p>my custom view haha </p>");
        out.println("</body></html>");

        out.println();
    }
}
