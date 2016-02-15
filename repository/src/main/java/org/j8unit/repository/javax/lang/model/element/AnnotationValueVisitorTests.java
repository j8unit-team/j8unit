package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.element.AnnotationValueVisitor interface
 * javax.lang.model.element.AnnotationValueVisitor}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link AnnotationValueVisitorClassTests}.
 * </p>
 *
 * @see javax.lang.model.element.AnnotationValueVisitor interface javax.lang.model.element.AnnotationValueVisitor (the
 *      hereby targeted class-under-test class)
 * @see AnnotationValueVisitorClassTests AnnotationValueVisitorClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AnnotationValueVisitorTests<SUT extends javax.lang.model.element.AnnotationValueVisitor<R, P>, R, P>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visitAnnotation(javax.lang.model.element.AnnotationMirror, Object)
     * public abstract R
     * javax.lang.model.element.AnnotationValueVisitor.visitAnnotation(javax.lang.model.element.AnnotationMirror,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visitAnnotation(javax.lang.model.element.AnnotationMirror, Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.AnnotationValueVisitor.visitAnnotation(javax.lang.model.element.AnnotationMirror,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitAnnotation(javax.lang.model.element.AnnotationMirror,
     *      Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitAnnotation(javax.lang.model.element.AnnotationMirror,
     *      java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitAnnotation_AnnotationMirror_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitString(String, Object) public
     * abstract R javax.lang.model.element.AnnotationValueVisitor.visitString(java.lang.String,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitString(String, Object) public
     * abstract java.lang.Object
     * javax.lang.model.element.AnnotationValueVisitor.visitString(java.lang.String,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitString(String, Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitString(java.lang.String,java.lang.Object) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitString_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visitType(javax.lang.model.type.TypeMirror, Object) public
     * abstract R javax.lang.model.element.AnnotationValueVisitor.visitType(javax.lang.model.type.TypeMirror,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visitType(javax.lang.model.type.TypeMirror, Object) public
     * abstract java.lang.Object
     * javax.lang.model.element.AnnotationValueVisitor.visitType(javax.lang.model.type.TypeMirror,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitType(javax.lang.model.type.TypeMirror, Object) public
     *      abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitType(javax.lang.model.type.TypeMirror,java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitType_TypeMirror_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitDouble(double, Object) public
     * abstract R javax.lang.model.element.AnnotationValueVisitor.visitDouble(double,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitDouble(double, Object) public
     * abstract java.lang.Object javax.lang.model.element.AnnotationValueVisitor.visitDouble(double,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitDouble(double, Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitDouble(double,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitDouble_double_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitLong(long, Object) public abstract R
     * javax.lang.model.element.AnnotationValueVisitor.visitLong(long,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitLong(long, Object) public abstract
     * java.lang.Object javax.lang.model.element.AnnotationValueVisitor.visitLong(long,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitLong(long, Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitLong(long,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitLong_long_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitChar(char, Object) public abstract R
     * javax.lang.model.element.AnnotationValueVisitor.visitChar(char,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitChar(char, Object) public abstract
     * java.lang.Object javax.lang.model.element.AnnotationValueVisitor.visitChar(char,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitChar(char, Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitChar(char,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitChar_char_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitShort(short, Object) public abstract
     * R javax.lang.model.element.AnnotationValueVisitor.visitShort(short,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitShort(short, Object) public abstract
     * java.lang.Object javax.lang.model.element.AnnotationValueVisitor.visitShort(short,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitShort(short, Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitShort(short,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitShort_short_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitBoolean(boolean, Object) public
     * abstract R javax.lang.model.element.AnnotationValueVisitor.visitBoolean(boolean,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitBoolean(boolean, Object) public
     * abstract java.lang.Object javax.lang.model.element.AnnotationValueVisitor.visitBoolean(boolean,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitBoolean(boolean, Object) public abstract
     *      java.lang.Object javax.lang.model.element.AnnotationValueVisitor.visitBoolean(boolean,java.lang.Object) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitBoolean_boolean_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visit(javax.lang.model.element.AnnotationValue, Object)
     * public abstract R
     * javax.lang.model.element.AnnotationValueVisitor.visit(javax.lang.model.element.AnnotationValue,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visit(javax.lang.model.element.AnnotationValue, Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.AnnotationValueVisitor.visit(javax.lang.model.element.AnnotationValue,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visit(javax.lang.model.element.AnnotationValue, Object)
     *      public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visit(javax.lang.model.element.AnnotationValue,java.lang.
     *      Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visit_AnnotationValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visit(javax.lang.model.element.AnnotationValue) public
     * abstract R javax.lang.model.element.AnnotationValueVisitor.visit(javax.lang.model.element.AnnotationValue)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visit(javax.lang.model.element.AnnotationValue) public
     * abstract java.lang.Object
     * javax.lang.model.element.AnnotationValueVisitor.visit(javax.lang.model.element.AnnotationValue)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visit(javax.lang.model.element.AnnotationValue) public
     *      abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visit(javax.lang.model.element.AnnotationValue) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visit_AnnotationValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visitUnknown(javax.lang.model.element.AnnotationValue, Object)
     * public abstract R
     * javax.lang.model.element.AnnotationValueVisitor.visitUnknown(javax.lang.model.element.AnnotationValue,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visitUnknown(javax.lang.model.element.AnnotationValue, Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.AnnotationValueVisitor.visitUnknown(javax.lang.model.element.AnnotationValue,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitUnknown(javax.lang.model.element.AnnotationValue,
     *      Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitUnknown(javax.lang.model.element.AnnotationValue,java.
     *      lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitUnknown_AnnotationValue_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitByte(byte, Object) public abstract R
     * javax.lang.model.element.AnnotationValueVisitor.visitByte(byte,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitByte(byte, Object) public abstract
     * java.lang.Object javax.lang.model.element.AnnotationValueVisitor.visitByte(byte,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitByte(byte, Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitByte(byte,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitByte_byte_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitFloat(float, Object) public abstract
     * R javax.lang.model.element.AnnotationValueVisitor.visitFloat(float,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitFloat(float, Object) public abstract
     * java.lang.Object javax.lang.model.element.AnnotationValueVisitor.visitFloat(float,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitFloat(float, Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitFloat(float,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitFloat_float_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitArray(java.util.List, Object) public
     * abstract R javax.lang.model.element.AnnotationValueVisitor.visitArray(java.util.List<? extends
     * javax.lang.model.element.AnnotationValue>,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitArray(java.util.List, Object) public
     * abstract java.lang.Object
     * javax.lang.model.element.AnnotationValueVisitor.visitArray(java.util.List,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitArray(java.util.List, Object) public abstract
     *      java.lang.Object javax.lang.model.element.AnnotationValueVisitor.visitArray(java.util.List,java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitArray_List_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visitEnumConstant(javax.lang.model.element.VariableElement, Object)
     * public abstract R
     * javax.lang.model.element.AnnotationValueVisitor.visitEnumConstant(javax.lang.model.element.VariableElement,P)}.
     *
     * <p>
     * Test method for
     * {@link javax.lang.model.element.AnnotationValueVisitor#visitEnumConstant(javax.lang.model.element.VariableElement, Object)
     * public abstract java.lang.Object
     * javax.lang.model.element.AnnotationValueVisitor.visitEnumConstant(javax.lang.model.element.VariableElement,java.lang.Object)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitEnumConstant(javax.lang.model.element.VariableElement,
     *      Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitEnumConstant(javax.lang.model.element.VariableElement,
     *      java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitEnumConstant_VariableElement_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitInt(int, Object) public abstract R
     * javax.lang.model.element.AnnotationValueVisitor.visitInt(int,P)}.
     *
     * <p>
     * Test method for {@link javax.lang.model.element.AnnotationValueVisitor#visitInt(int, Object) public abstract
     * java.lang.Object javax.lang.model.element.AnnotationValueVisitor.visitInt(int,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.lang.model.element.AnnotationValueVisitor#visitInt(int, Object) public abstract java.lang.Object
     *      javax.lang.model.element.AnnotationValueVisitor.visitInt(int,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_visitInt_int_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
