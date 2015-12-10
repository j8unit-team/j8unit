package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ForkJoinTaskClassTest
implements org.j8unit.repository.java.util.concurrent.ForkJoinTaskClassTests<java.util.concurrent.ForkJoinTask> {

    @Override
    public Class<java.util.concurrent.ForkJoinTask> createNewSUT() {
        return java.util.concurrent.ForkJoinTask.class;
    }

}
