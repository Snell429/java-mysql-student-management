# 🎓 Java MySQL Student Management

## 📌 Description

Ce projet est une application Java utilisant Spring Boot et MySQL.
Il permet de gérer des étudiants, leurs classes et leurs cours via des relations entre plusieurs tables.

---

## 🛠 Technologies utilisées

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Thymeleaf
* Eclipse

---

## 🗄 Structure de la base de données

* student
* class
* course
* enrollment

---

## 🔗 Relations

* Un étudiant appartient à une classe
* Un étudiant peut suivre plusieurs cours
* La table enrollment relie les étudiants aux cours
* enrollment contient :

  * start_date
  * end_date

---

## 🚀 Fonctionnalités

* Afficher tous les étudiants
* Afficher les étudiants avec leur classe
* Afficher les informations complètes (classe + cours + dates)
* Jointure entre plusieurs tables (student, class, course, enrollment)
* Connexion à MySQL
* Affichage web avec Thymeleaf

---

## ▶ Comment lancer le projet

1. Créer la base de données MySQL (school_db)
2. Configurer le fichier application.properties
3. Lancer Application.java

### 🔗 Accès à l'application

* Liste des étudiants :
  http://localhost:7777/students

* Informations complètes (avec cours et dates) :
  http://localhost:7777/full

---

## 📈 Améliorations possibles

* Ajouter un formulaire pour ajouter un étudiant
* Ajouter suppression/modification
* Sécuriser l’application (Spring Security)
