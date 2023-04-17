package com.example.dependance.demo.abstractClass;

import com.example.dependance.demo.concreteDependance.ConcreteDependance1;
import com.example.dependance.demo.concreteDependance.ConcreteDependance2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass1 {
    @Autowired
    protected ConcreteDependance1 concreteDependance1;
    @Autowired
    protected ConcreteDependance2 concreteDependance2;
}
