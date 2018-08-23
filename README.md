### Simple CRUD app using SpringBoot, SpringMVC, SpringData

### Project structure

src/main/java
  com.hassan.locationcrud
    controller
      LocationController.java
    entities
      Location.java
    repos
      LocationRepository
    service
      LocationService.java
      LocationServiceImpl.java
    LocationCRUDApplication.java
src/main/resources
src/test/java
src/main/webapp
  WEB-INF
  views
    createLocation.jsp
    displayLocation.jsp
    editLocation.jsp
pom.xml


- controller.LocationController.java : It handles all incoming requests and maps to target method defined via @RequestMapping.
- entities.Location.java : A model class for Location
- repos.LocationRepository.java : (DataAccess Layer, DAO), since we are using Spring Data we just need to implement CRUDRepository or JPARepository.
- service.LocationService : All the Business Logic/ Operations related to Location entity.
