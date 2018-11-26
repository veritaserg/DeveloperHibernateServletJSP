package controller.developer;

import model.Developer;
import org.springframework.stereotype.Controller;
import service.DeveloperService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class CreateDeveloperServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/add-developer.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DeveloperService developerService = new DeveloperService();
        Developer developer = new Developer();
        developer.setFirstName(req.getParameter("developerFirstName"));
        developer.setLastName(req.getParameter("developerLastName"));
        developer.setSpecialty(req.getParameter("developerSpecialty"));

        developerService.create(developer);
        resp.sendRedirect("/WEB-INF/pages/list-developers");
    }
}
