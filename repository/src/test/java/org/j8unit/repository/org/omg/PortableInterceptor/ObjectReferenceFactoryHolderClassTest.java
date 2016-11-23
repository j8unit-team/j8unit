package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ObjectReferenceFactoryHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectReferenceFactoryHolder} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceFactoryHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectReferenceFactoryHolderClassTest
implements ObjectReferenceFactoryHolderClassTests<ObjectReferenceFactoryHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceFactoryHolder]

    @Override
    public Class<ObjectReferenceFactoryHolder> createNewSUT() {
        return ObjectReferenceFactoryHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.ObjectReferenceFactoryHolder#ObjectReferenceFactoryHolder(org.omg.PortableInterceptor.ObjectReferenceFactory)
     * public
     * org.omg.PortableInterceptor.ObjectReferenceFactoryHolder(org.omg.PortableInterceptor.ObjectReferenceFactory)}.
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
    public void create_ObjectReferenceFactoryHolder_ObjectReferenceFactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectReferenceFactoryHolder sut = null; // = new
                                                       // ObjectReferenceFactoryHolder(org.omg.PortableInterceptor.ObjectReferenceFactory);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.ObjectReferenceFactoryHolder#ObjectReferenceFactoryHolder() public
     * org.omg.PortableInterceptor.ObjectReferenceFactoryHolder()}.
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
    public void create_ObjectReferenceFactoryHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectReferenceFactoryHolder sut = new ObjectReferenceFactoryHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceFactoryHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceFactoryHolder]

}
