package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeErrorExceptionClassTest
implements org.j8unit.repository.javax.management.RuntimeErrorExceptionClassTests<javax.management.RuntimeErrorException> {

    @Override
    public Class<javax.management.RuntimeErrorException> createNewSUT() {
        return javax.management.RuntimeErrorException.class;
    }

}
