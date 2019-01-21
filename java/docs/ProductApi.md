# ProductApi

All URIs are relative to *https://virtserver.swaggerhub.com/mathew-jackson/mathew-jackson-shopify-products/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableProducts**](ProductApi.md#getAvailableProducts) | **GET** api/products/in-stock | Get all products in stock
[**getProductById**](ProductApi.md#getProductById) | **GET** api/products/id/{id} | Find product by ID
[**getProductByTitle**](ProductApi.md#getProductByTitle) | **GET** api/products/title/{title} | Find product by title
[**getProducts**](ProductApi.md#getProducts) | **GET** api/products | Get entire product catalog
[**getProductsInPriceRange**](ProductApi.md#getProductsInPriceRange) | **GET** api/products/priceRange/{priceFrom}/{priceTo} | Find products in price range
[**purchaseProductById**](ProductApi.md#purchaseProductById) | **GET** api/products/purchase/{id} | purchase an item by id


<a name="getAvailableProducts"></a>
# **getAvailableProducts**
> getAvailableProducts()

Get all products in stock

Returns all products who&#39;se inventory is greater than 0

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
try {
    apiInstance.getAvailableProducts();
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getAvailableProducts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductById"></a>
# **getProductById**
> Product getProductById(id)

Find product by ID

Returns a single product

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
ERRORUNKNOWN id = new ERRORUNKNOWN(); // ERRORUNKNOWN | ID of product to return
try {
    Product result = apiInstance.getProductById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getProductById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**ERRORUNKNOWN**](.md)| ID of product to return |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductByTitle"></a>
# **getProductByTitle**
> getProductByTitle(title)

Find product by title

Returns all products containing the inputed title

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
ERRORUNKNOWN title = new ERRORUNKNOWN(); // ERRORUNKNOWN | title of product to return
try {
    apiInstance.getProductByTitle(title);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getProductByTitle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | [**ERRORUNKNOWN**](.md)| title of product to return |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProducts"></a>
# **getProducts**
> getProducts()

Get entire product catalog

Returns entire product catalog

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
try {
    apiInstance.getProducts();
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getProducts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProductsInPriceRange"></a>
# **getProductsInPriceRange**
> getProductsInPriceRange(priceFrom, priceTo)

Find products in price range

Returns all products within indicated price range

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
ERRORUNKNOWN priceFrom = new ERRORUNKNOWN(); // ERRORUNKNOWN | Price floor
ERRORUNKNOWN priceTo = new ERRORUNKNOWN(); // ERRORUNKNOWN | Price ceiling
try {
    apiInstance.getProductsInPriceRange(priceFrom, priceTo);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#getProductsInPriceRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **priceFrom** | [**ERRORUNKNOWN**](.md)| Price floor |
 **priceTo** | [**ERRORUNKNOWN**](.md)| Price ceiling |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="purchaseProductById"></a>
# **purchaseProductById**
> Product purchaseProductById(id)

purchase an item by id

Decrements the quantity in stock of a product by 1 and returns updated product

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductApi;


ProductApi apiInstance = new ProductApi();
ERRORUNKNOWN id = new ERRORUNKNOWN(); // ERRORUNKNOWN | ID of product to purchase
try {
    Product result = apiInstance.purchaseProductById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#purchaseProductById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**ERRORUNKNOWN**](.md)| ID of product to purchase |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

