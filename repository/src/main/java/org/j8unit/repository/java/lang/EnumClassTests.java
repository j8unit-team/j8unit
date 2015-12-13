package org.j8unit.repository.java.lang;

import static java.lang.reflect.Modifier.isStatic;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import java.lang.reflect.Method;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.Enum class java.lang.Enum}, containing all class relevant test methods (at least the
 * test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is {@link org.j8unit.repository.java.lang.EnumTests}.
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
 *            the class' type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.EnumTests
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EnumClassTests<SUT extends java.lang.Enum>
extends org.j8unit.repository.java.lang.ComparableClassTests<SUT>, org.j8unit.repository.java.io.SerializableClassTests<SUT>,
org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    @Test
    public default void enumsMustContainImplicitilyDefinedValuesMethod()
    throws Exception {
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
        assumeFalse("This general test method is not suitable for [" + Enum.class.getName() + "] itself.", Enum.class.equals(sut));
        final Method method = sut.getMethod("values");
        assertNotNull(method);
        assertTrue(method.getReturnType().isArray());
        assertTrue(isStatic(method.getModifiers()));
        final Object invocation = method.invoke(null);
        assertNotNull(invocation);
        assertTrue(invocation.getClass().isArray());
        assertEquals(sut, invocation.getClass().getComponentType());
        final @SuppressWarnings("unchecked") SUT[] enums = (SUT[]) invocation;
        assertArrayEquals(sut.getEnumConstants(), enums);
    }

    /**
     * <p>
     * Test method for {@link java.lang.Enum#valueOf(java.lang.Class,java.lang.String) public static java.lang.Enum
     * java.lang.Enum.valueOf(java.lang.Class,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valueOf_Class_String()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(java.lang.Enum.class.isAssignableFrom(sut));
    }

}
