package org.j8unit.repository.javax.management.remote.rmi;

import java.util.Map;
import javax.management.remote.JMXServiceURL;
import javax.management.remote.rmi.RMIConnector;
import javax.management.remote.rmi.RMIServer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIConnectorClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIConnectorClassTests<RMIConnector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi.RMIConnector]

    @Override
    public Class<RMIConnector> createNewSUT() {
        return RMIConnector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link RMIConnector#RMIConnector(RMIServer, Map)
     * public
     * javax.management.remote.rmi.RMIConnector(javax.management.remote.rmi.RMIServer,java.util.Map<java.lang.String,
     * ?>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_RMIConnector_RMIServer_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RMIConnector sut = null; // = new RMIConnector(RMIServer, Map);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link RMIConnector#RMIConnector(JMXServiceURL, Map)
     * public
     * javax.management.remote.rmi.RMIConnector(javax.management.remote.JMXServiceURL,java.util.Map<java.lang.String,
     * ?>)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_RMIConnector_JMXServiceURL_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RMIConnector sut = null; // = new RMIConnector(JMXServiceURL, Map);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi.RMIConnector]

}
