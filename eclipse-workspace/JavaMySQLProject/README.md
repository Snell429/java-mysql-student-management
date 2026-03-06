# Java MySQL Student Management

## 📌 Description

Ce projet est une application Java connectée à une base de données MySQL à l'aide de JDBC.
Il permet de démontrer l'utilisation d'une base de données relationnelle avec Java ainsi que l'utilisation de requêtes SQL avec des jointures (JOIN).

---

## 🛠 Technologies utilisées

* Java
* MySQL
* JDBC
* Eclipse

---

## 🗄 Structure de la base de données

La base de données contient les tables suivantes :

* **student**
* **class**
* **course**
* **enrollment**

---

## 🚀 Fonctionnalités

L'application permet de :

* Récupérer tous les étudiants avec leur classe
* Récupérer un étudiant par son identifiant
* Ajouter un nouvel étudiant dans la base de données
* Filtrer les étudiants par classe
* Afficher les cours suivis par les étudiants

---

## 🧩 Structure du projet

```
src/
 ├── Student.java
 ├── DatabaseConnection.java
 ├── StudentDAO.java
 └── Main.java
```

---

## ▶ Comment exécuter le projet

1. Créer la base de données dans MySQL
2. Configurer la connexion dans `DatabaseConnection.java`
3. Lancer `Main.java` depuis Eclipse
