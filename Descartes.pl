/*This was Descartes famous line, "I think therefore I am" expressed in Prolog. 
Along the way it turned into something resembling Aristolean philosophy. I think
there is now some Thomas Aquinas stuff in here too. */

/*First, we establish the facts. I think, I am human, and I exist. We must also establish the fact that God exists now. 
Furthermore, by definition God is a perfect being.
Also, for funsies capitalize "God" or "Me." */
exist(me).
exist(god).
human(me).
think(me).
perfectBeingExists(god).
/*Then we set up the rule, I am a human if I exist and I think. */
human(me):- think(me), exist(me).
/* If I am a human then something greater than me must have created me. Therefore God must exist. */
exist(god):- human(me).
/*If God exists then we must reason that a perfect being exists, because that is the definition of God. */
perfectBeingExists(god):- exist(god).
