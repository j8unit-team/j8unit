package org.j8unit.repository.javax.xml.bind.util;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.bind.util.JAXBSource class javax.xml.bind.util.JAXBSource},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.bind.util.JAXBSourceTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.bind.util.JAXBSourceClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.bind.util.JAXBSource
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JAXBSourceTests<SUT extends javax.xml.bind.util.JAXBSource>
extends org.j8unit.repository.javax.xml.transform.sax.SAXSourceTests<SUT> {

}
