package com.malsolo.design.patterns.structural.adapter;

import java.util.List;

public class LdapToPrincipalAdapter implements Principal {

    private final LdapInfo ldapInfo;

    public LdapToPrincipalAdapter(LdapInfo ldapInfo) {
        this.ldapInfo = ldapInfo;
    }

    @Override
    public String getId() {
        return this.ldapInfo.getCn();
    }

    @Override
    public String getName() {
        return this.ldapInfo.getGivenName() + " " + this.ldapInfo.getSurname();
    }

    @Override
    public String getEmail() {
        return this.ldapInfo.getMail();
    }

    @Override
    public List<String> getAuthorities() {
        return this.ldapInfo.getGroupList();
    }

}
