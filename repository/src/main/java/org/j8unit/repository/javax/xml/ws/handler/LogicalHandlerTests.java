package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.handler.LogicalHandler interface
 * javax.xml.ws.handler.LogicalHandler}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link LogicalHandlerClassTests}.
 * </p>
 *
 * @see javax.xml.ws.handler.LogicalHandler interface javax.xml.ws.handler.LogicalHandler (the hereby targeted
 *      class-under-test class)
 * @see LogicalHandlerClassTests LogicalHandlerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LogicalHandlerTests<SUT extends javax.xml.ws.handler.LogicalHandler<C>, C extends javax.xml.ws.handler.LogicalMessageContext>
extends HandlerTests<SUT, C> {

}
