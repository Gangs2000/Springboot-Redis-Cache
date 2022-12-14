# Springboot-Redis-Cache
Spring boot Redis Cache will reduce round trip load between database and client application. Instead of fetching data from database everytime, Redis will fetch data from Cache manager so response of application will be faster.

Spring boot redis can be used for many purpose.

It can be used as Database, Cache System and Message broker communication system. In this project I have used Redis as Cache system which reduces round trip between database and client application. So performance will be automatically boosted up.

If we have large amount of data in database, Application may response too slow because every request hits the database to fetch the data from DB. Redis comes into picture to solve this load issue. If Redis cache is implemented in application, only the first request will hit the database and fetch result from DB and store it in cache system, After first request rest of the requests will be loaded from cache system, so the performace of application will become faster.

**@Cacheable, @Caching, @CachePut, @CacheEvict these annotations are packed in spring boot data redis dependency.**

1. @Cacheable is used to cache the data after particular method finishes its task, result of method will be stored as cache data.
2. @CachePut is used to add/update value in cache system
3. @CacheEvict is used to delete particular data from cache system
4. @Caching can used to perform combination of any of these annotations, lets conside you want to add new data into cache at the same time evict some data from cache then @Caching can be used.

**Without Redis it takes about 320 ms to show the response ( Data loaded directly from database )**

![Screenshot from 2022-09-19 18-04-11](https://user-images.githubusercontent.com/112934529/191026200-d6c105fe-b9d1-47de-9ff0-ba1300783c8e.png)

**With Redis it just takes about 9ms to show the response ( Data loaded from Redis Server )**

![Screenshot from 2022-09-19 18-04-44](https://user-images.githubusercontent.com/112934529/191026657-ca29abe2-2f76-4980-80ef-92732ae7520d.png)


