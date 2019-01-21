# shopify-2019-intern-challenge
Barebones of an online marketplace

Built using Spring and Java

Prerequisites
- [jdk 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)+
- [Maven](https://maven.apache.org/install.html)

[swagger documentation can be found here](https://app.swaggerhub.com/apis/mathew-jackson/mathew-jackson-shopify-products/1.0.0)

API:
- api/products - Get entire product catalog  
- api/products/in-stock - Get all products in stock  
- api/products/id/{id} - find product by id  
- api/products/title/{title} - find product by title  
- api/products/priceRange/{priceFrom}/{priceTo}find products in price range  
- api/products/purchase/{id} purchase an item by id  

Setup:
clone repo
- mvn clean install

run unit tests:
- mvn test
