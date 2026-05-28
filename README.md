# TP Android — Stockage des données et fichiers en Java

## 📌 Objectif du TP

Ce TP a pour objectif de découvrir les différentes techniques de stockage des données sous Android.

L’application permet de manipuler :

- Les préférences partagées (`SharedPreferences`)
- Les préférences sécurisées (`EncryptedSharedPreferences`)
- Le stockage interne
- Le stockage externe spécifique à l’application
- Les fichiers JSON
- Le cache Android

---

# 🛠️ Technologies utilisées

- Java
- Android Studio
- Android SDK
- SharedPreferences
- EncryptedSharedPreferences
- JSON
- Stockage interne / externe
- Cache Android

---

# 📁 Structure du projet

```bash
lab14/
│
├── app/
│   └── src/main/
│       ├── java/com/example/lab14/
│       │
│       ├── MainActivity.java
│       │
│       ├── model/
│       │   └── Student.java
│       │
│       ├── prefs/
│       │   ├── AppPrefs.java
│       │   └── SecurePrefs.java
│       │
│       ├── files/
│       │   ├── InternalTextStore.java
│       │   └── StudentsJsonStore.java
│       │
│       ├── cache/
│       │   └── CacheStore.java
│       │
│       ├── external/
│       │   └── ExternalAppFilesStore.java
│       │
│       └── res/
│           └── layout/
│               └── activity_main.xml
```

---

# 📱 Fonctionnalités de l’application

L’application démontre plusieurs méthodes de stockage Android.

## 1️⃣ SharedPreferences

Permet de sauvegarder :

- nom utilisateur
- langue
- thème

Fonctions :

- enregistrer
- charger
- supprimer

Exemple :

```java
AppPrefs.save(context, name, lang, theme, true);
```

---

## 2️⃣ Stockage sécurisé

L’application utilise :

```java
EncryptedSharedPreferences
```

pour stocker des informations sensibles.

Exemple :

```java
SecurePrefs.saveToken(context, token);
```

Fonctionnalités :

- enregistrer un token
- lire un token
- supprimer les données

---

## 3️⃣ Stockage interne

Permet :

- écrire un fichier texte
- lire un fichier texte
- supprimer un fichier

Classe :

```java
InternalTextStore.java
```

Exemple :

```java
writeUtf8()
readUtf8()
delete()
```

---

## 4️⃣ Stockage JSON

Les étudiants sont stockés sous forme JSON.

Classe :

```java
StudentsJsonStore.java
```

Structure utilisée :

```json
[
 {
   "id":1,
   "name":"Ali",
   "age":20
 }
]
```

Fonctionnalités :

- sauvegarder une liste
- lire les étudiants
- supprimer le fichier JSON

---

## 5️⃣ Cache Android

Le cache permet :

- écrire temporairement des données
- lire les données
- vider le cache

Classe :

```java
CacheStore.java
```

Exemple :

```java
write()
read()
purge()
```

---

## 6️⃣ Stockage externe spécifique à l’application

Permet :

- créer des fichiers externes
- lire les fichiers
- supprimer les fichiers

Classe :

```java
ExternalAppFilesStore.java
```

Exemple :

```java
write()
read()
delete()
```

---

# 🧠 Explication des classes principales

---

## 📄 MainActivity.java

Cette activité :

- récupère les données saisies
- appelle les différentes méthodes de stockage
- affiche les résultats

Elle sert de point central de l’application.

---

## 📄 Student.java

Classe modèle représentant un étudiant.

Attributs :

```java
id
name
age
```

---

## 📄 AppPrefs.java

Responsable de :

- sauvegarder les préférences
- lire les préférences
- supprimer les préférences

Utilise :

```java
SharedPreferences
```

---

## 📄 SecurePrefs.java

Responsable du stockage sécurisé.

Utilise :

```java
EncryptedSharedPreferences
```

Permet :

- chiffrement automatique
- protection des données sensibles

---

## 📄 InternalTextStore.java

Manipule :

- fichiers internes
- lecture/écriture UTF-8

---

## 📄 StudentsJsonStore.java

Transforme :

```text
Objets Java
↓
JSON
↓
Fichier
```

Puis effectue l’opération inverse.

---

## 📄 CacheStore.java

Responsable :

- stockage temporaire
- nettoyage du cache

---

## 📄 ExternalAppFilesStore.java

Permet d’utiliser :

```text
Android/data/package_name/files/
```

pour stocker les fichiers.

---

# ▶️ Exécution du projet

## Étapes

### 1️⃣ Ouvrir Android Studio

### 2️⃣ Importer le projet

```text
File → Open
```

### 3️⃣ Synchroniser Gradle

### 4️⃣ Exécuter

```text
Run ▶
```

---

# 🧪 Tests à réaliser

## Test 1 — SharedPreferences

- saisir un nom
- choisir une langue
- enregistrer
- fermer l’application
- vérifier la persistance

---

## Test 2 — Stockage sécurisé

- saisir un token
- enregistrer
- recharger
- vérifier la récupération

---

## Test 3 — Fichier interne

- créer un fichier texte
- lire le contenu
- supprimer le fichier

---

## Test 4 — JSON

- sauvegarder une liste d’étudiants
- recharger la liste
- vérifier les données

---

## Test 5 — Cache

- écrire dans le cache
- lire
- vider le cache

---

## Test 6 — Stockage externe

- créer un fichier externe
- vérifier son existence
- lire le contenu

---

# 📚 Concepts appris

À travers ce TP, nous avons appris :

- SharedPreferences
- EncryptedSharedPreferences
- stockage interne Android
- stockage externe Android
- manipulation JSON
- cache Android
- sécurité des données

---

# ✅ Conclusion

Ce TP permet de comprendre les principaux mécanismes de stockage Android.

L’application montre :

- comment sauvegarder des préférences
- comment sécuriser les données sensibles
- comment manipuler des fichiers
- comment gérer des données JSON
- comment utiliser le cache et le stockage externe

Ces concepts sont indispensables dans la majorité des applications Android modernes.

---

https://github.com/user-attachments/assets/b970a6b6-ea30-47b1-b33c-5560c480bcd9
