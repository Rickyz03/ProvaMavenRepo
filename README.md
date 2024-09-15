[![Build](https://github.com/Rickyz03/ProvaMavenRepo/actions/workflows/build.yml/badge.svg)](https://github.com/Rickyz03/ProvaMavenRepo/actions/workflows/build.yml)
![checkstyle](.github/ReadmeBadges/checkstyle-result.svg)
![coverage](.github/ReadmeBadges/jacoco.svg)
![branches_coverage](.github/ReadmeBadges/branches.svg)
[![Coverage Status](https://coveralls.io/repos/github/Rickyz03/ProvaMavenRepo/badge.svg?branch=master)](https://coveralls.io/github/Rickyz03/ProvaMavenRepo?branch=master)
#Prova Maven Repo
In questo repo faccio le mie prove con roba legata allo sviluppo, imparata prevalentemente in MTSS.  

L'ultima prova che ho fatto riguarda la possibilità di ottenere la code coverage su SonarCloud.
Il comando per ottenerla è:

'''bash
mvn clean verify sonar:sonar -Pcoverage
'''

Tuttavia, ciò espone un token nel pom.xml, quindi vedi tu se vuoi utilizzarla o meno
