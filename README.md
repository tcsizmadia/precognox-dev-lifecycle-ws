# Development Lifecycle Mini-Workshop for Student Visitors

This project demonstrates how we manage our development lifecycle at Precognox. Naturally, it is an over-simplified scenario, but it should give you a good idea about the steps we take to ensure the quality of our software.

We tried to make the code easy to understand, everyone could jump in and start working on it. We also kept the fun-factor in mind, so you can enjoy the process.

## The Scenario

We are building a tool which can detect if a given emoji is a fruit or not. This is the business requirement and even though we have two very short list of fruits and non-fruits. We should focus on these lists and do not need to cover all the possibilities.

What should we do if we receive an emoji which is not in any of the lists? Good question! :+1: Our tool should return _"I don't know"_ in this case.

### List of Fruits

| Emoji       | Name      |
|------------ |---------- |
| :apple:     | Apple     |
| :banana:    | Banana    |
| :cherries:  | Cherries  |
| :grapes:    | Grapes    |
| :pineapple: | Pineapple |

### List of Non-Fruits

| Emoji           | Name      |
|-----------------|---------- |
| :hamburger:     | Hamburger |
| :pizza:         | Pizza     |
| :cake:          | Cake      |
| :bread:         | Bread     |
| :chocolate_bar: | Chocolate |

That's it! Let's get started, shall we? :rocket:

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You need to have Java and Maven installed on your machine.

### Installing

Clone the repository to your local machine.

```
git clone https://github.com/tcsizmadia/precognox-dev-lifecycle-ws
```

Navigate to the project directory.

```
cd precognox-dev-lifecycle-ws
```

Build the project.

```
mvn clean install
```

That should fail, because we have no implementation yet - remember? So, let's skip the tests for now.

```
mvn clean install -DskipTests
```

This will create a runnable - but pretty useless - jar file in the target directory.

### Running the Application

You can run the application using the following command.

```
java -jar target/fruit-detector-1.0-SNAPSHOT.jar
```

### Running the Tests

That will be the most used command during our workshop.

```
mvn test
```

## Built With

* [Java](https://www.oracle.com/java/)
* [Maven](https://maven.apache.org/)
* [Junit5](https://junit.org/junit5/)

## Authors

* **Tamas Csizmadia**

## License

This project is licensed under the [MIT License](LICENSE.md).