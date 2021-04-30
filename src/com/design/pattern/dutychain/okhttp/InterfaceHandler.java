package com.design.pattern.dutychain.okhttp;

import java.util.List;

public interface InterfaceHandler {
    public Reponse handle(Request request, List<Interceptor> interceptors, int index);
}