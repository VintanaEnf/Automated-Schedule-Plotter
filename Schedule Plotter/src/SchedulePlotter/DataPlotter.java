
package SchedulePlotter;

import java.io.IOException;

/**
 *
 * @author vinta
 */
public class DataPlotter extends DataManager {
    
    
    DataPlotter() throws IOException{
        
        
        Object[][] SectionsCollection = this.Read_Sections();
        Object[][] SubjectsCollection = this.Read_Subject();
        Object[][] TeachersCollection = this.Read_Teacher();
        
        
    }
    
    
    
}
