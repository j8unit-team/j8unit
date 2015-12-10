package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatatypeConverterClassTest
implements org.j8unit.repository.javax.xml.bind.DatatypeConverterClassTests<javax.xml.bind.DatatypeConverter> {

    @Override
    public Class<javax.xml.bind.DatatypeConverter> createNewSUT() {
        return javax.xml.bind.DatatypeConverter.class;
    }

}
