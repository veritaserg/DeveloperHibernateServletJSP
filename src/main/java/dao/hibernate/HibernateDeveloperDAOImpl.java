package dao.hibernate;

import dao.AbstractDao;
import dao.DeveloperDAO;
import model.Account;
import model.Developer;
import model.Skill;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HibernateDeveloperDAOImpl extends AbstractDao<Developer> implements DeveloperDAO {
    public HibernateDeveloperDAOImpl() {
        super.settClass(Developer.class);
    }

    @Override
    public void create(Developer developer) {
        createAbstract(developer);
    }

    @Override
    public Developer getById(Long developerId) {
        return getByIdAbstract(developerId);
    }

    @Override
    public void update(Developer developer) {
        updateAbstract(developer);
    }

    @Override
    public void delete(Long developerId) {
        deleteAbstract(developerId);
    }

    @Override
    public List<Developer> getAll() {
        return getAllAbstract();

    }
}