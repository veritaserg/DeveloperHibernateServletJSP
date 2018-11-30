package controller.developer;

import model.Developer;
import service.DeveloperService;

import javax.servlet.ServletException;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.List;


public class ListDevelopersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DeveloperService developerService = new DeveloperService();
        List<Developer> developers = developerService.getAll();


          req.setAttribute("developers", developers);

        req.getRequestDispatcher("WEB-INF/pages/list-developers.jsp").forward(req, resp);
    }
}