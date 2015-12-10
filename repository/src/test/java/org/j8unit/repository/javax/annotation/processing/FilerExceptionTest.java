package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilerExceptionTest
implements org.j8unit.repository.javax.annotation.processing.FilerExceptionTests<javax.annotation.processing.FilerException> {

    @Override
    public javax.annotation.processing.FilerException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.annotation.processing.FilerException] available.");
    }

}
