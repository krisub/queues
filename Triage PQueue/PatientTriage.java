/*
Name: Krithika Subramanian
Period:3
Date turned in: 12/2
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

/**
 *  The PatientTriage class manages the order patients are served 
 *  at a hospital when resources are limited. The class maintains 
 *  a Priority Queue of Patient objects.
 * 
 *  @author Jonathan Yee, Tracy Ishman, Ann Horton
 *  Date: 4/19/2020
 */
public class PatientTriage
{
  /* List of patient waiting to be processed*/
  private Queue<Patient> patientList;
  
  /**
   */ 
  public PatientTriage()
  {
    // Complete this method...
    patientList = new PriorityQueue<Patient>();
  }
  
  /**
   */ 
  public void addPatient(Patient p)
  {
    // Complete this method...
    patientList.add(p);

  }
  
  /**
   */
  public Patient processPatient()
  {
    // Complete this method...
    if(patientList.size() <= 0) return null;
    return patientList.remove();
  }

  /**
   * This method returns the list of patients on the triage list
   * in the order of priority.
   * 
   * POST CONDITION: 
   * All patients in patients list at the start of the method are still in
   * the patientList AND the heap still maintains the order.
   * Note: While the heap order is maintained, the locations of patients in the
   * heap might change after this method is completed.
   * 
   * @return the list of patients on the triage list in the order of priority.
   */
  public String toString()
  {
    // Complete this method...
    String ret = "";
    Queue<Patient> copy = new PriorityQueue<Patient>();
    while(patientList.size() > 0) {
      Patient x = patientList.remove();
      copy.add(x);
      ret += x.toString() + "\n";
    }
    patientList = copy;
    return ret;
  }
  
  /**
   * This method returns the heap of Patients in its raw form.
   * 
   * @return the heap of Patients in its raw form
   */ 
  public Queue<Patient> getPQueue()
  {
    return patientList;
  }
  
}
