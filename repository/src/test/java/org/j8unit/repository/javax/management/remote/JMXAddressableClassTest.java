package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXAddressableClassTest
implements org.j8unit.repository.javax.management.remote.JMXAddressableClassTests<javax.management.remote.JMXAddressable> {

    @Override
    public Class<javax.management.remote.JMXAddressable> createNewSUT() {
        return javax.management.remote.JMXAddressable.class;
    }

}
