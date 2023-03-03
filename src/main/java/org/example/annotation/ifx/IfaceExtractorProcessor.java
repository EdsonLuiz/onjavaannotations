package org.example.annotation.ifx;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import java.util.ArrayList;
import java.util.Set;

@SupportedAnnotationTypes("annotations.ifx.ExtractInterface")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class IfaceExtractorProcessor extends AbstractProcessor {

    private ArrayList<Element> interfaceMethods = new ArrayList<>();

    Elements elementUtils;
    private ProcessingEnvironment processingEnvironment;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        this.processingEnvironment = processingEnv;
        elementUtils = processingEnv.getElementUtils();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (Element elem : roundEnv.getElementsAnnotatedWith(ExtractInterface.class)) {
            
        }
    }
}
