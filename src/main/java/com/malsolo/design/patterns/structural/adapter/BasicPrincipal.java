package com.malsolo.design.patterns.structural.adapter;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicPrincipal implements Principal {

    private String id;

    private String name;

    private String email;

    private List<String> authorities;

}
