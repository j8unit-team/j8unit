package org.j8unit.repository.javax.xml;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLConstantsTest
implements org.j8unit.repository.javax.xml.XMLConstantsTests<javax.xml.XMLConstants> {

    @Override
    public javax.xml.XMLConstants createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.XMLConstants] available.");
    }

}
