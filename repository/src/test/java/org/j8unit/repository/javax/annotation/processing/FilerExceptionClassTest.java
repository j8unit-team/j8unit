package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilerExceptionClassTest
implements org.j8unit.repository.javax.annotation.processing.FilerExceptionClassTests<javax.annotation.processing.FilerException> {

    @Override
    public Class<javax.annotation.processing.FilerException> createNewSUT() {
        return javax.annotation.processing.FilerException.class;
    }

}
