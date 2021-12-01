readme
==Travail par Jean Khoury



Problème a implementer:
	- Recherche de plusieurs mots
		- La tochanisation et l'iteration s'effectue correctemement mais je n'arrive pas a fusioner les 2 listes
		- Du coup l'affichage sur l'écran est parfais avec un mot mais avec plusieurs ca marche pas parfaitement
		
Description des classes
	-Main: Celui ou commence le programme
	-Index: C'est la classe qui fait l'indexation
		|- IndexMotNode: Le stockage du mot avec une linkedlist de fichier et le mot
		|- IndexFileNode: Pour sauvegarder les fichier et la fréquence
		--> Pour trier la classe puis-ce qu'on trie des strings j'ai implémenter Comparable
	-InverseIndex: C'est la classe qui prend l'indexation et l'inverse
		|- inverseFileNode: Le stockage des file avec une linkedList de mots
		|- inverseMotNode: Le stockage des mots avec leurs fréquence
		--> Pour trier la classe puis-ce qu'on trie des strings j'ai implémenter Comparable
	-SearchIndex: L'algorithme de recherche
		|- ListResultat: On stores les files avec fréquences
	-Userinterface: L'interface utilisateur qui est lancé après l'indexation
	
	
Processus
	- L'utilisateur execute le programme, il est directmeent envoyé a l'interface d'indexation et choisie autant de fichier que cela lui
	plaisse pour traiter
	- Le traitement et effctué et les listes d'index sont affiché dans le console:
		Ex: 
		'''
			tchebycheff
			 ⎣18.txt                   1
			technique
			 ⎣7.txt                    1
			 ⎣c4.txt                   1
			 ⎣c9.txt                   3
		'''
	-Ensuite après le traitement l'utilisateur peut saisir une string et obtenir un résultats
	
Voilà 
	
	+++JEAN KHOURY+++
	