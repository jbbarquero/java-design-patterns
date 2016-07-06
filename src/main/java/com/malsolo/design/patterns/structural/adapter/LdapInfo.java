package com.malsolo.design.patterns.structural.adapter;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LdapInfo {

    private String cn, surname, givenName, mail;

    private List<String> groupList;

}
