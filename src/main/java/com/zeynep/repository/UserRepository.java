package com.zeynep.repository;

import com.zeynep.repository.entity.User;
import com.zeynep.utility.HibernateUtility;
import com.zeynep.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Optional;

public class UserRepository extends MyFactoryRepository<User,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public UserRepository() {
        super(new User());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }

    public Optional<User> kullaniciAdinaGoreKullaniciBul(String username) {
        User user= null;
        CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
        Root<User> root = criteriaQuery.from(User.class);
        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("username"),username));
        try {
            user = entityManager.createQuery(criteriaQuery).getSingleResult();
        } catch (Exception e){
            System.out.println(e.toString());
        }
        return Optional.ofNullable(user);
    }
}
