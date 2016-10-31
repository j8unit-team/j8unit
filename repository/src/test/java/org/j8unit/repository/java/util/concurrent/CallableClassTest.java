package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Callable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CallableClassTest
implements org.j8unit.repository.java.util.concurrent.CallableClassTests<Callable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Callable]

    @Override
    public Class<Callable> createNewSUT() {
        return Callable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.Callable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Callable]

}
