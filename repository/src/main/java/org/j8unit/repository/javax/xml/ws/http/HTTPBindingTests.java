package org.j8unit.repository.javax.xml.ws.http;

import javax.xml.ws.http.HTTPBinding;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.xml.ws.BindingTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link HTTPBinding
 * public abstract interface javax.xml.ws.http.HTTPBinding}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link HTTPBindingClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTTPBindingTests<SUT extends HTTPBinding>
extends BindingTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.http.HTTPBinding]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.http.HTTPBinding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.http.HTTPBinding]
}
