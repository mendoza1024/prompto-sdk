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
import io.prompto.sdk.model.AdvanceLoanPaymentRequest;
import io.prompto.sdk.model.AmortizationDetailsResponse;
import io.prompto.sdk.model.CreatePersonalLoanRequest;
import io.prompto.sdk.model.PersonalLoanListResponse;
import io.prompto.sdk.model.PersonalLoanResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstallmentsUiResourceApi
 */
@Ignore
public class InstallmentsUiResourceApiTest {

    private final InstallmentsUiResourceApi api = new InstallmentsUiResourceApi("", "", "");

    
    /**
     * advancePayment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void advancePaymentUsingPOSTTest() throws ApiException {
        String id = null;
        AdvanceLoanPaymentRequest request = null;
        PersonalLoanResponse response = api.advancePaymentUsingPOST(id, request);

        // TODO: test validations
    }
    
    /**
     * create
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsingPOSTTest() throws ApiException {
        CreatePersonalLoanRequest request = null;
        PersonalLoanResponse response = api.createUsingPOST(request);

        // TODO: test validations
    }
    
    /**
     * getAmortization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAmortizationUsingGETTest() throws ApiException {
        String id = null;
        AmortizationDetailsResponse response = api.getAmortizationUsingGET(id);

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
    public void getUsingGET1Test() throws ApiException {
        String id = null;
        PersonalLoanResponse response = api.getUsingGET1(id);

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
    public void listUsingGET2Test() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String q = null;
        PersonalLoanListResponse response = api.listUsingGET2(limit, offset, q);

        // TODO: test validations
    }
    
}
