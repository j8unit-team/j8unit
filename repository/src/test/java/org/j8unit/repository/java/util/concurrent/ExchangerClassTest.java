package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ExchangerClassTest
implements org.j8unit.repository.java.util.concurrent.ExchangerClassTests<java.util.concurrent.Exchanger> {

    @Override
    public Class<java.util.concurrent.Exchanger> createNewSUT() {
        return java.util.concurrent.Exchanger.class;
    }

}