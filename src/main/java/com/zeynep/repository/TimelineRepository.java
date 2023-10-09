package com.zeynep.repository;

import com.zeynep.repository.entity.Timeline;
import com.zeynep.utility.HibernateUtility;
import com.zeynep.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class TimelineRepository extends MyFactoryRepository<Timeline,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public TimelineRepository() {
        super(new Timeline());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();

    }
}
