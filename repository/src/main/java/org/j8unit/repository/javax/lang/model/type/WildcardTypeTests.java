package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.type.WildcardType interface
 * javax.lang.model.type.WildcardType}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link WildcardTypeClassTests}.
 * </p>
 *
 * @see javax.lang.model.type.WildcardType interface javax.lang.model.type.WildcardType (the hereby targeted
 *      class-under-test class)
 * @see WildcardTypeClassTests WildcardTypeClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WildcardTypeTests<SUT extends javax.lang.model.type.WildcardType>
extends TypeMirrorTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.WildcardType#getExtendsBound() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.type.WildcardType.getExtendsBound()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.WildcardType#getExtendsBound() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.type.WildcardType.getExtendsBound()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.WildcardType#getExtendsBound() public abstract javax.lang.model.type.TypeMirror
     *      javax.lang.model.type.WildcardType.getExtendsBound() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExtendsBound()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.WildcardType#getSuperBound() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.type.WildcardType.getSuperBound()}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.WildcardType#getSuperBound() public abstract
     * javax.lang.model.type.TypeMirror javax.lang.model.type.WildcardType.getSuperBound()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.WildcardType#getSuperBound() public abstract javax.lang.model.type.TypeMirror
     *      javax.lang.model.type.WildcardType.getSuperBound() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSuperBound()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
