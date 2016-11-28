package org.j8unit.repository.javax.naming;

import static org.junit.Assert.fail;
import javax.naming.NamingSecurityException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamingSecurityException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.naming.NamingSecurityExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class NamingSecurityExceptionClassTest
implements NamingSecurityExceptionClassTests<NamingSecurityException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.NamingSecurityException]

    @Override
    public Class<NamingSecurityException> createNewSUT() {
        return NamingSecurityException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NamingSecurityException#NamingSecurityException(String) public
     * javax.naming.NamingSecurityException(java.lang.String)}.
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
    public void create_NamingSecurityException_String()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.NamingSecurityException#NamingSecurityException() public
     * javax.naming.NamingSecurityException()}.
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
    public void create_NamingSecurityException()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.NamingSecurityException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.NamingSecurityException]

}
