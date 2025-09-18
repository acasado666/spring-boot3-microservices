# Creating Spring Boot Microservices
This is the repository for the LinkedIn Learning course Creating Spring Boot Microservices. The full course is available from [LinkedIn Learning][lil-course-url].

![lil-thumbnail-url]

<p>If you’re looking for a practical introduction on creating Spring Boot microservices, this course was designed just for you. Join instructor and software developer Mary Ellen Bowman as she provides a skills-based, intermediate-level overview on how to create microservices using the power of Spring Boot 3. Along the way, discover several other related technologies and frameworks such as Spring Data, Spring Data REST, Spring MVC, JUnit, Mockito, SpringBootTest, Docker, MongoDB, Spring Security, and Spring Cloud.</p><p>This course is integrated with GitHub Codespaces, an instant cloud developer environment that offers all the functionality of your favorite IDE without the need for any local machine setup. With GitHub Codespaces, you can get hands-on practice from any machine, at any time-all while using a tool that you'll likely encounter in the workplace. Check out the "Using GitHub Codespaces with this course" video to learn how to get started.</p>

_See the readme file in the main branch for updated instructions and information._
## Instructions
This repository has branches for each of the videos in the course. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches are structured to correspond to the videos in the course. The naming convention is `CHAPTER#_MOVIE#`. As an example, the branch named `02_03` corresponds to the second chapter and the third video in that chapter. 
Some branches will have a beginning and an end state. These are marked with the letters `b` for "beginning" and `e` for "end". The `b` branch contains the code as it is at the beginning of the movie. The `e` branch contains the code as it is at the end of the movie. The `main` branch holds the final state of the code when in the course.

When switching from one exercise files branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"
## **Spring Data REST** employes **HAL** to associate resource objects to another.
**REATFul HATEOAS**

Whithout Controller, because of Spring Data REST dependency -> RESTful Uniformed Interface
RESTful API does more than expose endpoints over Http.

One of his constraints for a uniform interface is followed when hypermedia as an engine of 
application state, or HATEOAS, is employed. 

Spring Data REST employs hypermedia application language, or HAL standard to associate resource objects to one another.

It should also expose API's documentation and automatically provide navigation between resources. 
Hypermedia-driven APIs accomplish just that.

| Spring Data REST employs **HAL** to associate resource objects to  another. <br/>**RESTFul HATEOAS**                                                                                                              |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GET /tours/{id} -> returns the tour details<br/> `http://localhost:8080/tours/1`                                                                                                                                  |
| GET /tours -> returns a list of All tours <br/>`http://localhost:8080/tours`                                                                                                                                      |
| GET /tours/search -> returns a list of all tours<br/> `http://localhost:8080/tours/search` <br/>-> returns LINKS to a list of all tours for a difficulty<br/>-> returns LINKS of all tours for a tour packageCode |
| GET /tours/search/findByDifficulty{?diff} -> returns a list of all tours for a difficulty for a difficulty`http://localhost:8080/tours/search/findByDifficulty?diff=Easy`                                         | 
| GET /tours/search/findByTourPackageCode{?Code} -> returns a list of all tours for a tour package <br/>`http://localhost:8080/tours/search/findByTourPackageCode?code=BC`}`                                        
| GET /tours/{id}/tourPackages/{id} -> returns for tour 1, tour package BC "Backpack Cal"<br/> `http://localhost:8080/tours/1/tourPackage/BC`                                                                       |                                                                                                                                                                                              |
| GET /tours/{id}/tourPackages/search/findByName <br/>`http://localhost:8080/tours/1/tourPackage/findByName`                                                                                                        |
| GET /tours/{id}/tourPackages/search/findByName{?name} <br/>`http://localhost:8080/tours/1/tourPackage/findByName?name=Backpack%20Cal`                                                                             |

 ### Instructor

Mary Ellen Bowman
25+ years of full life-cycle software development experience

                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/mary-ellen-bowman?u=104).



[0]: # (Replace these placeholder URLs with actual course URLs)

[lil-course-url]: https://www.linkedin.com/learning/creating-spring-boot-microservices
[lil-thumbnail-url]: https://media.licdn.com/dms/image/D560DAQGP3Ee7Z9yRyA/learning-public-crop_675_1200/0/1717532201518?e=2147483647&v=beta&t=WIL8JOcMr2LPb7eXi0pmZ3qXoxRTvso6V-sQfHIpV-I

