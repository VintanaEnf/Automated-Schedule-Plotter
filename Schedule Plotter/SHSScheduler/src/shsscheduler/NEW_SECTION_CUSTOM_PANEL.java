/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shsscheduler;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author vinta
 */
public class NEW_SECTION_CUSTOM_PANEL extends JPanel{
    
    NEW_SECTION_CUSTOM_PANEL(int SubjectCount){
        Logic_Utils log = new Logic_Utils();
        
        this.setLayout(null);
        this.setSize(322, 30*SubjectCount);
        this.add(new JLabel("Hello World!"));
        this.setVisible(true);
        
    }
}
