
<p align="center">
  <img width="180" src="https://cucumber.io/img/logo.svg">
</p>

<h1 align="center">🥒 Selenium Java Cucumber BDD Framework</h1>

<p align="center">
☕ Java • 🌐 Selenium • 🥒 Cucumber • 🧪 JUnit • 📦 Maven
</p>

# 🚀 Selenium Java Cucumber BDD Framework

Framework d'automatisation des tests fonctionnels développé avec :

- ☕ Java
- 🌐 Selenium WebDriver
- 🥒 Cucumber BDD
- 🧪 JUnit
- 📦 Maven

Le framework permet d'automatiser des scénarios fonctionnels Web en utilisant l'approche BDD (Behavior Driven Development).

---

# 🧠 Approche BDD

BDD (Behavior Driven Development) est une approche qui permet de décrire le comportement attendu de l'application à travers des scénarios métier compréhensibles par tous.

### Exemple

```gherkin
Feature: Login

Scenario: Successful login

Given User is on login page
When User enters valid credentials
Then User is redirected to dashboard
```

Les fichiers feature sont stockés sous :

```text
src/test/resources/features
```

---

# 🏗️ Architecture POM (Page Object Model)

Le framework suit le design pattern Page Object Model.

Chaque page de l'application possède :

- ses éléments Web
- ses méthodes d'interaction
- sa logique métier

### Avantages

✅ Réutilisation du code

✅ Maintenance simplifiée

✅ Séparation entre tests et éléments UI

---

# 📂 Structure du projet

```text
src
├── test
│   ├── java
│   │    ├── runners
│   │    ├── stepDefinitions
│   │    ├── pageObjects
│   │    ├── utils
│   │    
│   │
│   └── resources
│        ├── features
│        ├── configs
│        └── testData
```

---

# ⚙️ Prérequis

- ☕ Java 17+
- 📦 Maven 3.9+
- 💻 Eclipse ou IntelliJ IDEA
- 🌍 Chrome / Firefox / Edge

Vérification :

```bash
java -version
mvn -version
```

---

# 🥒 Installation du plugin Cucumber (Eclipse)

1. Ouvrir Eclipse
2. Help → Eclipse Marketplace
3. Rechercher :

```text
Cucumber Eclipse Plugin
```

4. Installer le plugin
5. Redémarrer Eclipse

---

# 🏷️ Utilisation des Tags

Les tags permettent d'organiser l'exécution des scénarios.

### Exemple

```gherkin
@smoke
Scenario: Login successful
```

### Exécuter un tag spécifique

```bash
mvn test -Dcucumber.filter.tags="@smoke"
```

Exemples de tags :

- @smoke
- @regression
- @sanity
- @ui

---

# ▶️ Exécution des tests

### Tous les tests

```bash
mvn test
```

### Tag spécifique

```bash
mvn test -Dcucumber.filter.tags="@regression"
```

### Depuis Eclipse

- Clic droit sur le Runner
- Run As → JUnit Test

---

# ⚡ Selenium Manager (2026)

Depuis Selenium 4.6+, Selenium Manager gère automatiquement les drivers.

✅ Aucun téléchargement manuel de ChromeDriver

✅ Aucun WebDriverManager nécessaire

✅ Aucun System.setProperty() nécessaire

Exemple :

```java
WebDriver driver = new ChromeDriver();
```

---

# 🔧 Configuration

Les fichiers de configuration sont situés sous :

```text
src/test/resources/configs
```

Exemple :

```properties
base.url=https://application-url.com
browser=chrome
username=testuser
password=password
```

---

# 📊 Reporting

Après exécution, le rapport est généré sous :

```text
target/cucumber-report.html
```

---

# 🛠️ Stack Technique

- ☕ Java
- 🌐 Selenium WebDriver
- 🥒 Cucumber
- 🧪 JUnit
- 📦 Maven
- 🏗️ POM (Page Object Model)
- 📊 Cucumber Reports

---

# 👩‍💻 Auteur

**Ghada Trabelsi**  
**Tech Lead Test Automation**
