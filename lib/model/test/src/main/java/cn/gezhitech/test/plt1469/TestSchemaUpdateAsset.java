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
import cn.gezhitech.tidemsc.annotation.Rename;
import cn.gezhitech.tidemsc.annotation.Rule;
import cn.gezhitech.tidemsc.annotation.Transform;
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

    // to add previous mandatoryString which was deleted
    @DataField(defaultValue = "hello")
    private String firstName;

    // to add mandatoryString: lastname
    @DataField(defaultValue = "li")
    private String lastName;

    // to rename
    @Rename(from = "myAge")
    @DataField
    private Integer age;

    @DataField
    private ShouldBeEnum shouldBeEnum;

    @DataField
    private ExampleEnum addEnum;

    // to transform
    /*
    @Transform(expression = "function(input) { return input.pointer.replace('TestSchemaAsset1', 'TestSchemaAsset2')}")
    @DataField(genericType = TestSchemaAsset2.class)
    private Pointer<TestSchemaAsset2> pointer;
    */

}
