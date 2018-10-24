/*This is just psuedocode detailing Kant's imperatives.
  However it resembles Java and may even compile in Java.
  I haven't tried. I'm just having fun.*/

public class Imperatives {
  
  /*This may be a simplification of Kant's views, but this would be determining
  whether or not the majority of a sample size of 100 people find something
  appropriate or not. If the majority of these 100 people do then it would be
  considered acceptable. Otherwise it is not acceptable. The truth values should be read as:
  (True) it is morally acceptable or (False) it is morally acceptable.*/
  
  public Boolean UniversalLaw (Boolean situation, String action) {
    char[] expectations = new char[100];
    for(int i = 0; i < 100; ++i) {
      if(char[i] == 'y' || char[i] == 'Y')
        ++moralCounter;
        else
        --moralCounter;
     }
    if(situation == true && moralCounter >= 50)
      return true;
      else
      return false;
  }
  
  /*This would be your response in a given scenario.  */
  public String chosenAction() {
    return "someAction";
  }
  
  /*This is saying if an event is occurring then trigger your response to the event. */
  public String HypotheticalImperative(Boolean predecent) {
    if(predecent == true) {
      return chosenAction();
    }
  }
  
  /*This is an infinite loop that does your thing in the above scenario regardless
  of scenario.*/
  public String Categorical Imperative() {
    do {
      return chosenAction();
      } while(true);
   }
   
   /*Because I wrote this in Java. */
   public static void main(String[] args) {}
      
}
