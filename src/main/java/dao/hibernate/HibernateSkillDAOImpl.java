package dao.hibernate;

import dao.AbstractDao;
import dao.SkillDAO;
import model.Skill;

import java.util.List;

public class HibernateSkillDAOImpl extends AbstractDao<Skill> implements SkillDAO {

   public HibernateSkillDAOImpl(){
       super.settClass(Skill.class);
   }

    @Override
    public void create(Skill skill) {
createAbstract(skill);
    }

    @Override
    public Skill getById(Long id) {
        return getByIdAbstract(id);
    }

    @Override
    public void update(Skill skill) {
updateAbstract(skill);
    }

    @Override
    public void delete(Long id) {
deleteAbstract(id);
    }

    @Override
    public List<Skill> getAll() {
       return getAllAbstract();
    }
}