package org.j8unit.repository.javax.xml.soap;

import static org.junit.Assert.fail;
import javax.xml.soap.MessageFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MessageFactoryClassTest
implements org.j8unit.repository.javax.xml.soap.MessageFactoryClassTests<MessageFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.MessageFactory]

    @Override
    public Class<MessageFactory> createNewSUT() {
        return MessageFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link MessageFactory#MessageFactory() public
     * javax.xml.soap.MessageFactory()}.
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
    public void create_MessageFactory()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link MessageFactory#newInstance(String) public static
     * javax.xml.soap.MessageFactory javax.xml.soap.MessageFactory.newInstance(java.lang.String) throws
     * javax.xml.soap.SOAPException}.
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
    public void test_newInstance_String()
    throws Exception {
        // write some test for {@link MessageFactory#newInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link MessageFactory#newInstance() public static
     * javax.xml.soap.MessageFactory javax.xml.soap.MessageFactory.newInstance() throws javax.xml.soap.SOAPException}.
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
    public void test_newInstance()
    throws Exception {
        // write some test for {@link MessageFactory#newInstance()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.MessageFactory]

}
