package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.annotation.XmlAnyAttribute interface
 * javax.xml.bind.annotation.XmlAnyAttribute}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link XmlAnyAttributeClassTests}.
 * </p>
 *
 * @see javax.xml.bind.annotation.XmlAnyAttribute interface javax.xml.bind.annotation.XmlAnyAttribute (the hereby
 *      targeted class-under-test class)
 * @see XmlAnyAttributeClassTests XmlAnyAttributeClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlAnyAttributeTests<SUT extends javax.xml.bind.annotation.XmlAnyAttribute>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

}
