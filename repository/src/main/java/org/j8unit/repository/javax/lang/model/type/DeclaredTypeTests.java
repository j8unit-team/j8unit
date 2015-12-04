package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.type.DeclaredType interface javax.lang.model.type.DeclaredType}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.type.DeclaredTypeClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DeclaredTypeTests<SUT extends javax.lang.model.type.DeclaredType>
extends org.j8unit.repository.javax.lang.model.type.ReferenceTypeTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.DeclaredType#asElement() public abstract
     * javax.lang.model.element.Element javax.lang.model.type.DeclaredType.asElement()}.
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

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.DeclaredType#getEnclosingType() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.type.DeclaredType.getEnclosingType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEnclosingType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.DeclaredType#getTypeArguments() public abstract java.util.List
     * javax.lang.model.type.DeclaredType.getTypeArguments()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTypeArguments()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
