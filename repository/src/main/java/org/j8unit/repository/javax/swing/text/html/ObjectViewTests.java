package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.ObjectView;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.swing.text.ComponentViewTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link ObjectView
 * public class javax.swing.text.html.ObjectView}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.swing.text.html.ObjectViewClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectViewTests<SUT extends ObjectView>
extends ComponentViewTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.ObjectView]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.ObjectView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.ObjectView]

}
