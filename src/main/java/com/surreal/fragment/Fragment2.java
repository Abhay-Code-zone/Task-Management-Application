package com.surreal.fragment;

import org.springframework.stereotype.Component;

@Component
public class Fragment2 {
    
    private final String narrative = "Fragment 2 of the distributed narrative";
    
    public String getNarrative() {
        return narrative;
    }
}