package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ExecutorCompletionServiceClassTest
implements org.j8unit.repository.java.util.concurrent.ExecutorCompletionServiceClassTests<java.util.concurrent.ExecutorCompletionService> {

    @Override
    public Class<java.util.concurrent.ExecutorCompletionService> createNewSUT() {
        return java.util.concurrent.ExecutorCompletionService.class;
    }

}
