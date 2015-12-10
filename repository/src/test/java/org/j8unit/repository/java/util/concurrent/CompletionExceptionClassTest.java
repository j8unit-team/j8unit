package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionExceptionClassTest
implements org.j8unit.repository.java.util.concurrent.CompletionExceptionClassTests<java.util.concurrent.CompletionException> {

    @Override
    public Class<java.util.concurrent.CompletionException> createNewSUT() {
        return java.util.concurrent.CompletionException.class;
    }

}
