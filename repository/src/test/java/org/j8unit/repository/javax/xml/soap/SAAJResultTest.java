package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAAJResultTest
implements org.j8unit.repository.javax.xml.soap.SAAJResultTests<javax.xml.soap.SAAJResult> {

    @Override
    public javax.xml.soap.SAAJResult createNewSUT() {
        try {
            return new javax.xml.soap.SAAJResult();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
