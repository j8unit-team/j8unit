package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.helpers.ParserFactory class org.xml.sax.helpers.ParserFactory}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link ParserFactoryClassTests}.
 * </p>
 *
 * @see org.xml.sax.helpers.ParserFactory class org.xml.sax.helpers.ParserFactory (the hereby targeted class-under-test
 *      class)
 * @see ParserFactoryClassTests ParserFactoryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParserFactoryTests<SUT extends org.xml.sax.helpers.ParserFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
