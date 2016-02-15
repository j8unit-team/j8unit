package org.j8unit.repository.javax.xml.ws.http;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.http.HTTPBinding interface javax.xml.ws.http.HTTPBinding}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link HTTPBindingClassTests}.
 * </p>
 *
 * @see javax.xml.ws.http.HTTPBinding interface javax.xml.ws.http.HTTPBinding (the hereby targeted class-under-test
 *      class)
 * @see HTTPBindingClassTests HTTPBindingClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTTPBindingTests<SUT extends javax.xml.ws.http.HTTPBinding>
extends org.j8unit.repository.javax.xml.ws.BindingTests<SUT> {

}
