package org.j8unit.repository.java.lang.invoke;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.invoke.LambdaMetafactory class java.lang.invoke.LambdaMetafactory}, containing all
 * class relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.lang.invoke.LambdaMetafactoryTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.invoke.LambdaMetafactoryTests
 */
@Category(J8UnitRepository.class)
public abstract interface LambdaMetafactoryClassTests<SUT extends Class<? extends java.lang.invoke.LambdaMetafactory>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * Test method for {@link java.lang.invoke.LambdaMetafactory#LambdaMetafactory() public
     * java.lang.invoke.LambdaMetafactory()}.
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_LambdaMetafactory()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final java.lang.invoke.LambdaMetafactory sut = null; // = new LambdaMetafactory();
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.lang.invoke.LambdaMetafactory> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.invoke.LambdaMetafactory.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.LambdaMetafactory#metafactory(java.lang.invoke.MethodHandles.Lookup,java.lang.String,java.lang.invoke.MethodType,java.lang.invoke.MethodType,java.lang.invoke.MethodHandle,java.lang.invoke.MethodType)
     * public static java.lang.invoke.CallSite
     * java.lang.invoke.LambdaMetafactory.metafactory(java.lang.invoke.MethodHandles$Lookup,java.lang.String,java.lang.invoke.MethodType,java.lang.invoke.MethodType,java.lang.invoke.MethodHandle,java.lang.invoke.MethodType)
     * throws java.lang.invoke.LambdaConversionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_metafactory_Lookup_String_MethodType_MethodType_MethodHandle_MethodType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.invoke.LambdaMetafactory#altMetafactory(java.lang.invoke.MethodHandles.Lookup,java.lang.String,java.lang.invoke.MethodType,java.lang.Object...)
     * public static java.lang.invoke.CallSite
     * java.lang.invoke.LambdaMetafactory.altMetafactory(java.lang.invoke.MethodHandles$Lookup,java.lang.String,java.lang.invoke.MethodType,java.lang.Object...)
     * throws java.lang.invoke.LambdaConversionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_altMetafactory_Lookup_String_MethodType_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
