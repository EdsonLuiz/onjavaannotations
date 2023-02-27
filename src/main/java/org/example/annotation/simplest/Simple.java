package org.example.annotation.simplest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE,
ElementType.PACKAGE, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
public @interface Simple {

    /*
    SOURCE means tha annotation do not survive into the compiled code.

    Javac is the ony agent with the opportunity to process annotations.
     */
    String value() default "-default-";
}
