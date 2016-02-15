package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.type.TypeVisitor interface
 * javax.lang.model.type.TypeVisitor}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link TypeVisitorClassTests}.
 * </p>
 *
 * @see javax.lang.model.type.TypeVisitor interface javax.lang.model.type.TypeVisitor (the hereby targeted
 *      class-under-test class)
 * @see TypeVisitorClassTests TypeVisitorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TypeVisitorTests<SUT extends javax.lang.model.type.TypeVisitor<R, P>, R, P>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitNull(javax.lang.model.type.NullType, Object) public
     * abstract R javax.lang.model.type.TypeVisitor.visitNull(javax.lang.model.type.NullType,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitNull(javax.lang.model.type.NullType, Object) public
     * abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitNull(javax.lang.model.type.NullType,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitNull(javax.lang.model.type.NullType, Object) public abstract
     *      java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitNull(javax.lang.model.type.NullType,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitNull_NullType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitUnion(javax.lang.model.type.UnionType, Object)
     * public abstract R javax.lang.model.type.TypeVisitor.visitUnion(javax.lang.model.type.UnionType,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitUnion(javax.lang.model.type.UnionType, Object)
     * public abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitUnion(javax.lang.model.type.UnionType,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitUnion(javax.lang.model.type.UnionType, Object) public abstract
     *      java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitUnion(javax.lang.model.type.UnionType,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitUnion_UnionType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitDeclared(javax.lang.model.type.DeclaredType, Object) public
     * abstract R javax.lang.model.type.TypeVisitor.visitDeclared(javax.lang.model.type.DeclaredType,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitDeclared(javax.lang.model.type.DeclaredType, Object) public
     * abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitDeclared(javax.lang.model.type.DeclaredType,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitDeclared(javax.lang.model.type.DeclaredType, Object) public abstract
     *      java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitDeclared(javax.lang.model.type.DeclaredType,java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitDeclared_DeclaredType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitArray(javax.lang.model.type.ArrayType, Object)
     * public abstract R javax.lang.model.type.TypeVisitor.visitArray(javax.lang.model.type.ArrayType,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitArray(javax.lang.model.type.ArrayType, Object)
     * public abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitArray(javax.lang.model.type.ArrayType,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitArray(javax.lang.model.type.ArrayType, Object) public abstract
     *      java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitArray(javax.lang.model.type.ArrayType,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitArray_ArrayType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitNoType(javax.lang.model.type.NoType, Object) public
     * abstract R javax.lang.model.type.TypeVisitor.visitNoType(javax.lang.model.type.NoType,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitNoType(javax.lang.model.type.NoType, Object) public
     * abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitNoType(javax.lang.model.type.NoType,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitNoType(javax.lang.model.type.NoType, Object) public abstract
     *      java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitNoType(javax.lang.model.type.NoType,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitNoType_NoType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitPrimitive(javax.lang.model.type.PrimitiveType, Object) public
     * abstract R javax.lang.model.type.TypeVisitor.visitPrimitive(javax.lang.model.type.PrimitiveType,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitPrimitive(javax.lang.model.type.PrimitiveType, Object) public
     * abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitPrimitive(javax.lang.model.type.PrimitiveType,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitPrimitive(javax.lang.model.type.PrimitiveType, Object) public
     *      abstract java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitPrimitive(javax.lang.model.type.PrimitiveType,java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitPrimitive_PrimitiveType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitExecutable(javax.lang.model.type.ExecutableType, Object) public
     * abstract R javax.lang.model.type.TypeVisitor.visitExecutable(javax.lang.model.type.ExecutableType,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitExecutable(javax.lang.model.type.ExecutableType, Object) public
     * abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitExecutable(javax.lang.model.type.ExecutableType,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitExecutable(javax.lang.model.type.ExecutableType, Object) public
     *      abstract java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitExecutable(javax.lang.model.type.ExecutableType,java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitExecutable_ExecutableType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitUnknown(javax.lang.model.type.TypeMirror, Object)
     * public abstract R javax.lang.model.type.TypeVisitor.visitUnknown(javax.lang.model.type.TypeMirror,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitUnknown(javax.lang.model.type.TypeMirror, Object)
     * public abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitUnknown(javax.lang.model.type.TypeMirror,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitUnknown(javax.lang.model.type.TypeMirror, Object) public abstract
     *      java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitUnknown(javax.lang.model.type.TypeMirror,java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitUnknown_TypeMirror_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visit(javax.lang.model.type.TypeMirror, Object) public
     * abstract R javax.lang.model.type.TypeVisitor.visit(javax.lang.model.type.TypeMirror,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visit(javax.lang.model.type.TypeMirror, Object) public
     * abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visit(javax.lang.model.type.TypeMirror,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visit(javax.lang.model.type.TypeMirror, Object) public abstract
     *      java.lang.Object javax.lang.model.type.TypeVisitor.visit(javax.lang.model.type.TypeMirror,java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visit_TypeMirror_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visit(javax.lang.model.type.TypeMirror) public abstract
     * R javax.lang.model.type.TypeVisitor.visit(javax.lang.model.type.TypeMirror)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visit(javax.lang.model.type.TypeMirror) public abstract
     * java.lang.Object javax.lang.model.type.TypeVisitor.visit(javax.lang.model.type.TypeMirror)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visit(javax.lang.model.type.TypeMirror) public abstract java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visit(javax.lang.model.type.TypeMirror) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visit_TypeMirror()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitIntersection(javax.lang.model.type.IntersectionType, Object) public
     * abstract R javax.lang.model.type.TypeVisitor.visitIntersection(javax.lang.model.type.IntersectionType,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitIntersection(javax.lang.model.type.IntersectionType, Object) public
     * abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitIntersection(javax.lang.model.type.IntersectionType,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitIntersection(javax.lang.model.type.IntersectionType, Object) public
     *      abstract java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitIntersection(javax.lang.model.type.IntersectionType,java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitIntersection_IntersectionType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitError(javax.lang.model.type.ErrorType, Object)
     * public abstract R javax.lang.model.type.TypeVisitor.visitError(javax.lang.model.type.ErrorType,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.type.TypeVisitor#visitError(javax.lang.model.type.ErrorType, Object)
     * public abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitError(javax.lang.model.type.ErrorType,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitError(javax.lang.model.type.ErrorType, Object) public abstract
     *      java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitError(javax.lang.model.type.ErrorType,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitError_ErrorType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitWildcard(javax.lang.model.type.WildcardType, Object) public
     * abstract R javax.lang.model.type.TypeVisitor.visitWildcard(javax.lang.model.type.WildcardType,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitWildcard(javax.lang.model.type.WildcardType, Object) public
     * abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitWildcard(javax.lang.model.type.WildcardType,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitWildcard(javax.lang.model.type.WildcardType, Object) public abstract
     *      java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitWildcard(javax.lang.model.type.WildcardType,java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitWildcard_WildcardType_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitTypeVariable(javax.lang.model.type.TypeVariable, Object) public
     * abstract R javax.lang.model.type.TypeVisitor.visitTypeVariable(javax.lang.model.type.TypeVariable,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.type.TypeVisitor#visitTypeVariable(javax.lang.model.type.TypeVariable, Object) public
     * abstract java.lang.Object
     * javax.lang.model.type.TypeVisitor.visitTypeVariable(javax.lang.model.type.TypeVariable,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.type.TypeVisitor#visitTypeVariable(javax.lang.model.type.TypeVariable, Object) public
     *      abstract java.lang.Object
     *      javax.lang.model.type.TypeVisitor.visitTypeVariable(javax.lang.model.type.TypeVariable,java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitTypeVariable_TypeVariable_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
