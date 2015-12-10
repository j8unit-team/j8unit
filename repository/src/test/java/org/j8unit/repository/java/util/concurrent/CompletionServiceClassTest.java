package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class CompletionServiceClassTest
implements org.j8unit.repository.java.util.concurrent.CompletionServiceClassTests<java.util.concurrent.CompletionService> {

    @Override
    public Class<java.util.concurrent.CompletionService> createNewSUT() {
        return java.util.concurrent.CompletionService.class;
    }

}
