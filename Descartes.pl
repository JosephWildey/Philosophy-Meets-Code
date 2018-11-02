/*This was Descartes famous line, "I think therefore I am" expressed in Prolog. 
Along the way it turned into something resembling Aristolean philosophy. */

/*First, we establish the facts. I think, I am human, and I exist. */
exist(me).
human(me).
think(me).
/*Then we set up the rule, I am a human if I exist and I think. */
human(me):- think(me), exist(me).
