package org.j8unit.repository.java.net;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.net.URLEncoder class java.net.URLEncoder}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.java.net.URLEncoderTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.net.URLEncoderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.net.URLEncoder
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface URLEncoderTests<SUT extends java.net.URLEncoder>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
