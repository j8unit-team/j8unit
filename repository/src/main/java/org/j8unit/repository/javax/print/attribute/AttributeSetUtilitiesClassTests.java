package org.j8unit.repository.javax.print.attribute;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.print.attribute.AttributeSetUtilities class javax.print.attribute.AttributeSetUtilities},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.javax.print.attribute.AttributeSetUtilitiesTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.attribute.AttributeSetUtilitiesTests
 */
@Category(J8UnitRepository.class)
public abstract interface AttributeSetUtilitiesClassTests<SUT extends Class<? extends javax.print.attribute.AttributeSetUtilities>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends javax.print.attribute.AttributeSetUtilities> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.print.attribute.AttributeSetUtilities.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#verifyAttributeValue(java.lang.Object,java.lang.Class) public static javax.print.attribute.Attribute javax.print.attribute.AttributeSetUtilities.verifyAttributeValue(java.lang.Object,java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verifyAttributeValue_Object_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#synchronizedView(javax.print.attribute.PrintRequestAttributeSet) public static javax.print.attribute.PrintRequestAttributeSet javax.print.attribute.AttributeSetUtilities.synchronizedView(javax.print.attribute.PrintRequestAttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_synchronizedView_PrintRequestAttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#synchronizedView(javax.print.attribute.DocAttributeSet) public static javax.print.attribute.DocAttributeSet javax.print.attribute.AttributeSetUtilities.synchronizedView(javax.print.attribute.DocAttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_synchronizedView_DocAttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#synchronizedView(javax.print.attribute.AttributeSet) public static javax.print.attribute.AttributeSet javax.print.attribute.AttributeSetUtilities.synchronizedView(javax.print.attribute.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_synchronizedView_AttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#synchronizedView(javax.print.attribute.PrintJobAttributeSet) public static javax.print.attribute.PrintJobAttributeSet javax.print.attribute.AttributeSetUtilities.synchronizedView(javax.print.attribute.PrintJobAttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_synchronizedView_PrintJobAttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#synchronizedView(javax.print.attribute.PrintServiceAttributeSet) public static javax.print.attribute.PrintServiceAttributeSet javax.print.attribute.AttributeSetUtilities.synchronizedView(javax.print.attribute.PrintServiceAttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_synchronizedView_PrintServiceAttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#verifyCategoryForValue(java.lang.Class,javax.print.attribute.Attribute) public static void javax.print.attribute.AttributeSetUtilities.verifyCategoryForValue(java.lang.Class,javax.print.attribute.Attribute)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verifyCategoryForValue_Class_Attribute() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#verifyAttributeCategory(java.lang.Object,java.lang.Class) public static java.lang.Class javax.print.attribute.AttributeSetUtilities.verifyAttributeCategory(java.lang.Object,java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verifyAttributeCategory_Object_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#unmodifiableView(javax.print.attribute.AttributeSet) public static javax.print.attribute.AttributeSet javax.print.attribute.AttributeSetUtilities.unmodifiableView(javax.print.attribute.AttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmodifiableView_AttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#unmodifiableView(javax.print.attribute.DocAttributeSet) public static javax.print.attribute.DocAttributeSet javax.print.attribute.AttributeSetUtilities.unmodifiableView(javax.print.attribute.DocAttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmodifiableView_DocAttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#unmodifiableView(javax.print.attribute.PrintRequestAttributeSet) public static javax.print.attribute.PrintRequestAttributeSet javax.print.attribute.AttributeSetUtilities.unmodifiableView(javax.print.attribute.PrintRequestAttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmodifiableView_PrintRequestAttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#unmodifiableView(javax.print.attribute.PrintJobAttributeSet) public static javax.print.attribute.PrintJobAttributeSet javax.print.attribute.AttributeSetUtilities.unmodifiableView(javax.print.attribute.PrintJobAttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmodifiableView_PrintJobAttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.AttributeSetUtilities#unmodifiableView(javax.print.attribute.PrintServiceAttributeSet) public static javax.print.attribute.PrintServiceAttributeSet javax.print.attribute.AttributeSetUtilities.unmodifiableView(javax.print.attribute.PrintServiceAttributeSet)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmodifiableView_PrintServiceAttributeSet() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
