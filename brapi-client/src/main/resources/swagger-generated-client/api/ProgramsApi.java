/*
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a>  <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ProgramsResponse;
import io.swagger.client.model.ProgramsResponse1;
import io.swagger.client.model.ProgramsSearchRequest;
import io.swagger.client.model.ProgramsSearchRequestDeprecated;
import io.swagger.client.model.SuccessfulSearchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProgramsApi {
    private ApiClient apiClient;

    public ProgramsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProgramsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for programsGet
     * @param commonCropName Filter by the common crop name. Exact match. (optional)
     * @param programName Filter by program name. Exact match. (optional)
     * @param abbreviation Filter by program abbreviation. Exact match. (optional)
     * @param page Which result page is requested. The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call programsGetCall(String commonCropName, String programName, String abbreviation, Integer page, Integer pageSize, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/programs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (commonCropName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("commonCropName", commonCropName));
        if (programName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("programName", programName));
        if (abbreviation != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("abbreviation", abbreviation));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call programsGetValidateBeforeCall(String commonCropName, String programName, String abbreviation, Integer page, Integer pageSize, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = programsGetCall(commonCropName, programName, abbreviation, page, pageSize, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the breeding Programs
     * Call to retrieve a list of programs.
     * @param commonCropName Filter by the common crop name. Exact match. (optional)
     * @param programName Filter by program name. Exact match. (optional)
     * @param abbreviation Filter by program abbreviation. Exact match. (optional)
     * @param page Which result page is requested. The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @return ProgramsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProgramsResponse programsGet(String commonCropName, String programName, String abbreviation, Integer page, Integer pageSize, String authorization) throws ApiException {
        ApiResponse<ProgramsResponse> resp = programsGetWithHttpInfo(commonCropName, programName, abbreviation, page, pageSize, authorization);
        return resp.getData();
    }

    /**
     * Get the breeding Programs
     * Call to retrieve a list of programs.
     * @param commonCropName Filter by the common crop name. Exact match. (optional)
     * @param programName Filter by program name. Exact match. (optional)
     * @param abbreviation Filter by program abbreviation. Exact match. (optional)
     * @param page Which result page is requested. The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @return ApiResponse&lt;ProgramsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProgramsResponse> programsGetWithHttpInfo(String commonCropName, String programName, String abbreviation, Integer page, Integer pageSize, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = programsGetValidateBeforeCall(commonCropName, programName, abbreviation, page, pageSize, authorization, null, null);
        Type localVarReturnType = new TypeToken<ProgramsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the breeding Programs (asynchronously)
     * Call to retrieve a list of programs.
     * @param commonCropName Filter by the common crop name. Exact match. (optional)
     * @param programName Filter by program name. Exact match. (optional)
     * @param abbreviation Filter by program abbreviation. Exact match. (optional)
     * @param page Which result page is requested. The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call programsGetAsync(String commonCropName, String programName, String abbreviation, Integer page, Integer pageSize, String authorization, final ApiCallback<ProgramsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = programsGetValidateBeforeCall(commonCropName, programName, abbreviation, page, pageSize, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProgramsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for programsSearchPost
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call programsSearchPostCall(ProgramsSearchRequestDeprecated body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/programs-search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call programsSearchPostValidateBeforeCall(ProgramsSearchRequestDeprecated body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = programsSearchPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Search Programs
     * DEPRECATED in v1.3 - see /search/programs
     * @param body  (optional)
     * @return ProgramsResponse1
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProgramsResponse1 programsSearchPost(ProgramsSearchRequestDeprecated body) throws ApiException {
        ApiResponse<ProgramsResponse1> resp = programsSearchPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Search Programs
     * DEPRECATED in v1.3 - see /search/programs
     * @param body  (optional)
     * @return ApiResponse&lt;ProgramsResponse1&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProgramsResponse1> programsSearchPostWithHttpInfo(ProgramsSearchRequestDeprecated body) throws ApiException {
        com.squareup.okhttp.Call call = programsSearchPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<ProgramsResponse1>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Programs (asynchronously)
     * DEPRECATED in v1.3 - see /search/programs
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call programsSearchPostAsync(ProgramsSearchRequestDeprecated body, final ApiCallback<ProgramsResponse1> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = programsSearchPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProgramsResponse1>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchProgramsPost
     * @param body  (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchProgramsPostCall(ProgramsSearchRequest body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/search/programs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchProgramsPostValidateBeforeCall(ProgramsSearchRequest body, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = searchProgramsPostCall(body, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Submit a search request for Programs
     * Advanced searching for the programs resource. See Search Services for additional implementation details.
     * @param body  (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @return SuccessfulSearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SuccessfulSearchResponse searchProgramsPost(ProgramsSearchRequest body, String authorization) throws ApiException {
        ApiResponse<SuccessfulSearchResponse> resp = searchProgramsPostWithHttpInfo(body, authorization);
        return resp.getData();
    }

    /**
     * Submit a search request for Programs
     * Advanced searching for the programs resource. See Search Services for additional implementation details.
     * @param body  (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @return ApiResponse&lt;SuccessfulSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SuccessfulSearchResponse> searchProgramsPostWithHttpInfo(ProgramsSearchRequest body, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = searchProgramsPostValidateBeforeCall(body, authorization, null, null);
        Type localVarReturnType = new TypeToken<SuccessfulSearchResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Submit a search request for Programs (asynchronously)
     * Advanced searching for the programs resource. See Search Services for additional implementation details.
     * @param body  (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchProgramsPostAsync(ProgramsSearchRequest body, String authorization, final ApiCallback<SuccessfulSearchResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchProgramsPostValidateBeforeCall(body, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SuccessfulSearchResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchProgramsSearchResultsDbIdGet
     * @param searchResultsDbId Permanent unique identifier which references the search results (required)
     * @param page Which result page is requested. The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchProgramsSearchResultsDbIdGetCall(String searchResultsDbId, Integer page, Integer pageSize, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/programs/{searchResultsDbId}"
            .replaceAll("\\{" + "searchResultsDbId" + "\\}", apiClient.escapeString(searchResultsDbId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchProgramsSearchResultsDbIdGetValidateBeforeCall(String searchResultsDbId, Integer page, Integer pageSize, String authorization, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'searchResultsDbId' is set
        if (searchResultsDbId == null) {
            throw new ApiException("Missing the required parameter 'searchResultsDbId' when calling searchProgramsSearchResultsDbIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = searchProgramsSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize, authorization, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the results of a Programs search request
     * Advanced searching for the programs resource. See Search Services for additional implementation details.
     * @param searchResultsDbId Permanent unique identifier which references the search results (required)
     * @param page Which result page is requested. The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @return ProgramsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProgramsResponse searchProgramsSearchResultsDbIdGet(String searchResultsDbId, Integer page, Integer pageSize, String authorization) throws ApiException {
        ApiResponse<ProgramsResponse> resp = searchProgramsSearchResultsDbIdGetWithHttpInfo(searchResultsDbId, page, pageSize, authorization);
        return resp.getData();
    }

    /**
     * Get the results of a Programs search request
     * Advanced searching for the programs resource. See Search Services for additional implementation details.
     * @param searchResultsDbId Permanent unique identifier which references the search results (required)
     * @param page Which result page is requested. The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @return ApiResponse&lt;ProgramsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProgramsResponse> searchProgramsSearchResultsDbIdGetWithHttpInfo(String searchResultsDbId, Integer page, Integer pageSize, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = searchProgramsSearchResultsDbIdGetValidateBeforeCall(searchResultsDbId, page, pageSize, authorization, null, null);
        Type localVarReturnType = new TypeToken<ProgramsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the results of a Programs search request (asynchronously)
     * Advanced searching for the programs resource. See Search Services for additional implementation details.
     * @param searchResultsDbId Permanent unique identifier which references the search results (required)
     * @param page Which result page is requested. The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @param authorization HTTP HEADER - Token used for Authorization   &lt;strong&gt;Bearer {token_string} &lt;/strong&gt; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchProgramsSearchResultsDbIdGetAsync(String searchResultsDbId, Integer page, Integer pageSize, String authorization, final ApiCallback<ProgramsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchProgramsSearchResultsDbIdGetValidateBeforeCall(searchResultsDbId, page, pageSize, authorization, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProgramsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
