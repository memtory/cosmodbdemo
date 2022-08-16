package com.cosmo.db.example.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.cosmo.db.example.model.entity.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppTokenRepository extends JpaRepository<TokenEntity, String> {
    List<TokenEntity> findAll();
}
