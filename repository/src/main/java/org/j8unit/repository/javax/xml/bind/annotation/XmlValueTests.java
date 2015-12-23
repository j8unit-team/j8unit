package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.bind.annotation.XmlValue interface
 * javax.xml.bind.annotation.XmlValue}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.bind.annotation.XmlValueTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.bind.annotation.XmlValueClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.bind.annotation.XmlValue
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlValueTests<SUT extends javax.xml.bind.annotation.XmlValue>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

}
