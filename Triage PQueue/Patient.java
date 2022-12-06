/*
Name: Krithika Subramanian
Period:3
Date turned in: 12/2
*/

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 *  The Patient class repsents an individual patient at a hospital,
 *  maintaining whether or not the patient needs a bed, ventilator,
 *  or surgery.  A Patient has an name and age.
 * 
 *  @author Jonathan Yee, Tracy Ishman, Ann Horton
 *  Date: 4/19/2020
 */
public class Patient implements Comparable<Patient>
{
  /** name of the Patient, resource needs, and closest hospital */
  private String name;
  private int age;
  private boolean needsBed;
  private boolean needsVentilator;
  private boolean needsSurgery;
  
  /** Creates a new hospital with the given number of resources
   *  @param name the name of the hospital
   *  @param needsBed true if patient needs hospital bed 
   *  @param needsVentilator true if patient needs ventilator 
   *  @param hospital the closest hospital to this patient
   */
  public Patient(String name, int age, boolean needsBed, boolean needsVentilator, boolean needsSurgery)
  {
    this.name = name;
    this.age = age;
    this.needsBed = needsBed;
    this.needsVentilator = needsVentilator;
    this.needsSurgery = needsSurgery;
  }
  
  /** Retrieves the name of the patient
   *  @return name of the patient
   */
  public String getName()
  {
    return name;
  }
  
  /** Retrieves the age of the patient
   *  @return age of the patient
   */
  public int getAge()
  {
    return age;
  }
  
  /** Retrieves whether or not patient needs a bed for in-patient services
   *  @return true if patient requires a bed; false otherwise
   */
  public boolean needsBed()
  {
    return needsBed;
  }
  
  /** Retrieves whether or not patient needs a ventilator
   *  @return true if patient requires a ventilator; false otherwise
   */
  public boolean needsVentilator()
  {
    return needsVentilator;
  }

  /** Retrieves whether or not patient needs surgery
   *  @return true if patient requires surgery; false otherwise
   */
  public boolean needsSurgery()
  {
    return needsSurgery;
  }
  
  /** Determines whether or not this patient is the same as other
   *  @param other the other patient to check
   *  @return true if this and other are the same; false otherwise
   */
  @Override
  public boolean equals(Object other)
  {
    if (other == null || !(other instanceof Patient))
      return false;
    
    Patient otherPat = (Patient) other;
    return name.equals(otherPat.name) &&
           age == otherPat.age &&
           needsBed == otherPat.needsBed &&
           needsVentilator == otherPat.needsVentilator &&
           needsSurgery == otherPat.needsSurgery;
  }
  
  /** Determines order of this and other
   *  @param other the other patient to compare against
   *  @return 0 if this.equals(other), < 1 if this < other, > 1 if this > other
   */
  @Override
  public int compareTo(Patient other)
  {
    // Complete the compareTo method based on the priority order of the lab.

    if(this.equals(other)) return 0;


    if(needsSurgery || other.needsSurgery) {

      if(needsSurgery && other.needsSurgery)
        return name.compareTo(other.name);
      else if(needsSurgery) return -1;
      else return 1;
      
    } else if((needsVentilator && age > 50)
              || (other.needsVentilator && other.age > 50)) {

      if((needsVentilator && age > 50)
              && (other.needsVentilator && other.age > 50))
        return name.compareTo(other.name);
      else if(needsVentilator && age > 50) return -1;
      else return 1;
      
    } else if((needsVentilator && age < 12)
              || (other.needsVentilator && other.age < 12)) {

      if((needsVentilator && age < 12)
              && (other.needsVentilator && other.age < 12))
        return name.compareTo(other.name);
      else if(needsVentilator && age < 12) return -1;
      else return 1;
      
    } else if((needsVentilator)
              || (other.needsVentilator)) {

      if((needsVentilator)
              && (other.needsVentilator))
        return name.compareTo(other.name);
      else if(needsVentilator) return -1;
      else return 1;
      
    } else if(needsBed || other.needsBed) {

      if(needsBed && other.needsBed)
        return name.compareTo(other.name);
      else if(needsBed) return -1;
      else return 1;
      
    }

    return name.compareTo(other.name);
  }
  
  /** Calculates and returns a hashcode for this patient
   *  @return hashcode
   */
  @Override 
  public int hashCode()
  {
    return name.hashCode();
  }
  
  /** Builds and returns this patient's information 
   *  @return string containing the patient data
   */
  @Override
  public String toString()
  {
    return String.format("%s %d BED-%b VENT-%b SURGERY-%b",
      name, age, needsBed, needsVentilator, needsSurgery);
  }
}
