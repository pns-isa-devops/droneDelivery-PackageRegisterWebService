# j2eSubmodules-PackageRegisterWebService

# Vue d'ensemble
 Cet composant fait partie du projet `projet-isa-devops-20-team-d-20 ` nommé **`Drone Delivery`**. Il représente toute la partie de **`gestion d'enregisterment`** d'un **`colis`** du système.
 Il embarque avec lui : 
 * _Maven_ embarquer toute ces technologies ensemble _"plus facilement"_.

## Informations sur le dépôt
  * La branche `master` ( branche par défaut ) repésente la dernière version de `PackageRegisterWebService`.
  
 
  ## Composant information
*  Ce composant sert d'intermédiare entre les utilisateurs et le système. Il est le **`point d'entré`** dans le système exposant les fonctions suivantes :
   * _**`registerPackage`**_ : enregistre un colis
   * _**`findPackage`**_ recherche un colis.
*  Ces fonctions une fois appelées font appel au composant `PackageRegisterComponent` qui va se charger d'effectuer l'action
demandée dans le sytème. 
Ainsi donc le composant `PackageRegisterWebService` dépend de `PackageRegisterComponent`
*  Le composant est  `@Stateless` donc ne conserve aucune valeur d'une action à une autre
