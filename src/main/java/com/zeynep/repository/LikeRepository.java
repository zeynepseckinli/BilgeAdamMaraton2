package com.zeynep.repository;

import com.zeynep.repository.entity.Like;
import com.zeynep.utility.HibernateUtility;
import com.zeynep.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class LikeRepository extends MyFactoryRepository<Like,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public LikeRepository() {
        super(new Like());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }

}
