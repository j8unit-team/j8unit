package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXServiceURLClassTest
implements org.j8unit.repository.javax.management.remote.JMXServiceURLClassTests<javax.management.remote.JMXServiceURL> {

    @Override
    public Class<javax.management.remote.JMXServiceURL> createNewSUT() {
        return javax.management.remote.JMXServiceURL.class;
    }

}
