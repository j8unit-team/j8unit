package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder class
 * org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectReferenceTemplateSeqHolderTests<SUT extends org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder>
extends org.j8unit.repository.org.omg.CORBA.portable.StreamableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder#_read(org.omg.CORBA.portable.InputStream)
     * public void
     * org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder._read(org.omg.CORBA.portable.InputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__read_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder#_type() public
     * org.omg.CORBA.TypeCode org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder._type()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__type()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder#_write(org.omg.CORBA.portable.OutputStream)
     * public void
     * org.omg.PortableInterceptor.ObjectReferenceTemplateSeqHolder._write(org.omg.CORBA.portable.OutputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test__write_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
