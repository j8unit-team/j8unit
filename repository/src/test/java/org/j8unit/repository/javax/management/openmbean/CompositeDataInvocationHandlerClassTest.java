package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.CompositeData;
import javax.management.openmbean.CompositeDataInvocationHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeDataInvocationHandlerClassTest
implements org.j8unit.repository.javax.management.openmbean.CompositeDataInvocationHandlerClassTests<CompositeDataInvocationHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.CompositeDataInvocationHandler]

    @Override
    public Class<CompositeDataInvocationHandler> createNewSUT() {
        return CompositeDataInvocationHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link CompositeDataInvocationHandler#CompositeDataInvocationHandler(CompositeData) public
     * javax.management.openmbean.CompositeDataInvocationHandler(javax.management.openmbean.CompositeData)}.
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
    public void create_CompositeDataInvocationHandler_CompositeData()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CompositeDataInvocationHandler sut = null; // = new CompositeDataInvocationHandler(CompositeData);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.CompositeDataInvocationHandler]

}
