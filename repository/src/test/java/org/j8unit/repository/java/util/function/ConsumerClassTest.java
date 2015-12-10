package org.j8unit.repository.java.util.function;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ConsumerClassTest
implements org.j8unit.repository.java.util.function.ConsumerClassTests<java.util.function.Consumer> {

    @Override
    public Class<java.util.function.Consumer> createNewSUT() {
        return java.util.function.Consumer.class;
    }

}
