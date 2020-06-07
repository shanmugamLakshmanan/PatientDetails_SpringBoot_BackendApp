/*
 * package com.patientdetails.com;
 * 
 * import java.util.ArrayList; import java.util.Collection; import
 * java.util.Collections; import java.util.Comparator; import java.util.List;
 * import java.util.Optional; import java.util.stream.Stream;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * 
 * 
 * @Service public class PatientService2 {
 * 
 * 
 * private static List<Patient> pList =new ArrayList<Patient>(); private static
 * int id=0;
 * 
 * static {
 * 
 * pList.add(new Patient(++id , "shanmuga","Papanasam", 25)); pList.add(new
 * Patient(++id , "Manisha","Papanasam", 25)); pList.add(new Patient(++id ,
 * "Yogendra","Papanasam", 25)); pList.add(new Patient(++id ,
 * "Srinivasan","Papanasam", 25)); pList.add(new Patient(++id ,
 * "vasantah","Papanasam", 25)); pList.add(new Patient(++id ,
 * "Dhanam","Papanasam", 25));
 * 
 * 
 * 
 * }
 * 
 * 
 * public List<Patient> findAll() {
 * pList.sort(Comparator.comparing(Patient::getId)); return pList;
 * 
 * } public Patient update(Patient pat) {
 * 
 * boolean value=pList.stream().filter((i->i.getId()==pat.getId())).findFirst().
 * isPresent(); if(value) { System.out.println(value); delete(pat.getId());
 * pList.add(pat); } else { System.out.println("nm"+ value); pat.setId(++id);
 * System.out.println(pat.getId()); pList.add(pat);
 * 
 * }
 * 
 * return pat;
 * 
 * 
 * }
 * 
 * 
 * 
 * public Patient findpatientbyId(int id) {
 * System.out.println("entert inside findpatient"); Optional<Patient>
 * p=pList.stream().filter(l->l.getId()==id).findFirst(); Patient patientdet =
 * null; System.out.println(p.get()); if(p.get() != null) { patientdet=p.get();
 * System.out.println("entert inside findpatient 3"+patientdet.getName()); }
 * return patientdet ; }
 * 
 * 
 * public List<Patient> delete(int id) {
 * System.out.println("eneter inside delete2"); Patient p=findpatientbyId(id);
 * System.out.println("hello"+p.getName()); if(p!=null) {
 * System.out.println("eneter inside delete3"); pList.remove(p);
 * System.out.println("deleted"); return pList;
 * 
 * } return null;
 * 
 * 
 * 
 * 
 * } }
 * 
 * 
 */