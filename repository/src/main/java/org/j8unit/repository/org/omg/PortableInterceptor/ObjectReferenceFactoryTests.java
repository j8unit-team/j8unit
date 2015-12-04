package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.ObjectReferenceFactory interface
 * org.omg.PortableInterceptor.ObjectReferenceFactory}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceFactoryClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectReferenceFactoryTests<SUT extends org.omg.PortableInterceptor.ObjectReferenceFactory>
extends org.j8unit.repository.org.omg.CORBA.portable.ValueBaseTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceFactory#make_object(java.lang.String,byte[])
     * public abstract org.omg.CORBA.Object
     * org.omg.PortableInterceptor.ObjectReferenceFactory.make_object(java.lang.String,byte[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_make_object_String_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
