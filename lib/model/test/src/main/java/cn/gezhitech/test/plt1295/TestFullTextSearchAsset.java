/*
 * Licensed Materials - Property of GEZHI
 * THIS MODULE IS "RESTRICTED MATERIALS OF GEZHI"
 * (c) Copyright GEZHI Inc. 2018 All Rights Reserved
 *
 * The source code for this program is not published or
 * otherwise divested of its trade secrets
 */

package cn.gezhitech.test.plt1295;

import cn.gezhitech.tidemsc.annotation.IndexHint;
import cn.gezhitech.tidemsc.annotation.Rule;
import cn.gezhitech.tidemsc.model.AccessControlRule.Operation;
import org.hyperledger.composer.annotation.Asset;
import org.hyperledger.composer.annotation.DataField;

@Asset

@Rule(description = "All can read",
        operation = Operation.ALL)
@IndexHint(fieldName = "id")
@IndexHint(fieldName = "firstName", fullText = true)
@IndexHint(fieldName = "lastName", fullText = true)
public class TestFullTextSearchAsset {
    @DataField(primary = true)
    String id;
    @DataField
    String firstName;
    @DataField
    String lastName;
    @DataField(optional = true)
    Integer year;
}
