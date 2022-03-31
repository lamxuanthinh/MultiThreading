
package lab_01;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentModify {
     public static List<Student> findAll(){
         List<Student> studentslist = new ArrayList<>();
         FileInputStream fos = null;
         ObjectInputStream os = null;
         try {
             fos = new FileInputStream("student.dat");
             os = new ObjectInputStream(fos);
             studentslist = (List<Student>) os.readObject();
         } catch (FileNotFoundException ex) {
             Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException | ClassNotFoundException ex) {
             Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             if(fos != null){
                 try {
                     fos.close();
                 } catch (IOException ex) {
                     Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
             if(os != null){
                 try {
                     os.close();
                 } catch (IOException ex) {
                     Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
         }
         return studentslist;
     }
     
     public static void writeFile(List<Student> studenlist){
         FileOutputStream fos = null;
        ObjectOutputStream os = null;
        try {
            fos = new FileOutputStream("student.dat",true);
            os = new ObjectOutputStream(fos);
            os.writeObject(studenlist);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(os != null){
                try {
                    os.close();
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
     }
     
     public static void SortList(List<Student> studentlist){
            Collections.sort(studentlist, new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                return (int) (t1.getGba() - t2.getGba());
            }
        });
     }
}
