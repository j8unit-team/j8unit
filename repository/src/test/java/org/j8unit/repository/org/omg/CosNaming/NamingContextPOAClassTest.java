package org.j8unit.repository.org.omg.CosNaming;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPOA;

@RunWith(J8Unit4.class)
public class NamingContextPOAClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextPOAClassTests<NamingContextPOA> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPOA]

    @Override
    public Class<NamingContextPOA> createNewSUT() {
        return NamingContextPOA.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPOA#NamingContextPOA() public org.omg.CosNaming.NamingContextPOA()}.
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
    public void create_NamingContextPOA()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPOA]

}
