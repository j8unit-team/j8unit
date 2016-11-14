package org.j8unit.repository.org.omg.CosNaming;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingIteratorPOA;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BindingIteratorPOA} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.BindingIteratorPOAClassTests}).
 */

@RunWith(J8Unit4.class)
public class BindingIteratorPOAClassTest
implements BindingIteratorPOAClassTests<BindingIteratorPOA> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.BindingIteratorPOA]

    @Override
    public Class<BindingIteratorPOA> createNewSUT() {
        return BindingIteratorPOA.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.BindingIteratorPOA#BindingIteratorPOA() public org.omg.CosNaming.BindingIteratorPOA()}.
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
    public void create_BindingIteratorPOA()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.BindingIteratorPOA]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.BindingIteratorPOA]

}
