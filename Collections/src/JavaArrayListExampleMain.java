import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;
 
public class JavaArrayListExampleMain {
 /*
  * @author : kiran
  */
 public static void main(String[] args) {
  ArrayList<String> employeeNameList = new ArrayList<>();
  employeeNameList.add("John");
  employeeNameList.add("Ankit");
  employeeNameList.add("Rohan");
  employeeNameList.add("Amit");
  
  ArrayList<String> otherList = new ArrayList<>();
  
  otherList.add("abc");
  otherList.add("xyz");
  
  // Adding otherList to employeeList
  employeeNameList.addAll(otherList);
  
  System.out.println("Employee list:");
 
  for (String empName : employeeNameList) {
 
   System.out.println(empName);
 
  }
 
 }
}