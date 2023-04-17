package com.example.dependance.demo.concreteClass;

import com.example.dependance.demo.abstractClass.AbstractClass1;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass1 {
    public void concreteClass2Methode(){
        concreteDependance1.yell();
        concreteDependance2.yell();
    }
}
