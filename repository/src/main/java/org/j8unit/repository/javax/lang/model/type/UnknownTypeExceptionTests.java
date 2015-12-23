package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.lang.model.type.UnknownTypeException class
 * javax.lang.model.type.UnknownTypeException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.lang.model.type.UnknownTypeExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.lang.model.type.UnknownTypeExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.lang.model.type.UnknownTypeException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnknownTypeExceptionTests<SUT extends javax.lang.model.type.UnknownTypeException>
extends org.j8unit.repository.javax.lang.model.UnknownEntityExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.UnknownTypeException#getArgument() public java.lang.Object
     * javax.lang.model.type.UnknownTypeException.getArgument()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.type.UnknownTypeException#getArgument()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getArgument()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.UnknownTypeException#getUnknownType() public
     * javax.lang.model.type.TypeMirror javax.lang.model.type.UnknownTypeException.getUnknownType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.lang.model.type.UnknownTypeException#getUnknownType()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnknownType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
