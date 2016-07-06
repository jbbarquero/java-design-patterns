package com.malsolo.design.patterns.structural.adapter;

import java.util.List;

public interface Principal {

    String getId();

    String getName();

    String getEmail();

    List<String> getAuthorities();

}
