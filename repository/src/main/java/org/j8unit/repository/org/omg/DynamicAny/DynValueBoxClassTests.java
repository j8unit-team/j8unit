package org.j8unit.repository.org.omg.DynamicAny;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link org.omg.DynamicAny.DynValueBox interface org.omg.DynamicAny.DynValueBox}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.org.omg.DynamicAny.DynValueBoxTests}.
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
 * @see org.j8unit.repository.org.omg.DynamicAny.DynValueBoxTests
 */
@Category(J8UnitRepository.class)
public abstract interface DynValueBoxClassTests<SUT extends Class<? extends org.omg.DynamicAny.DynValueBox>>
extends org.j8unit.repository.org.omg.DynamicAny.DynValueBoxOperationsClassTests<SUT>, org.j8unit.repository.org.omg.DynamicAny.DynValueCommonClassTests<SUT>,
org.j8unit.repository.org.omg.CORBA.portable.IDLEntityClassTests<SUT> {

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends org.omg.DynamicAny.DynValueBox> sut = createNewSUT();
        // assert assignability
        assertTrue(org.omg.DynamicAny.DynValueBox.class.isAssignableFrom(sut));
    }

}
