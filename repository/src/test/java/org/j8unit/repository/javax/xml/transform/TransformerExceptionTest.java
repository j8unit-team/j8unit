package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformerExceptionTest
implements org.j8unit.repository.javax.xml.transform.TransformerExceptionTests<javax.xml.transform.TransformerException> {

    @Override
    public javax.xml.transform.TransformerException createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.xml.transform.TransformerException] available.");
    }

}
