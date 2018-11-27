package service;

import dao.hibernate.HibernateDeveloperDAOImpl;
import model.Developer;

import java.util.List;

public class DeveloperService {
    HibernateDeveloperDAOImpl hibernateDeveloperDAO;
    public DeveloperService(){
       hibernateDeveloperDAO = new HibernateDeveloperDAOImpl();
    }
    public void create(Developer developer){
        hibernateDeveloperDAO.create(developer);
    }

    public List<Developer> getAll(){
       return hibernateDeveloperDAO.getAll();
    }
}
