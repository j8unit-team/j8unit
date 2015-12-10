package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FlavorExceptionClassTest
implements org.j8unit.repository.javax.print.FlavorExceptionClassTests<javax.print.FlavorException> {

    @Override
    public Class<javax.print.FlavorException> createNewSUT() {
        return javax.print.FlavorException.class;
    }

}
