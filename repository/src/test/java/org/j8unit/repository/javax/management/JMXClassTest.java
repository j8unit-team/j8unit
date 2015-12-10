package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXClassTest
implements org.j8unit.repository.javax.management.JMXClassTests<javax.management.JMX> {

    @Override
    public Class<javax.management.JMX> createNewSUT() {
        return javax.management.JMX.class;
    }

}
