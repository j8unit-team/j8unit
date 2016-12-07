package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertTrue;
import java.awt.AWTEventMulticaster;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.awt.event.ActionListenerClassTests;
import org.j8unit.repository.java.awt.event.AdjustmentListenerClassTests;
import org.j8unit.repository.java.awt.event.ComponentListenerClassTests;
import org.j8unit.repository.java.awt.event.ContainerListenerClassTests;
import org.j8unit.repository.java.awt.event.FocusListenerClassTests;
import org.j8unit.repository.java.awt.event.HierarchyBoundsListenerClassTests;
import org.j8unit.repository.java.awt.event.HierarchyListenerClassTests;
import org.j8unit.repository.java.awt.event.InputMethodListenerClassTests;
import org.j8unit.repository.java.awt.event.ItemListenerClassTests;
import org.j8unit.repository.java.awt.event.KeyListenerClassTests;
import org.j8unit.repository.java.awt.event.MouseListenerClassTests;
import org.j8unit.repository.java.awt.event.MouseMotionListenerClassTests;
import org.j8unit.repository.java.awt.event.MouseWheelListenerClassTests;
import org.j8unit.repository.java.awt.event.TextListenerClassTests;
import org.j8unit.repository.java.awt.event.WindowFocusListenerClassTests;
import org.j8unit.repository.java.awt.event.WindowListenerClassTests;
import org.j8unit.repository.java.awt.event.WindowStateListenerClassTests;
import org.j8unit.repository.java.lang.ObjectClassTests;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the type relevant aspects &ndash;&nbsp;i.&thinsp;e., runtime constraints
 * and further type specific requirements&nbsp;&ndash; of the hereby targeted type-under-test {@link AWTEventMulticaster
 * public class java.awt.AWTEventMulticaster}.
 *
 * (In addition, the runtime type of this j8unit test interface's generic type is verified by
 * {@link #verifyGenericType()}).
 * </p>
 *
 * <p>
 * The complementary j8unit test interface containing the instance relevant aspects is
 * {@link org.j8unit.repository.java.awt.AWTEventMulticasterTests}.
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
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AWTEventMulticasterClassTests<SUT extends AWTEventMulticaster>
extends ComponentListenerClassTests<SUT>, ContainerListenerClassTests<SUT>, FocusListenerClassTests<SUT>, KeyListenerClassTests<SUT>,
MouseListenerClassTests<SUT>, MouseMotionListenerClassTests<SUT>, WindowListenerClassTests<SUT>, WindowFocusListenerClassTests<SUT>,
WindowStateListenerClassTests<SUT>, ActionListenerClassTests<SUT>, ItemListenerClassTests<SUT>, AdjustmentListenerClassTests<SUT>, TextListenerClassTests<SUT>,
InputMethodListenerClassTests<SUT>, HierarchyListenerClassTests<SUT>, HierarchyBoundsListenerClassTests<SUT>, MouseWheelListenerClassTests<SUT>,
ObjectClassTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.AWTEventMulticaster]

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
        assertTrue("This j8unit test interface is used with a generic type that is illegaly not assignable to AWTEventMulticaster.class!",
                   AWTEventMulticaster.class.isAssignableFrom(sut));
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.AWTEventMulticaster]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.AWTEventMulticaster]

}
