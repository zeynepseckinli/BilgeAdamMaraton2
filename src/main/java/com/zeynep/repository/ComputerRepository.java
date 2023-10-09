package com.zeynep.repository;

import com.zeynep.repository.entity.Computer;
import com.zeynep.utility.HibernateUtility;
import com.zeynep.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

public class ComputerRepository extends MyFactoryRepository<Computer,Long> {
    EntityManager entityManager;
    CriteriaBuilder criteriaBuilder;

    public ComputerRepository() {
        super(new Computer());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }
}
