package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class FutureTaskClassTest
implements org.j8unit.repository.java.util.concurrent.FutureTaskClassTests<java.util.concurrent.FutureTask> {

    @Override
    public Class<java.util.concurrent.FutureTask> createNewSUT() {
        return java.util.concurrent.FutureTask.class;
    }

}