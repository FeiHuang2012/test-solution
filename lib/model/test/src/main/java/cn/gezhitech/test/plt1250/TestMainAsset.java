/*
 * Licensed Materials - Property of GEZHI
 * THIS MODULE IS "RESTRICTED MATERIALS OF GEZHI"
 * (c) Copyright GEZHI Inc. 2018 All Rights Reserved
 *
 * The source code for this program is not published or
 * otherwise divested of its trade secrets
 */

package cn.gezhitech.test.plt1250;

import cn.gezhitech.tidemsc.annotation.IndexHint;
import cn.gezhitech.tidemsc.annotation.Rule;
import cn.gezhitech.tidemsc.model.Pointer;
import cn.gezhitech.tidemsc.model.User;
import org.hyperledger.composer.annotation.Asset;
import org.hyperledger.composer.annotation.DataField;

@Asset
@Rule
@IndexHint(fieldName = "id")
public class TestMainAsset {

    @DataField(primary = true)
    public String id;

    @DataField(genericType = TestExtendedAsset.class)
    public Pointer<TestExtendedAsset> pointer;
}
