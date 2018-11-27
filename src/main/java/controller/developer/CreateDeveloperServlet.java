package controller.developer;

import model.Account;
import model.Developer;
import model.Skill;
import service.DeveloperService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class CreateDeveloperServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/pages/add-developer.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DeveloperService developerService = new DeveloperService();
        Developer developer = new Developer();
        Set<Skill> skills = new HashSet<>();
        developer.setId(0L);
        developer.setFirstName(req.getParameter("developerFirstName"));
        developer.setLastName(req.getParameter("developerLastName"));
        developer.setSpecialty(req.getParameter("developerSpecialty"));
Skill skill = new Skill(req.getParameter("developerSkill"));
skills.add(skill);
developer.setSkills(skills);
developer.setAccount(new Account(req.getParameter("developerAccount")));
        developerService.create(developer);
        resp.sendRedirect("index.jsp");

    }
}
