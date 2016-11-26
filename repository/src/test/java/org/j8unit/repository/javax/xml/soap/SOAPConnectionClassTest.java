package org.j8unit.repository.javax.xml.soap;

import static org.junit.Assert.fail;
import javax.xml.soap.SOAPConnection;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPConnection} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPConnectionClassTests}).
 */
@RunWith(J8Unit4.class)
public class SOAPConnectionClassTest
implements SOAPConnectionClassTests<SOAPConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPConnection]

    @Override
    public Class<SOAPConnection> createNewSUT() {
        return SOAPConnection.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.xml.soap.SOAPConnection#SOAPConnection()
     * public javax.xml.soap.SOAPConnection()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_SOAPConnection()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPConnection]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPConnection]

}
