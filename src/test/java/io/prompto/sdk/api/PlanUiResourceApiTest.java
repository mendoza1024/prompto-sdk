/*
 * Abella
 * Partner API application
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.prompto.sdk.api;

import io.prompto.sdk.api.ApiException;
import io.prompto.sdk.model.PlanListResponse;
import io.prompto.sdk.model.PlanRequest;
import io.prompto.sdk.model.PlanResponse;
import io.prompto.sdk.model.RestResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlanUiResourceApi
 */
@Ignore
public class PlanUiResourceApiTest {

    private final PlanUiResourceApi api = new PlanUiResourceApi("", "", "");

    
    /**
     * delete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUsingPOST2Test() throws ApiException {
        String planId = null;
        RestResponse response = api.deleteUsingPOST2(planId);

        // TODO: test validations
    }
    
    /**
     * get
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsingGET3Test() throws ApiException {
        String planId = null;
        PlanResponse response = api.getUsingGET3(planId);

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUsingGET5Test() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String q = null;
        PlanListResponse response = api.listUsingGET5(limit, offset, q);

        // TODO: test validations
    }
    
    /**
     * publish
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void publishUsingPOST1Test() throws ApiException {
        String planId = null;
        PlanResponse response = api.publishUsingPOST1(planId);

        // TODO: test validations
    }
    
    /**
     * save
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveUsingPOST1Test() throws ApiException {
        PlanRequest planReq = null;
        PlanResponse response = api.saveUsingPOST1(planReq);

        // TODO: test validations
    }
    
    /**
     * unpublish
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unpublishUsingPOST2Test() throws ApiException {
        String planId = null;
        PlanResponse response = api.unpublishUsingPOST2(planId);

        // TODO: test validations
    }
    
    /**
     * update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUsingPOST2Test() throws ApiException {
        String planId = null;
        PlanRequest planReq = null;
        PlanResponse response = api.updateUsingPOST2(planId, planReq);

        // TODO: test validations
    }
    
}
