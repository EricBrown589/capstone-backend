# Random Character Backend

## Project Description

Are you an author, artist, or like playing games but you can't think of an idea for a character? Then this is the right application for you! This application generates a random character for you to use in whatever you need!

[Project frontend](https://github.com/EricBrown589/capstone-frontend)

### Technologies Used 

![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

### User Stories 

- As a user I should be able to create a random character

- As a user I should be able to see my character

- As a user I should be able to create a new character

### Diagrams 

#### Planning ERD

<img src="https://github.com/EricBrown589/capstone-frontend/blob/master/planning/diagrams/Capstone-ERD.PNG" width="600">

#### Final ERD 

<img src="https://github.com/EricBrown589/capstone-frontend/blob/master/planning/diagrams/capstoneerd.PNG" width="600">


### Endpoints

[Postman documentation](https://documenter.getpostman.com/view/18490995/UVeFPSb9)

| HTTP Method | Endpoint                                             | Functionality                                                            
|-------------|------------------------------------------------------|---------------
| GET         | /race                                                | Gets a random race  
| GET         | /attribute                                           | Gets a random attribute   
| GET         | /weapon                                              | Gets a random weapon  
| GET         | /armor                                               | Gets a random armor 
| POST        | /create-character                                    | Creates a random character 
| GET         | /character                                           | Gets all characters 
| DELETE      | /delete-character                                    | Deletes a character 

### Future development 

- Add more data to the current models to have more options to randomly generate from.

- Add more models and endpoints to have more aspects to a character.
