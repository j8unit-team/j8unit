package org.j8unit.repository.javax.naming.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.naming.spi.DirObjectFactory interface javax.naming.spi.DirObjectFactory}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.naming.spi.DirObjectFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DirObjectFactoryTests<SUT extends javax.naming.spi.DirObjectFactory>
extends org.j8unit.repository.javax.naming.spi.ObjectFactoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.DirObjectFactory#getObjectInstance(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable,javax.naming.directory.Attributes)
     * public abstract java.lang.Object
     * javax.naming.spi.DirObjectFactory.getObjectInstance(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable,javax.naming.directory.Attributes)
     * throws java.lang.Exception}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjectInstance_Object_Name_Context_Hashtable_Attributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
