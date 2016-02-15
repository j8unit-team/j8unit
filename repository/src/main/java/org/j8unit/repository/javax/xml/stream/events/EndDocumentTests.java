package org.j8unit.repository.javax.xml.stream.events;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.stream.events.EndDocument interface
 * javax.xml.stream.events.EndDocument}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link EndDocumentClassTests}.
 * </p>
 *
 * @see javax.xml.stream.events.EndDocument interface javax.xml.stream.events.EndDocument (the hereby targeted
 *      class-under-test class)
 * @see EndDocumentClassTests EndDocumentClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface EndDocumentTests<SUT extends javax.xml.stream.events.EndDocument>
extends XMLEventTests<SUT> {

}
