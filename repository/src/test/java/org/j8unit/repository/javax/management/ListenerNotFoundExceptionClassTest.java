package org.j8unit.repository.javax.management;

import javax.management.ListenerNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ListenerNotFoundException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.ListenerNotFoundExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class ListenerNotFoundExceptionClassTest
implements ListenerNotFoundExceptionClassTests<ListenerNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.ListenerNotFoundException]

    @Override
    public Class<ListenerNotFoundException> createNewSUT() {
        return ListenerNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.ListenerNotFoundException#ListenerNotFoundException() public
     * javax.management.ListenerNotFoundException()}.
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
    public void create_ListenerNotFoundException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ListenerNotFoundException sut = new ListenerNotFoundException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.ListenerNotFoundException#ListenerNotFoundException(String) public
     * javax.management.ListenerNotFoundException(java.lang.String)}.
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
    public void create_ListenerNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ListenerNotFoundException sut = null; // = new ListenerNotFoundException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.ListenerNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.ListenerNotFoundException]

}
