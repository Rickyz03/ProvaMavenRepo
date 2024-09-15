[![Build](https://github.com/Rickyz03/ProvaMavenRepo/actions/workflows/build.yml/badge.svg)](https://github.com/Rickyz03/ProvaMavenRepo/actions/workflows/build.yml)
![checkstyle](.github/ReadmeBadges/checkstyle-result.svg)
![coverage](.github/ReadmeBadges/jacoco.svg)
![branches_coverage](.github/ReadmeBadges/branches.svg)
[![Coverage Status](https://coveralls.io/repos/github/Rickyz03/ProvaMavenRepo/badge.svg?branch=master)](https://coveralls.io/github/Rickyz03/ProvaMavenRepo?branch=master)

# Prova Maven Repo
In questo repo faccio le mie prove con roba legata allo sviluppo, imparata prevalentemente in MTSS.  

L'ultima prova che ho fatto riguarda la possibilità di ottenere la code coverage su SonarCloud.
Il comando per ottenerla è:

```bash
mvn clean verify sonar:sonar -Pcoverage
```

Tuttavia, ciò espone un token nel pom.xml, quindi vedi tu se vuoi utilizzarla o meno.

Inoltre, la prima volta che lo fai ti va a creare un progetto SonarCloud nuovo (chiamato "maven-example-1"), a prescindere che tu ne avessi già creato uno o meno.
Dalla seconda volta in poi, nell'Overview appare 0% come percentuale, e la vera percentuale apparirà solo sotto nella sezione Main Branch. Strano ma vero

Inoltre, quando ho attivato il Quality Gate sul nuovo progetto SonarCloud trovato automaticamente, si è tolta la coverage, purtroppo. E devi eliminare il progetto da SonarCloud e ricrearlo per riaverla. 

Insomma, il tentativo è ancora acerbo, dunque per favore non usarlo in progetti seri.
