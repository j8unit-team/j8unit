package org.j8unit.repository.javax.xml.transform;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransformerExceptionClassTest
implements org.j8unit.repository.javax.xml.transform.TransformerExceptionClassTests<javax.xml.transform.TransformerException> {

    @Override
    public Class<javax.xml.transform.TransformerException> createNewSUT() {
        return javax.xml.transform.TransformerException.class;
    }

}
