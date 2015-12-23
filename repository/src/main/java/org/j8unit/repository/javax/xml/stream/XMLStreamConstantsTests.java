package org.j8unit.repository.javax.xml.stream;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.stream.XMLStreamConstants interface
 * javax.xml.stream.XMLStreamConstants}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.stream.XMLStreamConstantsTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.stream.XMLStreamConstantsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.stream.XMLStreamConstants
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLStreamConstantsTests<SUT extends javax.xml.stream.XMLStreamConstants>
extends RepositoryTests<SUT> {

}
