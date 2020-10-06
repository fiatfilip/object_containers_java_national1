package ro.siit.anno;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotatedClass annoClass = new AnnotatedClass();
        Arrays.stream(annoClass.getClass().getAnnotations()).sequential().forEach(System.out::println);

        for(Annotation ano : annoClass.getClass().getAnnotations()){
            System.out.println(ano);
        }
    }
}
