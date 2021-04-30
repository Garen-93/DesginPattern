package com.design.pattern.dutychain.okhttp;

public abstract class Interceptor {

    abstract Reponse chain(Request request);
}
