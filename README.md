[![Build](https://github.com/Rickyz03/ProvaMavenRepo/actions/workflows/build.yml/badge.svg)](https://github.com/Rickyz03/ProvaMavenRepo/actions/workflows/build.yml)
![checkstyle](.github/ReadmeBadges/checkstyle-result.svg)
![coverage](.github/ReadmeBadges/jacoco.svg)
![branches_coverage](.github/ReadmeBadges/branches.svg)
[![Coverage Status](https://coveralls.io/repos/github/Rickyz03/ProvaMavenRepo/badge.svg?branch=master)](https://coveralls.io/github/Rickyz03/ProvaMavenRepo?branch=master)

# Prova Maven Repo
In questa repo faccio le mie prove con tecnologie legate allo sviluppo, imparate prevalentemente a MTSS.  

L'ultima prova che ho fatto riguarda la possibilità di visualizzare la code coverage di Jacoco su SonarCloud.
Il comando per ottenerla è:

```bash
mvn clean verify sonar:sonar -Pcoverage
```

Tuttavia, ciò espone un token nel pom.xml (e lo stesso SonarCloud te la espone come falla di sicurezza), quindi vedi tu se vuoi utilizzarla o meno.

Inoltre, la prima volta che lo fai ti va a creare un progetto SonarCloud nuovo (chiamato "maven-example-1"), a prescindere che tu ne avessi già creato uno o meno.  
Dalla seconda volta in poi, nell'Overview appare 0% come percentuale, e la vera percentuale apparirà solo sotto nella sezione Main Branch. Strano ma vero.

Inoltre, quando ho attivato il Quality Gate sul nuovo progetto SonarCloud, si è tolta la coverage, purtroppo, nel senso che ti riappare il consiglio di leggere la guida per capire come attivarla. Devi eliminare il progetto da SonarCloud e rieseguire il su scritto comando per riaverla (in un nuovo "maven-example-1"). 

La guida consigliata da SonarCloud (per progetti a modulo singolo, come il mio) diceva di fare così per prelevare il report di code coverage di Jacoco e visualizzarlo in SonarCloud. Se poi c'è un altro modo per farlo, scoperto magari da qualche blogger, non ho tempo bè voglia di andarlo a cercare.

Insomma, il tentativo è ancora acerbo, dunque, per favore, almeno per adesso, non provare a visualizzare la Jacoco code coverage in SonarCloud in progetti seri.

Inoltre, per favore usa almeno JUnit 5 nel prossimo pom.xml, perchè JUnit 4.12 ha una vulnerability (segnalata dall'IDE IntelliJ Idea), e perchè ChatGPT, quando le chiedi di scrivere dei test di unità in Java, in automatico usa JUnit 5 (e sennò dovresti ogni volta ricordarle di riscrivere i test per adattarli a JUnit 4).
