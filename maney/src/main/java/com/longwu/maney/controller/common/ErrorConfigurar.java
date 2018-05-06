package com.longwu.maney.controller.common;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErrorConfigurar implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage[] errorPages=new ErrorPage[3];
        errorPages[0]=new ErrorPage(HttpStatus.UNAUTHORIZED,"/error/401");
        errorPages[1]=new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error/500");
        errorPages[2]=new ErrorPage(HttpStatus.NOT_FOUND,"/error/404");
        registry.addErrorPages(errorPages);
    }
}
