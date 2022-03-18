package com.cosmo.db.example.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.cosmo.db.example.model.entity.TokenEntity;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface AppTokenRepository extends ReactiveCosmosRepository<TokenEntity, String> {
    Mono<TokenEntity> findBySrcId(String srcId);
}
