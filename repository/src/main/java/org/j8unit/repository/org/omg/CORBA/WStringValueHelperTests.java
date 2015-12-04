package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.WStringValueHelper class org.omg.CORBA.WStringValueHelper},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA.WStringValueHelperClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface WStringValueHelperTests<SUT extends org.omg.CORBA.WStringValueHelper>
extends org.j8unit.repository.org.omg.CORBA.portable.BoxedValueHelperTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.WStringValueHelper#write_value(org.omg.CORBA.portable.OutputStream,java.io.Serializable) public void org.omg.CORBA.WStringValueHelper.write_value(org.omg.CORBA.portable.OutputStream,java.io.Serializable)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_value_OutputStream_Serializable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.WStringValueHelper#get_id() public java.lang.String org.omg.CORBA.WStringValueHelper.get_id()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_get_id() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.WStringValueHelper#read_value(org.omg.CORBA.portable.InputStream) public java.io.Serializable org.omg.CORBA.WStringValueHelper.read_value(org.omg.CORBA.portable.InputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_read_value_InputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
