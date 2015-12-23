package org.j8unit.repository.javax.xml.ws.handler;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.handler.LogicalHandler interface
 * javax.xml.ws.handler.LogicalHandler}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.ws.handler.LogicalHandlerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.handler.LogicalHandlerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.handler.LogicalHandler
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LogicalHandlerTests<SUT extends javax.xml.ws.handler.LogicalHandler<C>, C extends javax.xml.ws.handler.LogicalMessageContext>
extends org.j8unit.repository.javax.xml.ws.handler.HandlerTests<SUT, C> {

}
