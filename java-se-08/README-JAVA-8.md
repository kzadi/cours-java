# **1. Interface fonctionnelle**

Java 8 a introduit @FunctionalInterface, une interface qui a exactement une méthode abstraite. 
Le compilateur traitera toutes les interfaces répondant à la définition d'une interface fonctionnelle comme une interface fonctionnelle, cela
signifie que l'annotation @FunctionalInterface est facultative.

Voyons les six interfaces de fonctions de base dans le package "_com.j4ltechnologies.formation.java.interfacefonctionnelle_".

`Function - 
BiFunction - 
BinaryOperator - 
UnaryOperator - 
Predicate - 
BiPredicate - 
Consumer - 
BiConsumer - 
Supplier`

# **2. Expressions Lambda et références de méthodes**
Java 8 a introduit les expressions lambda pour fournir l'implémentation de la méthode abstraite d' une interface fonctionnelle.

# **3. Streams**
Java 8 propose l'API Stream pour mettre en oeuvre une approche de la programmation fonctionnelle sachant que Java est et reste un langage orienté objet.
Les éléments traités par le Stream sont fournis par une source qui peut être de différents types :

`Une collection - 
Un tableau - 
Un flux I/O - 
Une chaîne de caractères - 
...`