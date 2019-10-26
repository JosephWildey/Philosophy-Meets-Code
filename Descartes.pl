/*This was Descartes famous line, "I think therefore I am" expressed in Prolog. 
Along the way it turned into something resembling St. Anselm's Ontological Argument with some stuff borrowed from Aristotle. I think
there is now some Thomas Aquinas stuff in here too. */

/*First, we establish the facts. I think, I am human, and I exist. We must also establish the fact that God exists now. 
Furthermore, by definition God is a perfect being. Furthermore, I will also include the concept of perfect, which I believe
Descartes said must have come from God or some such as proof that a evil genius could not be God or God could not be evil.
Since only a being lesser than God would attempt to deceive him into believing God exists or something.
Also, for funsies capitalize "God" or "Me." */
exist(me).
exist(god).
think(me).
perfectBeingExists(god).
conceptOfPerfect(god).

/*Then we set up the rule, I am a human if I exist and I think. */
exist(me):- think(me).

/* If I am a human then something greater than me must have created me, and since humans are not perfect
and a deceptive higher being would still be imperfect, the concept of perfection must have come from
God if it exists. Therefore God must exist. */
exist(god):- conceptOfPerfect(god).

/*If God exists then we must reason that a perfect being exists, because that is the definition of God. */
perfectBeingExists(god):- exist(god).
