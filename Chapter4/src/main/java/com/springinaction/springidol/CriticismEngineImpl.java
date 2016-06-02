package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * Created by seed on 2016. 6. 2..
 */
@Component
public class CriticismEngineImpl implements CriticismEngine {
    public CriticismEngineImpl() {}

    @Override
    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }

    private String[] criticismPool;

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
