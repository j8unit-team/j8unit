package org.j8unit.repository.javax.xml.bind.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValidationEventCollectorTest
implements org.j8unit.repository.javax.xml.bind.util.ValidationEventCollectorTests<javax.xml.bind.util.ValidationEventCollector> {

    @Override
    public javax.xml.bind.util.ValidationEventCollector createNewSUT() {
        return new javax.xml.bind.util.ValidationEventCollector();
    }

}
