package com.zeynep.repository;

import com.zeynep.repository.entity.ComputerSpec;
import com.zeynep.utility.HibernateUtility;
import com.zeynep.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class ComputerSpecRepository extends MyFactoryRepository<ComputerSpec,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public ComputerSpecRepository() {
        super(new ComputerSpec());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
