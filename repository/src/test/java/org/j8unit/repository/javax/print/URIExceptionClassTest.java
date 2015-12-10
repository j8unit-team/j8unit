package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URIExceptionClassTest
implements org.j8unit.repository.javax.print.URIExceptionClassTests<javax.print.URIException> {

    @Override
    public Class<javax.print.URIException> createNewSUT() {
        return javax.print.URIException.class;
    }

}
