package org.j8unit.repository.javax.xml.ws.http;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.http.HTTPBinding interface javax.xml.ws.http.HTTPBinding}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.http.HTTPBindingTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.http.HTTPBindingClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.http.HTTPBinding
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HTTPBindingTests<SUT extends javax.xml.ws.http.HTTPBinding>
extends org.j8unit.repository.javax.xml.ws.BindingTests<SUT> {

}
