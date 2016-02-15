package org.j8unit.repository.javax.xml.bind.util;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.util.JAXBSource class javax.xml.bind.util.JAXBSource}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JAXBSourceClassTests}.
 * </p>
 *
 * @see javax.xml.bind.util.JAXBSource class javax.xml.bind.util.JAXBSource (the hereby targeted class-under-test class)
 * @see JAXBSourceClassTests JAXBSourceClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JAXBSourceTests<SUT extends javax.xml.bind.util.JAXBSource>
extends org.j8unit.repository.javax.xml.transform.sax.SAXSourceTests<SUT> {

}
