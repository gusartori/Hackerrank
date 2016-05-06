package tests.classes;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by junior on 3/10/16.
 */
public class AttributeList {
    Set<Attribute> attributes = new HashSet<Attribute>();

    public void add(double attribute, int category) throws NegativeCategory {
        if (category < 0)
            throw new NegativeCategory();

        attributes.add(new Attribute(attribute, category));
    }

    public int size() {
        return attributes.size();
    }

    public Attribute[] getSortedAttributes() {
        return (attributes.stream()
                .sorted((e1, e2) -> Double.compare(e1.value, e2.value)))
                .toArray(Attribute[]::new);
    }

    public class NegativeCategory extends RuntimeException { }
}
