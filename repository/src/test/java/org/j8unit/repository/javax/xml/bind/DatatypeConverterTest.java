package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatatypeConverterTest
implements org.j8unit.repository.javax.xml.bind.DatatypeConverterTests<javax.xml.bind.DatatypeConverter> {

    @Override
    public javax.xml.bind.DatatypeConverter createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.bind.DatatypeConverter] available.");
    }

}
