# Back-End

# Endpoints

## Plants

**/api/plants - GET** - This will return the user's current list of plants.


**/api/plants - POST** - Adds a plant to the user's list of plants. 


*What this endpoints requires:*  `name` , `species` , `h2ofrequency` , `plantimage`



**/api/plants/{plantId} - PUT -** Updates the current plant based off ID.


*What this endpoints requires:*  `name` , `species` , `h2ofrequency` , `plantimage`

**/api/plants/{plantID} - DELETE -** Deletes a plant based off ID.



## Users 

**/api/users/user - GET -** This returns the user's data.



**/api/users/{userId} - PUT -** This will update the user's data.


*What this endpoint requires:* `username` and `password`.


**/api/users/{userID} - DELETE -** This will delete the user based off ID.




## Authentication

**/api/auth/register - POST -** Singing up.


*What this endpoint requires:* `username` and `password`.


*You are also able to send a `phonenumber` to this endpoint, but this isn't required.*

**/api/auth/login - POST -** Logging in.

*What this endpoint requires:* `username` and `password`.


**/api/auth/logout - GET -** Logging out.


## Deployment

I will add the link for you guys to use whenever I deploy!

## Built With

* **Java** - The language used to build the API
* [Maven](https://maven.apache.org/) - Dependency Management
* **Spring** - The framework used to build the API


## Authors

* **Teagan Keith** - *API* - [GitHub](https://github.com/teagankeith)





