package org.j8unit.repository.java.net;

import java.net.ProxySelector;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProxySelectorTest
implements org.j8unit.repository.java.net.ProxySelectorTests<ProxySelector> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.ProxySelector]

    @Override
    public ProxySelector createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.ProxySelector], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.ProxySelector]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.ProxySelector]

}
