package com.cosmo.db.example.controller;

import com.cosmo.db.example.model.TokenModel;
import com.cosmo.db.example.service.AppTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AppTokenController {

    @Autowired
    AppTokenService appTokenService;

    @RequestMapping(value = "/token/create",
            produces = {"application/json"},
            method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<TokenModel> createToken(@RequestBody TokenModel tokenModel)  {
        appTokenService.saveToken(tokenModel);
        return new ResponseEntity<TokenModel>(HttpStatus.OK);
    }

    @RequestMapping(value = "/token/fetch",
            produces = {"application/json"},
            method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<TokenModel> getTokenBySrcId(@RequestParam(value = "srcId", required = true) String srcId)  {
        TokenModel response = appTokenService.getTokenBySrcId(srcId);
        return new ResponseEntity<TokenModel>(response,HttpStatus.OK);
    }
}
