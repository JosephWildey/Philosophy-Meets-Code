/*This is Descartes famous line, "I think therefore I am" expressed in Prolog. */

/*First, we establish the facts. I think and I exist. */
exist(me).
think(me).
/*Then we set up the rule, if it is true I think then it it is true I exist. */
exist(me):- think(me).
