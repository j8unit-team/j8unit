package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class CallableClassTest
implements org.j8unit.repository.java.util.concurrent.CallableClassTests<java.util.concurrent.Callable> {

    @Override
    public Class<java.util.concurrent.Callable> createNewSUT() {
        return java.util.concurrent.Callable.class;
    }

}
