package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.io.SerializableClassTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime constraints
 * and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test {@link Enum public
 * abstract class java.lang.Enum<E>}.
 *
 * (In addition, the runtime type of this j8unit test interface's generic type is verified by
 * {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * The complementary j8unit test interface containing the instance relevant aspects is
 * {@link org.j8unit.repository.java.lang.EnumTests}.
 * </p>
 *
 * <p>
 * <strong>What? Testing the class/the type itself? What is it good for?</strong>
 * </p>
 *
 * <p>
 * Classes/Types may have its own requirements and/or constraints; and all of these needs to be tested too!
 *
 * For example, all sub-types of {@link Throwable} should provide a zero-argument and a {@link String}-argument
 * constructor. Obviously, this is a class-specific behaviour. In general, all constraints referring to the provision of
 * specific constructors (and its individual requirements) should be covered by according test methods. (Note, this is
 * not limited to constructors only; Just think of factory methods and further.)
 *
 * For another example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the <em>AnnotationTypeElementDeclaration</em> production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a {@code throws} clause</q> (JLS,
 * Sec.&thinsp;9.6.1</a>). Obviously, this is a type-specific behaviour too; And it must be tested!
 * </p>
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 */
@SuppressWarnings("rawtypes")
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EnumClassTests<SUT extends Enum>
extends ComparableClassTests<SUT>, SerializableClassTests<SUT>, ObjectClassTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Enum]
    /**
     * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
     *      (the hereby targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Override
    @Test
    public default void verifyGenericType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to Enum.class!", Enum.class.isAssignableFrom(sut));
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Enum]

    /**
     * @since 1.0.1
     */
    @Test
    public default void isEnumMustReturnTrue()
    throws Exception {
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
        assertTrue(sut.isEnum());
    }

    /**
     * @since 0.9.3
     */
    @Test
    public default void enumsMustContainImplicitilyDefinedValuesMethod()
    throws Exception {
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
        assumeFalse("This general test method is not suitable for [" + Enum.class.getName() + "] itself.", Enum.class.equals(sut));
        final Method method = sut.getMethod("values");
        assertNotNull(method);
        assertTrue(method.getReturnType().isArray());
        assertTrue(Modifier.isStatic(method.getModifiers()));
        final Object invocation = method.invoke(null);
        assertNotNull(invocation);
        assertTrue(invocation.getClass().isArray());
        assertEquals(sut, invocation.getClass().getComponentType());
        final @SuppressWarnings("unchecked") SUT[] enums = (SUT[]) invocation;
        assertArrayEquals(sut.getEnumConstants(), enums);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Enum]

}
