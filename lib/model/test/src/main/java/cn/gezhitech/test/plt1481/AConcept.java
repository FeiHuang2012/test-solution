/*
 * Licensed Materials - Property of GEZHI
 * THIS MODULE IS "RESTRICTED MATERIALS OF GEZHI"
 * (c) Copyright GEZHI Inc. 2018 All Rights Reserved
 *
 * The source code for this program is not published or
 * otherwise divested of its trade secrets
 */

package cn.gezhitech.test.plt1481;

import cn.gezhitech.tidemsc.model.Pointer;
import cn.gezhitech.tidemsc.model.User;
import org.hyperledger.composer.annotation.Concept;
import org.hyperledger.composer.annotation.DataField;

@Concept
public class AConcept {

    @DataField
    public String stringType;

    @DataField
    public long longType;

    @DataField(genericType = User.class)
    public Pointer<User> pointerType;

    @DataField
    public User embeddedField;

    @DataField(optional = true, genericType = User.class)
    public Pointer<User> optionalField;

    public String stringType() {
        return stringType;
    }

    public AConcept stringType(String stringType) {
        this.stringType = stringType;
        return this;
    }

    public long longType() {
        return longType;
    }

    public AConcept longType(long longType) {
        this.longType = longType;
        return this;
    }

    public Pointer<User> pointerType() {
        return pointerType;
    }

    public AConcept pointerType(Pointer<User> pointerType) {
        this.pointerType = pointerType;
        return this;
    }

    public User embeddedField() {
        return embeddedField;
    }

    public AConcept embeddedField(User embedded) {
        this.embeddedField = embedded;
        return this;
    }

    public Pointer<User> optionalField() {
        return optionalField;
    }

    public AConcept optionalField(Pointer<User> optional) {
        this.optionalField = optional;
        return this;
    }

    @Override
    public String toString() {
        return "AConcept{"
                + "stringType='" + stringType + '\''
                + ", longType=" + longType
                + ", pointerType=" + pointerType
                + ", embeddedField=" + embeddedField
                + ", optionalField=" + optionalField
                + '}';
    }
}
