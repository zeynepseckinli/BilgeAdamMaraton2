package com.zeynep.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_computer_spec")
public class ComputerSpec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String gpu;
    String cpu;
    String ram;
    String storage;
    Long computerId;
    String monitor;
    @Embedded
    BaseEntity baseEntity;
}
