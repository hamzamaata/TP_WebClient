# TP_WebClients
Description des Projets

1. Projet EJB (Entreprise JavaBeans) - Serveur d'Application (Nom du Projet: EJBTP3)


Entités :

Student (Étudiant) :

Représente les informations d'un étudiant, telles que son prénom, nom, numéro de téléphone, et une relation avec un utilisateur.

User (Utilisateur) :

Stocke les informations d'authentification, avec des champs tels que le login, le mot de passe, et des relations avec un étudiant et un rôle.
Role (Rôle) :

Définit le rôle d'un utilisateur dans le système, lié à un utilisateur.
Filiere (Filière) :

Représente une filière académique avec un code, un nom, et une relation avec une liste d'étudiants.

Services EJB :

StudentService :

Gère les opérations liées aux étudiants, telles que la récupération de la liste des étudiants.
RoleService :

Gère les opérations liées aux rôles, telles que la récupération de la liste des rôles.
FiliereService :

Gère les opérations liées aux filières, telles que la récupération de la liste des filières.
Exposition en tant que services web :

Les services EJB peuvent être exposés en tant que services web, facilitant l'intégration avec d'autres applications.



2. Projet Client Java (Nom du Projet: clientG4)

Le projet clientG4 constitue l'interface Java permettant d'interagir avec le serveur EJB. Ce client est responsable d'invoquer les services exposés par le serveur et de traiter les résultats.

Classes de Test :

TestStudent :

Inclut des tests pour vérifier les opérations du service StudentService.
TestRole :
Contient des tests pour valider les opérations du service RoleService.
TestFiliere :
Comprend des tests pour assurer le bon fonctionnement du service FiliereService.
Interaction avec le Serveur :

Utilise le contexte JNDI pour localiser et invoquer les services EJB du serveur.
Facilite les tests unitaires pour s'assurer du bon fonctionnement des services.


3. Projet Client Web (Nom du Projet: clientWebG4)

Le projet clientWebG4 sert d'interface utilisateur basée sur le web, offrant une expérience conviviale pour interagir avec les services exposés par le serveur EJB. Cette application web est développée en utilisant des technologies Java EE, notamment JSP (JavaServer Pages) et des servlets, assurant une communication efficace avec le serveur.

Pages JSP :

role.jsp :
Cette page affiche la liste des rôles récupérée à partir du serveur en utilisant des balises JSTL (JavaServer Pages Standard Tag Library).
filiere.jsp :
Présente la liste des filières, également récupérée depuis le serveur et affichée de manière dynamique dans un tableau HTML.
student.jsp :
Affiche la liste des étudiants avec leurs détails, obtenus à partir des services exposés par le serveur EJB.
Servlets correspondantes pour récupérer les données :

RoleServlet :
Agit en tant que contrôleur pour récupérer les données du service RoleService sur le serveur et les transmet à la page role.jsp.
FiliereServlet :
Gère la récupération des données de FiliereService et les transmet à la page filiere.jsp.
StudentServlet :
Récupère les informations d'étudiants en utilisant le service StudentService et les présente dans la page student.jsp.
Communication avec le Serveur EJB :

Utilise les mécanismes JNDI pour localiser les services EJB sur le serveur.
Les servlets traitent les requêtes HTTP, invoquent les méthodes appropriées des services EJB, et transmettent les résultats aux pages JSP correspondantes.
Intégration de JSTL pour l'affichage dynamique :

Utilise des balises JSTL dans les pages JSP pour itérer sur les listes de données récupérées depuis le serveur, assurant une présentation dynamique et cohérente.
