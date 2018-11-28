
[![Build Status](https://travis-ci.org/veritaserg/DeveloperHibernateServletJSP.svg?branch=master)](https://travis-ci.org/veritaserg/DeveloperHibernateServletJSP)


Необходимо реализовать веб приложение, которое взаимодействует с БД.

Сущности:
- Skill (id, name)
- Account (id, accountData)
- Developer(id, firstName, lastName, specialty, Set<Skill> skills, Account account).

Требования:
-  CRUD операции для каждой из сущностей
- Придерживаться подхода MVC
- Для сборки проекта использовать Maven
- Для взаимодействия с БД - Hibernate
- Для конфигурирования Hibernate - аннотации
- Инициализация БД должна быть реализована с помощью liquibase
- Взаимодействие с пользователем необходимо реализовать с помощью Servlets + JSP
- Интегрировать Travis CI
- Рабочее приложение должно быть развернуто на Heroku (https://heroku.com/), в качестве БД необходимо использовать ClearDB (плагин внутри heroku)