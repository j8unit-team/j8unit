package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.xml.sax.SAXNotRecognizedException class
 * org.xml.sax.SAXNotRecognizedException}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.xml.sax.SAXNotRecognizedExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.xml.sax.SAXNotRecognizedExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.xml.sax.SAXNotRecognizedException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SAXNotRecognizedExceptionTests<SUT extends org.xml.sax.SAXNotRecognizedException>
extends org.j8unit.repository.org.xml.sax.SAXExceptionTests<SUT> {

}
