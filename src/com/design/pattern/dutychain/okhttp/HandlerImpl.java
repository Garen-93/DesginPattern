package com.design.pattern.dutychain.okhttp;

import java.util.List;

public class HandlerImpl implements InterfaceHandler {

    private int index;


    @Override
    public Reponse handle(Request request, List<Interceptor> interceptors, int index) {
        Reponse handle;
        this.index = index;
        if (index < interceptors.size()) {
            Interceptor interceptor = interceptors.get(index);
            Reponse chain = interceptor.chain(request);
            HandlerImpl handler = new HandlerImpl();
            handle = handler.handle(request, interceptors, index + 1);
        } else {
            handle = handle(request, interceptors, index);
        }
        return handle;
    }
}
