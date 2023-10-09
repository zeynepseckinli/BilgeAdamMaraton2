package com.zeynep.repository;

import com.zeynep.repository.entity.Photo;
import com.zeynep.utility.HibernateUtility;
import com.zeynep.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class PhotoRepository extends MyFactoryRepository<Photo,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;


    public PhotoRepository() {
        super(new Photo());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
