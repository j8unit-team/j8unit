package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExchangerTest<V>
implements org.j8unit.repository.java.util.concurrent.ExchangerTests<java.util.concurrent.Exchanger<V>, V> {

    @Override
    public java.util.concurrent.Exchanger<V> createNewSUT() {
        return new java.util.concurrent.Exchanger();
    }

}
