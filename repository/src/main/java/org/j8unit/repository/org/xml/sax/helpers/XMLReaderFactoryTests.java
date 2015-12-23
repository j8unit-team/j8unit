package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.xml.sax.helpers.XMLReaderFactory class
 * org.xml.sax.helpers.XMLReaderFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.xml.sax.helpers.XMLReaderFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.xml.sax.helpers.XMLReaderFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.xml.sax.helpers.XMLReaderFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLReaderFactoryTests<SUT extends org.xml.sax.helpers.XMLReaderFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
