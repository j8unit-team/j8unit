package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectReferenceTemplateSeqHolder} (by
 * simply reusing the J8Unit test interface {@link ObjectReferenceTemplateSeqHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ObjectReferenceTemplateSeqHolderClassTest
implements ObjectReferenceTemplateSeqHolderClassTests<ObjectReferenceTemplateSeqHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder]

    @Override
    public Class<ObjectReferenceTemplateSeqHolder> createNewSUT() {
        return ObjectReferenceTemplateSeqHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder#ObjectReferenceTemplateSeqHolder(org.omg.PortableInterceptor.ObjectReferenceTemplate[])
     * public
     * org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder(org.omg.PortableInterceptor.ObjectReferenceTemplate[])}.
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
    public void create_ObjectReferenceTemplateSeqHolder_ObjectReferenceTemplateArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectReferenceTemplateSeqHolder sut = null; // = new
                                                           // ObjectReferenceTemplateSeqHolder(org.omg.PortableInterceptor.ObjectReferenceTemplate[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder#ObjectReferenceTemplateSeqHolder() public
     * org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder()}.
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
    public void create_ObjectReferenceTemplateSeqHolder()
    throws Exception {
        // create new instance
        final ObjectReferenceTemplateSeqHolder sut = new ObjectReferenceTemplateSeqHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder]

}
