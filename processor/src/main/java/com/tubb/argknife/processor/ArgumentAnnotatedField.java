package com.tubb.argknife.processor;

import com.tubb.argknife.annotation.FrgmtArg;

import javax.lang.model.element.Element;

/**
 * Created by tubingbing on 16/5/7.
 */
public class ArgumentAnnotatedField extends AnnotatedField{

    public ArgumentAnnotatedField(Element element) {
        super(element, isRequired(element), getKey(element));
    }

    private static String getKey(Element element) {
        FrgmtArg annotation = element.getAnnotation(FrgmtArg.class);
        String field = element.getSimpleName().toString();
        if (!"".equals(annotation.key())) {
            return annotation.key();
        }
        return getVariableName(field);
    }

    private static boolean isRequired(Element element) {
        FrgmtArg annotation = element.getAnnotation(FrgmtArg.class);
        return annotation.required();
    }

}
