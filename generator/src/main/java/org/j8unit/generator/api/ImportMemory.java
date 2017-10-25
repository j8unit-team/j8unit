package org.j8unit.generator.api;

import static java.lang.String.format;
import static java.util.Collections.emptyList;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.analysis.TypePosition.TOP_LEVEL;
import static org.j8unit.generator.util.Arrays.baseComponentTypeOf;
import static org.j8unit.generator.util.Java.JAVA_LANG;
import static org.j8unit.generator.util.Java.JAVA_LANG_PACKAGE;
import static org.j8unit.generator.util.Java.JAVA_NAMESPACE_DELIMITER;
import static org.j8unit.generator.util.Optionals.optionalise;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Helper class to collect classes and methods intended to be used when {@linkplain #render(String) rendering some
 * <code>import</code> header}.
 */
public final class ImportMemory {

    /**
     * List of all pre-claimed class names.
     */
    private List<String> claimed = emptyList();

    /**
     * Updates the list of all pre-claimed class names. For example, a list of nested types is used to ensure that equal
     * named classes of other packages are not specified {@linkplain #render(String) in the import header}.
     */
    public void setClaimedNames(final List<String> claimed) {
        this.claimed = requireNonNull(claimed);
    }

    /**
     * List of all class names that are planned to be used when {@linkplain #render(String) rendering the
     * <code>import</code> header}.
     */
    private final SortedSet<Class<?>> importAccu = new TreeSet<>((x, y) -> x.getCanonicalName().compareTo(y.getCanonicalName()));

    /**
     * List of all method names that are planned to be used when {@linkplain #render(String) rendering in the
     * <code>static</code> <code>import</code> header}.
     */
    private final SortedMap<Class<?>, SortedSet<String>> staticImportAccu = new TreeMap<>((x, y) -> x.getCanonicalName().compareTo(y.getCanonicalName()));

    /**
     * Inserts a class, planned to be used when {@linkplain #render(String) rendering the <code>import</code> header}.
     *
     * @param name
     *            the name of the additional class
     * @return {@code true}, iff the class has been added (or was already inserted before)
     */
    public final boolean add(final String name) {
        requireNonNull(name);
        try {
            return this.add(Class.forName(name));
        } catch (final Throwable e) {
            return false;
        }
    }

    /**
     * Inserts a class, planned to be used when {@linkplain #render(String) rendering the <code>import</code> header}.
     *
     * @param type
     *            the additional class
     * @return {@code true}, iff the class has been added (or was already inserted before)
     */
    public final boolean add(final Class<?> type) {
        requireNonNull(type);
        if (this.importAccu.contains(type)) {
            // already contained --> true
            return true;
        } else if (this.claimed.contains(type.getSimpleName())) {
            // conflicts some other type --> false
            return false;
        } else if (type.isPrimitive()) {
            // primitives are not imported --> false
            return false;
        } else if (type.isArray()) {
            // array types are not imported directly --> add component type
            return this.add(baseComponentTypeOf(type));
        } else if (JAVA_LANG_PACKAGE.equals(type.getPackage()) && TOP_LEVEL.matches(type)) {
            // java.lang.* is imported implicitely --> true
            return true;
        } else if (optionalise(() -> Class.forName(JAVA_LANG + JAVA_NAMESPACE_DELIMITER + type.getSimpleName())).isPresent()) {
            // conflicts some java.lang.* type --> false
            return false;
        } else {
            synchronized (this.importAccu) {
                if (this.importAccu.stream().map(Class::getSimpleName).anyMatch(type.getSimpleName()::equals)) {
                    return false;
                } else {
                    this.importAccu.add(type);
                    return true;
                }
            }
        }
    }

    /**
     * Inserts a method, planned to be used when {@linkplain #render(String) rendering the <code>static</code>
     * <code>import</code> header}.
     *
     * @param name
     *            the name of the additional method
     * @return {@code true}, iff the method has been added (or was already inserted before)
     */
    public final boolean addStatic(final Class<?> type, final String name) {
        requireNonNull(type);
        requireNonNull(name);
        synchronized (this.staticImportAccu) {
            if (this.staticImportAccu.values().stream().flatMap(Collection::stream).anyMatch(name::equals)) {
                return false;
            } else {
                this.staticImportAccu.compute(type, (key, oldSet) -> {
                    if (oldSet == null) {
                        final SortedSet<String> newSet = new TreeSet<>();
                        newSet.add(name);
                        return newSet;
                    } else {
                        oldSet.add(name);
                        return oldSet;
                    }
                });
                return true;
            }
        }
    }

    /**
     * Based on the current {@link #staticImportAccu} and the {@link #importAccu}, this method returns the according
     * {@code import} header.
     *
     * According to the given {@code reference} package, the {@code import} header might be shortened.
     *
     * @param reference
     *            the reference package
     * @return the rendered {@code import} header
     */
    public final String render(final String reference) {
        final StringBuilder sb = new StringBuilder();
        for (final Entry<Class<?>, SortedSet<String>> type : this.staticImportAccu.entrySet()) {
            for (final String name : type.getValue()) {
                sb.append(format("import static %s.%s;%n", type.getKey().getCanonicalName(), name));
            }
        }
        for (final Class<?> type : this.importAccu) {
            if (!reference.equals(type.getPackage().getName()) || !TOP_LEVEL.matches(type)) {
                sb.append(format("import %s;%n", type.getCanonicalName()));
            }
        }
        return sb.toString();
    }

}
