package org.j8unit.repository.javax.management;

import javax.management.InstanceNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstanceNotFoundExceptionClassTest
implements org.j8unit.repository.javax.management.InstanceNotFoundExceptionClassTests<InstanceNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.InstanceNotFoundException]

    @Override
    public Class<InstanceNotFoundException> createNewSUT() {
        return InstanceNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.InstanceNotFoundException#InstanceNotFoundException() public
     * javax.management.InstanceNotFoundException()}.
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
    public void create_InstanceNotFoundException()
    throws Exception {
        // create new instance
        final InstanceNotFoundException sut = new InstanceNotFoundException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.InstanceNotFoundException#InstanceNotFoundException(String) public
     * javax.management.InstanceNotFoundException(java.lang.String)}.
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
    public void create_InstanceNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InstanceNotFoundException sut = null; // = new InstanceNotFoundException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.InstanceNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.InstanceNotFoundException]

}
