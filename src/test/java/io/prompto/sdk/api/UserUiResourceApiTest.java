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
import io.prompto.sdk.model.UserListResponse;
import io.prompto.sdk.model.UserResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserUiResourceApi
 */
@Ignore
public class UserUiResourceApiTest {

    private final UserUiResourceApi api = new UserUiResourceApi("", "", "");

    
    /**
     * get
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsingGET4Test() throws ApiException {
        String userId = null;
        UserResponse response = api.getUsingGET4(userId);

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
    public void listUsingGET7Test() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String q = null;
        UserListResponse response = api.listUsingGET7(limit, offset, q);

        // TODO: test validations
    }
    
}
