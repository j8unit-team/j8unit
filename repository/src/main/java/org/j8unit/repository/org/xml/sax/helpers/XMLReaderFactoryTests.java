package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.helpers.XMLReaderFactory class
 * org.xml.sax.helpers.XMLReaderFactory}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link XMLReaderFactoryClassTests}.
 * </p>
 *
 * @see org.xml.sax.helpers.XMLReaderFactory class org.xml.sax.helpers.XMLReaderFactory (the hereby targeted
 *      class-under-test class)
 * @see XMLReaderFactoryClassTests XMLReaderFactoryClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLReaderFactoryTests<SUT extends org.xml.sax.helpers.XMLReaderFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
