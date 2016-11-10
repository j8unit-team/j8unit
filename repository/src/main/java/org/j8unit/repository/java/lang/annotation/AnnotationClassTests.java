package org.j8unit.repository.java.lang.annotation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.j8unit.repository.RepositoryClassTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime constraints
 * and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test {@link Annotation public
 * abstract interface java.lang.annotation.Annotation}.
 *
 * (In addition, the runtime type of this j8unit test interface's generic type is verified by
 * {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * The complementary j8unit test interface containing the instance relevant aspects is
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationTests}.
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
 * constructor. Obviously, this is a class-specific behaviour. In general, all constraints refering to the provision of
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

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AnnotationClassTests<SUT extends Annotation>
extends RepositoryClassTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.annotation.Annotation]
    /**
     * @see Class#isAssignableFrom(Class) public native boolean java.lang.Class.isAssignableFrom(java.lang.Class<?>)
     *      (the hereby targeted method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void verifyGenericType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to Annotation.class!",
                   Annotation.class.isAssignableFrom(sut));
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.annotation.Annotation]

    /**
     * @since 2.0.0
     */
    @Test
    public default void declaredMethodsCannotHaveFormalParameters() {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
        final Method[] methods = sut.getDeclaredMethods();
        assert methods != null;
        for (final Method method : methods) {
            try {
                final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());
                assert origin != null;
                continue;
            } catch (final NoSuchMethodException ignore) {
                final Class<?>[] formals = method.getParameterTypes();
                assert formals != null;
                assertEquals(0, formals.length);
            }
        }
    }

    /**
     * @since 2.0.0
     */
    @Test
    public default void declaredMethodsCannotHaveThrowsClause() {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
        final Method[] methods = sut.getDeclaredMethods();
        assert methods != null;
        for (final Method method : methods) {
            try {
                final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());
                assert origin != null;
                continue;
            } catch (final NoSuchMethodException ignore) {
                final Class<?>[] exceptions = method.getExceptionTypes();
                assert exceptions != null;
                assertEquals(0, exceptions.length);
            }
        }
    }

    /**
     * @since 2.0.0
     */
    @Test
    public default void declaredMethodsCannotHaveTypeParameters() {
        final Class<SUT> sut = createNewSUT();
        assert sut != null;
        final Method[] methods = sut.getDeclaredMethods();
        assert methods != null;
        for (final Method method : methods) {
            try {
                final Method origin = Object.class.getMethod(method.getName(), method.getParameterTypes());
                assert origin != null;
                continue;
            } catch (final NoSuchMethodException ignore) {
                final java.lang.reflect.TypeVariable<Method>[] types = method.getTypeParameters();
                assert types != null;
                assertEquals(0, types.length);
            }
        }
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.annotation.Annotation]

}
