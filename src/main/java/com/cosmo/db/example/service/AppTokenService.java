package com.cosmo.db.example.service;

import com.cosmo.db.example.model.TokenModel;
import com.cosmo.db.example.model.entity.TokenEntity;
import com.cosmo.db.example.repository.AppTokenRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class AppTokenService {

    @Autowired
    AppTokenRepository appTokenRepository;

    public TokenModel getTokenBySrcId(String srcId) {
        TokenModel tokenModel =  new TokenModel();
        List<TokenEntity> findBySrcId = appTokenRepository.findAll();
        TokenEntity entity = findBySrcId.get(0);
        tokenModel.setId(entity.getId());
        tokenModel.setEmailId(entity.getEmailId());
        tokenModel.setSrcId(entity.getSrcId());
        tokenModel.setToken(entity.getToken());
        return tokenModel;
    }

    public void saveToken(TokenModel tokenModel) {

        TokenEntity entity = new TokenEntity();
        entity.setId(tokenModel.getId());
        entity.setEmailId(tokenModel.getEmailId());
        entity.setSrcId(tokenModel.getSrcId());
        entity.setToken(tokenModel.getToken());
        appTokenRepository.save(entity);
    }
}
