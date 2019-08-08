/*
 * Licensed Materials - Property of GEZHI
 * THIS MODULE IS "RESTRICTED MATERIALS OF GEZHI"
 * (c) Copyright GEZHI Inc. 2018 All Rights Reserved
 *
 * The source code for this program is not published or
 * otherwise divested of its trade secrets
 */

package cn.gezhitech.test.plt1469;

import cn.gezhitech.tidemsc.annotation.IndexHint;
import cn.gezhitech.tidemsc.annotation.Rule;
import cn.gezhitech.tidemsc.model.Pointer;
import org.hyperledger.composer.annotation.Asset;
import org.hyperledger.composer.annotation.DataField;
import org.hyperledger.composer.annotation.Enum;

@Asset
@Rule
@IndexHint(fieldName = "id")
public class TestSchemaUpdateAsset {

    @DataField(primary = true)
    private String id;

    // to remove
    @DataField
    private String firstname;

    // to add mandatoryString: lastname

    // to rename
    @DataField
    private Integer age;

    // to transform
    @DataField(genericType = TestSchemaAsset1.class)
    private Pointer<TestSchemaAsset1> pointer;

    // to transform from string to enum
    @DataField
    private String shouldBeEnum;

    // to add value in enum
    @Enum
    public enum ExampleEnum{
        enum1, enum2
    }
}