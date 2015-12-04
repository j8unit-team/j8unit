package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.type.TypeVariable interface javax.lang.model.type.TypeVariable}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.type.TypeVariableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TypeVariableTests<SUT extends javax.lang.model.type.TypeVariable>
extends org.j8unit.repository.javax.lang.model.type.ReferenceTypeTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVariable#getLowerBound() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.type.TypeVariable.getLowerBound()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLowerBound()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVariable#getUpperBound() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.type.TypeVariable.getUpperBound()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUpperBound()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVariable#asElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.type.TypeVariable.asElement()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_asElement()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
