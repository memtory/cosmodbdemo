package com.cosmo.db.example.model.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "TOKENS")
public class TokenEntity {

    @Id
    private String id;

//    @PartitionKey
    @Column(name = "emailId")
    private String emailId;

    @Column(name = "srcId")
    private String srcId;

    @Column(name = "token")
    private String token;

    public TokenEntity() {

    }

    public TokenEntity(String id, String emailId, String srcId, String token) {
        this.id = id;
        this.emailId = emailId;
        this.srcId = srcId;
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getSrcId() {
        return srcId;
    }

    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
