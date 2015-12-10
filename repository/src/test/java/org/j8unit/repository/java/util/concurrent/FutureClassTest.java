package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class FutureClassTest
implements org.j8unit.repository.java.util.concurrent.FutureClassTests<java.util.concurrent.Future> {

    @Override
    public Class<java.util.concurrent.Future> createNewSUT() {
        return java.util.concurrent.Future.class;
    }

}
