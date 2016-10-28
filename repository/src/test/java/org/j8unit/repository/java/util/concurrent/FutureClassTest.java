package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Future;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class FutureClassTest
implements org.j8unit.repository.java.util.concurrent.FutureClassTests<Future> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Future]

    @Override
    public Class<Future> createNewSUT() {
        return Future.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Future]

}
