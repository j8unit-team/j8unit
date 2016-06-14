package org.j8unit.generator.analysis;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.util.Sets.asSet;
import java.util.List;
import java.util.Set;
import org.j8unit.generator.api.CustomWarnings;

/**
 * <p>
 * Enumeration of the nature of Java types; Actually, there are three.
 *
 * Java types can be {@linkplain #NON_GENERIC pure} (simple types without type arguments), they can be
 * {@linkplain #GENERIC generic} (types with type argument(s)), or they can be {@linkplain #RAW raw} (generic types but
 * without the according type argument(s)).
 * <p>
 *
 * <p>
 * This helper enumeration does provide further j8unit specific content:
 * </p>
 * <ul>
 * <li>{@link #getWarnings()}</li>
 * </ul>
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">The Java&trade; Tutorials: Generic
 *      Types</a>
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html">The Java&trade; Tutorials: Raw
 *      Types</a>
 */
public enum TypeNatures
implements CustomWarnings {

    /**
     * Enumeration constant representing non-generic (pure) types.
     */
    NON_GENERIC,

    /**
     * Enumeration constant representing generic types that do have according type arguments.
     *
     * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">The Java&trade; Tutorials:
     *      Generic Types</a>
     */
    GENERIC,

    /**
     * Enumeration constant representing raw types, i.&thinsp;e., generic classes or interfaces but without type
     * arguments.
     *
     * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html">The Java&trade; Tutorials: Raw
     *      Types</a>
     */
    RAW("rawtypes");

    private final Set<String> warnings;

    private TypeNatures(final String... warnings) {
        this.warnings = unmodifiableSet(asSet(warnings));
    }

    @Override
    public Set<String> getWarnings() {
        return this.warnings;
    }

    /**
     * Returns the {@link TypeNatures} {@code enum} constant according to the query Java {@code type}.
     *
     * @param type
     *            the query Java type
     * @return the {@code TypeNatures} {@code enum} constant according to the query Java {@code type}
     */
    public static final TypeNatures natureOf(final Class<?> type) {
        requireNonNull(type);
        if (JAVA8_RAW_GENERIC_TYPES.contains(type)) {
            // TODO: Identify any raw generic type automatically!
            return RAW;
        } else if (type.getTypeParameters().length == 0) {
            return NON_GENERIC;
        } else {
            return GENERIC;
        }
    }

    private static final List<Class<?>> JAVA8_RAW_GENERIC_TYPES = asList(
                                                                         /* (1) BeanContext and sub-types */
                                                                         // extends Collection<NO-TYPE>
                                                                         java.beans.beancontext.BeanContext.class,
                                                                         // extends BeanContext
                                                                         java.beans.beancontext.BeanContextServices.class,
                                                                         // extends BeanContext
                                                                         java.beans.beancontext.BeanContextSupport.class,
                                                                         // extends BeanContextServices,
                                                                         // BeanContextSupport
                                                                         java.beans.beancontext.BeanContextServicesSupport.class,

                                                                         /* (2) BasicComboBoxRenderer and sub-types */
                                                                         // extends
                                                                         // javax.swing.ListCellRenderer<NO-TYPE>
                                                                         javax.swing.plaf.basic.BasicComboBoxRenderer.class,
                                                                         // extends BasicComboBoxRenderer
                                                                         javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource.class,

                                                                         /* (3) XMLEventReader and sub-types */
                                                                         // extends Iterator<NO-TYPE>
                                                                         javax.xml.stream.XMLEventReader.class,
                                                                         // extends XMLEventReader
                                                                         javax.xml.stream.util.EventReaderDelegate.class);

}
