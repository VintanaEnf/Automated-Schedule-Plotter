
package SchedulePlotter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class DataManager {
    public int Total_Teacher;
    public int Total_Room;
    public int Total_Subject;
    private String Save_Program_Dir = "Saves\\";
    private String Save_Teacher_Dir = "Saves\\";
    private String Save_Room_Dir = "Saves\\";
    private String Save_Subject_Dir = "Saves\\";
    public DataManager(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Save_Program_Dir+"info.maindata"));
            String line;
            Total_Teacher = Integer.valueOf(reader.readLine());
            Total_Room = Integer.valueOf(reader.readLine());
            Total_Subject = Integer.valueOf(reader.readLine());
            reader.close();
            
            System.out.println("Successfully read the program save file.");
        } catch (FileNotFoundException ex) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(Save_Program_Dir+"info.maindata"));
                writer.write(""+Total_Teacher);
                writer.write("\n"+Total_Room);
                writer.write("\n"+Total_Subject);
                writer.close();
                System.out.println("No program save file yet. The save file has been successfully created.");
            } catch (IOException ex1) {
                Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Insert_Teacher(String Name, String Priority, String Sub1, String Sub2, boolean enabled){
        Total_Teacher++;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Save_Teacher_Dir+Total_Teacher+".teacher"));
            writer.write(""+Name);
            writer.write("\n"+Priority);
            writer.write("\n"+Sub1);
            writer.write("\n"+Sub2);
            writer.write("\n"+enabled);
            writer.close();
            
            writer = new BufferedWriter(new FileWriter(Save_Program_Dir+"info.maindata"));
                writer.write(""+Total_Teacher);
                writer.write("\n"+Total_Room);
                writer.write("\n"+Total_Subject);
                writer.close();
                
            
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Insert_Room(String Name, int[] SubjectAddresses){
        
    }
    
    public void Insert_Subject(String Name, String Code, int Units, int[] UnitsDivision){
        Total_Subject++;
        try {
            BufferedWriter a = new BufferedWriter(new FileWriter(Save_Subject_Dir+Total_Subject+".subject"));
            a.write(""+Name);
            a.write("\n"+Code);
            a.write("\n"+Units);
            for(int i=0; i < UnitsDivision.length; i++){
               a.write("\n"+UnitsDivision[i]);
            }
            a.close();
            
            a = new BufferedWriter(new FileWriter(Save_Program_Dir+"info.maindata"));
            
                a.write(""+Total_Teacher);
                a.write("\n"+Total_Room);
                a.write("\n"+Total_Subject);
                a.close();
                
            
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Object[][] Read_Teacher() throws FileNotFoundException, IOException{
        Object[][] ArrayA = new Object[Total_Teacher][5];
        
        for (int i = 0; i < Total_Teacher; i++) {
            
        BufferedReader reader = new BufferedReader(new FileReader(Save_Teacher_Dir + (i+1) + ".teacher"));
        ArrayA[i][0] = reader.readLine();
        ArrayA[i][1] = reader.readLine();
        ArrayA[i][2] = reader.readLine();
        ArrayA[i][3] = reader.readLine();
        ArrayA[i][4] = reader.readLine();
        reader.close();
        
        
            for (int j = 0; j < 4; j++) {
                System.out.println(ArrayA[i][j]);
            }
            System.out.println(String.valueOf(ArrayA[i][4]));
        }
        
        return ArrayA;
    }
    
    public Object[][] Read_Subject() throws FileNotFoundException, IOException{
        Object[][] subjectArray = new Object[Total_Subject][4];
        
        for (int i = 0; i < Total_Subject; i++) {
            
            BufferedReader reader = new BufferedReader(new FileReader(Save_Subject_Dir + (i+1) + ".subject"));
            subjectArray[i][0] = reader.readLine();
            subjectArray[i][1] = reader.readLine();
            subjectArray[i][2] = reader.readLine();
            
            Object a;
            int[] temporary = new int[10];
            int counter = 0;
            
            while((a = reader.readLine()) != null){
                temporary[counter] = Integer.parseInt(a.toString());
                System.out.println("Temporary number ctr: " + temporary[counter]);
                counter++;
            }
            
            int[] unitsDiv = new int[counter];
            for (int j = 0; j < unitsDiv.length; j++) {
                unitsDiv[j] = temporary[j];
            }
            
            subjectArray[i][3] = unitsDiv;
        }
        
        return subjectArray;
    }
    private void Console_Print_Teacher(String[][] teacher){
        for (int i = 0; i < teacher.length; i++) {
            for (int j = 0; j < teacher[0].length; j++) {
                System.out.println(teacher[i][j]+"");
            }
        }
    }
    
    public ComboBoxModel<String> Array_Subject_Code() throws IOException{
        
        Object[][] a = this.Read_Subject();
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = (String) a[i][1];
        }
        
        return (new DefaultComboBoxModel<>(b));
    }
}
