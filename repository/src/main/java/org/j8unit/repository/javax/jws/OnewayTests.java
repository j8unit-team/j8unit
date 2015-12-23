package org.j8unit.repository.javax.jws;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.jws.Oneway interface javax.jws.Oneway}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test
 * interface containing the class relevant test methods is {@link org.j8unit.repository.javax.jws.OnewayTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.jws.OnewayClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.jws.Oneway
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OnewayTests<SUT extends javax.jws.Oneway>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

}
