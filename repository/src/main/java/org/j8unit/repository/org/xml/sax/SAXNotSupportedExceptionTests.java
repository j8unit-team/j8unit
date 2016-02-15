package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.SAXNotSupportedException class
 * org.xml.sax.SAXNotSupportedException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link SAXNotSupportedExceptionClassTests}.
 * </p>
 *
 * @see org.xml.sax.SAXNotSupportedException class org.xml.sax.SAXNotSupportedException (the hereby targeted
 *      class-under-test class)
 * @see SAXNotSupportedExceptionClassTests SAXNotSupportedExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SAXNotSupportedExceptionTests<SUT extends org.xml.sax.SAXNotSupportedException>
extends SAXExceptionTests<SUT> {

}
