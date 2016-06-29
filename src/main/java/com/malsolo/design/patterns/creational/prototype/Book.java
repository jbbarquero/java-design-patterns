package com.malsolo.design.patterns.creational.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Book extends Item {

    private String isbn;

}
