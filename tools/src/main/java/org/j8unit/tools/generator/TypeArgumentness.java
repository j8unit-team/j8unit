package org.j8unit.tools.generator;

import static java.util.Objects.requireNonNull;
import static org.j8unit.tools.util.NamingUtilities.listOfTypeParameterDefinitionsOf;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Based on the existing Java's kind of types, this enumeration provides according generator support.
 * </p>
 *
 * <dl>
 * <dt>Kind of Types?</dt>
 * <dd>Java types can be pure (simple types without type arguments), they can be generic (types with type arguments), or
 * they can be raw (generic types without any type arguments).</dd>
 * </dl>
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html"> The Java&trade; Tutorials: Generic
 *      Types</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html"> The Java&trade; Tutorials: Raw
 *      Types</a>
 */
public enum TypeArgumentness {

    /**
     * Enumeration constant representing non-generic types.
     */
    NON_GENERIC,

    /**
     * Enumeration constant representing generic types that do have according type arguments.
     */
    GENERIC,

    /**
     * Enumeration constant representing raw types, i.&thinsp;e., generic classes or interfaces without any type
     * arguments.
     *
     * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html"> The Java&trade; Tutorials:
     *      Raw Types</a>
     */
    RAW;

    public static final TypeArgumentness valueOf(final Class<?> clazz) {
        requireNonNull(clazz);
        return isRawGeneric(clazz) ? RAW : listOfTypeParameterDefinitionsOf(clazz).isEmpty() ? NON_GENERIC : GENERIC;
    }

    public static final boolean isRawGeneric(final Class<?> clazz) {
        requireNonNull(clazz);
        final List<Class<?>> rawGenerics = Arrays.asList( // extends Collection[]
                                                          java.beans.beancontext.BeanContext.class,
                                                          // extends BeanContext
                                                          java.beans.beancontext.BeanContextServices.class,
                                                          // extends BeanContext
                                                          java.beans.beancontext.BeanContextSupport.class,
                                                          // extends BeanContextServices, BeanContextSupport
                                                          java.beans.beancontext.BeanContextServicesSupport.class,
                                                          // extends javax.swing.ListCellRenderer[]
                                                          javax.swing.plaf.basic.BasicComboBoxRenderer.class,
                                                          // extends BasicComboBoxRenderer
                                                          javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource.class,
                                                          // extends Iterator[]
                                                          javax.xml.stream.XMLEventReader.class,
                                                          // extends XMLEventReader
                                                          javax.xml.stream.util.EventReaderDelegate.class);
        return rawGenerics.contains(clazz);
    }

}
