package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class RecursiveTaskClassTest
implements org.j8unit.repository.java.util.concurrent.RecursiveTaskClassTests<java.util.concurrent.RecursiveTask> {

    @Override
    public Class<java.util.concurrent.RecursiveTask> createNewSUT() {
        return java.util.concurrent.RecursiveTask.class;
    }

}
