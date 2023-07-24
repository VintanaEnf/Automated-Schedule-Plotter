/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SchedulePlotter;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinta
 */
public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form EditInterface
     */
    public MainInterface() {
        try {
            // Set the Look and Feel to Nimbus
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
            System.out.println("Can't Load Buttons");
        }
        
        
        System.out.println("The Class \"EditInterface\" successfully created.");
        initComponents();
        this.setTitle("Automated Senior-Highschool Schedule Creator Suite V1.0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab = new javax.swing.JTabbedPane();
        Tab_Notes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tab_Teacher = new javax.swing.JPanel();
        Tab_Teacher_Scroll = new javax.swing.JScrollPane();
        Tab_Teacher_Table = new javax.swing.JTable();
        Tab_Subjects = new javax.swing.JPanel();
        Tab_Teacher_Scroll1 = new javax.swing.JScrollPane();
        Tab_Teacher_Table1 = new javax.swing.JTable();
        Menu = new javax.swing.JMenuBar();
        Menu_Files = new javax.swing.JMenu();
        Menu_Files_Begin = new javax.swing.JMenuItem();
        Menu_Files_Force = new javax.swing.JMenuItem();
        Menu_Files_Import = new javax.swing.JMenuItem();
        Menu_Files_OpenSave = new javax.swing.JMenuItem();
        Separator = new javax.swing.JPopupMenu.Separator();
        Menu_Files_Exit = new javax.swing.JMenuItem();
        Menu_New = new javax.swing.JMenu();
        Menu_New_Teacher = new javax.swing.JMenuItem();
        Menu_New_Section = new javax.swing.JMenuItem();
        Menu_New_Subject = new javax.swing.JMenuItem();
        Menu_Edit = new javax.swing.JMenu();
        Menu_Edit_Teacher = new javax.swing.JMenuItem();
        Menu_Edit_Section = new javax.swing.JMenuItem();
        Menu_Edit_Subject = new javax.swing.JMenuItem();
        Menu_Delete = new javax.swing.JMenu();
        Menu_Delete_Teacher = new javax.swing.JMenuItem();
        Menu_Delete_Section = new javax.swing.JMenuItem();
        Menu_Delete_Subject = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        Tab.setBackground(new java.awt.Color(153, 153, 153));
        Tab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tab.setFont(new java.awt.Font("Calibri", 3, 12)); // NOI18N
        Tab.setOpaque(true);
        Tab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabKeyPressed(evt);
            }
        });

        jLabel1.setText("Welcome to the Automated Scheduler Program.");

        jLabel2.setText("To get started, click the 'new' menu above, then add every teacher, subject and section.");

        jLabel3.setText("Click 'Files' then 'Start Scheduling' to plot the schedule automatically.");

        javax.swing.GroupLayout Tab_NotesLayout = new javax.swing.GroupLayout(Tab_Notes);
        Tab_Notes.setLayout(Tab_NotesLayout);
        Tab_NotesLayout.setHorizontalGroup(
            Tab_NotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_NotesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tab_NotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(720, Short.MAX_VALUE))
        );
        Tab_NotesLayout.setVerticalGroup(
            Tab_NotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_NotesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(548, Short.MAX_VALUE))
        );

        Tab.addTab("   Notes   ", Tab_Notes);

        Tab_Teacher_Table.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Tab_Teacher_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Priority", "Subject 1", "Subject 2", "Enabled"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tab_Teacher_Table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Tab_Teacher_Scroll.setViewportView(Tab_Teacher_Table);
        if (Tab_Teacher_Table.getColumnModel().getColumnCount() > 0) {
            Tab_Teacher_Table.getColumnModel().getColumn(1).setHeaderValue("Priority");
            Tab_Teacher_Table.getColumnModel().getColumn(2).setResizable(false);
            Tab_Teacher_Table.getColumnModel().getColumn(2).setHeaderValue("Subject 1");
            Tab_Teacher_Table.getColumnModel().getColumn(3).setHeaderValue("Subject 2");
        }

        javax.swing.GroupLayout Tab_TeacherLayout = new javax.swing.GroupLayout(Tab_Teacher);
        Tab_Teacher.setLayout(Tab_TeacherLayout);
        Tab_TeacherLayout.setHorizontalGroup(
            Tab_TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_TeacherLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(Tab_Teacher_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        Tab_TeacherLayout.setVerticalGroup(
            Tab_TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_TeacherLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Tab_Teacher_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tab.addTab("   Teachers   ", Tab_Teacher);

        Tab_Teacher_Table1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Tab_Teacher_Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Code Name", "Units", "Division of Units"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tab_Teacher_Table1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Tab_Teacher_Scroll1.setViewportView(Tab_Teacher_Table1);

        javax.swing.GroupLayout Tab_SubjectsLayout = new javax.swing.GroupLayout(Tab_Subjects);
        Tab_Subjects.setLayout(Tab_SubjectsLayout);
        Tab_SubjectsLayout.setHorizontalGroup(
            Tab_SubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_SubjectsLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(Tab_Teacher_Scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
        Tab_SubjectsLayout.setVerticalGroup(
            Tab_SubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_SubjectsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Tab_Teacher_Scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tab.addTab("  Subjects  ", Tab_Subjects);

        Menu.setOpaque(true);

        Menu_Files.setText(" Files ");

        Menu_Files_Begin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Menu_Files_Begin.setText("Start Scheduling");
        Menu_Files.add(Menu_Files_Begin);

        Menu_Files_Force.setText("Reload Tables");
        Menu_Files_Force.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Files_ForceActionPerformed(evt);
            }
        });
        Menu_Files.add(Menu_Files_Force);

        Menu_Files_Import.setText("Import / Export");
        Menu_Files.add(Menu_Files_Import);

        Menu_Files_OpenSave.setText("Open Save Location");
        Menu_Files_OpenSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Files_OpenSaveActionPerformed(evt);
            }
        });
        Menu_Files.add(Menu_Files_OpenSave);
        Menu_Files.add(Separator);

        Menu_Files_Exit.setText("Exit");
        Menu_Files_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Files_ExitActionPerformed(evt);
            }
        });
        Menu_Files.add(Menu_Files_Exit);

        Menu.add(Menu_Files);

        Menu_New.setText(" New ");

        Menu_New_Teacher.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Menu_New_Teacher.setText("New Teacher");
        Menu_New_Teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_New_TeacherActionPerformed(evt);
            }
        });
        Menu_New.add(Menu_New_Teacher);

        Menu_New_Section.setText("New Section");
        Menu_New_Section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_New_SectionActionPerformed(evt);
            }
        });
        Menu_New.add(Menu_New_Section);

        Menu_New_Subject.setText("New Subject");
        Menu_New_Subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_New_SubjectActionPerformed(evt);
            }
        });
        Menu_New.add(Menu_New_Subject);

        Menu.add(Menu_New);

        Menu_Edit.setText(" Edit ");

        Menu_Edit_Teacher.setText("Edit Teacher");
        Menu_Edit.add(Menu_Edit_Teacher);

        Menu_Edit_Section.setText("Edit Section");
        Menu_Edit.add(Menu_Edit_Section);

        Menu_Edit_Subject.setText("Edit Subject");
        Menu_Edit.add(Menu_Edit_Subject);

        Menu.add(Menu_Edit);

        Menu_Delete.setText(" Delete ");

        Menu_Delete_Teacher.setText("Delete Teacher");
        Menu_Delete.add(Menu_Delete_Teacher);

        Menu_Delete_Section.setText("Delete Section");
        Menu_Delete.add(Menu_Delete_Section);

        Menu_Delete_Subject.setText("Delete Subject");
        Menu_Delete.add(Menu_Delete_Subject);

        Menu.add(Menu_Delete);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Object Values_Teachers[][];
    public Object Values_Subjects[][];
    public void UpdateValues() throws IOException{
        DataManager log = new DataManager();
        Values_Teachers = log.Read_Teacher();
        Values_Subjects = log.Read_Subject();
        Update_Table_Teacher();
    }
    
    private void Menu_New_TeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_New_TeacherActionPerformed
        ActionNewTeacher Action = null;
        try {
            Action = new ActionNewTeacher(this, true);
        } catch (IOException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        Action.setVisible(true);
        
    }//GEN-LAST:event_Menu_New_TeacherActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void Menu_Files_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Files_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Menu_Files_ExitActionPerformed

    private void TabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TabKeyPressed

    private void Menu_Files_OpenSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Files_OpenSaveActionPerformed
        File directory = new File("Saves//");
        try {
            Desktop.getDesktop().open(directory);
        } catch (IOException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_Files_OpenSaveActionPerformed

    private void Menu_New_SectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_New_SectionActionPerformed
        ActionNewSection create = new ActionNewSection(this, true);
        create.setVisible(true);
    }//GEN-LAST:event_Menu_New_SectionActionPerformed

    private void Menu_New_SubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_New_SubjectActionPerformed
        ActionNewSubject box = new ActionNewSubject(this, true);
        box.setVisible(true);
    }//GEN-LAST:event_Menu_New_SubjectActionPerformed

    private void Menu_Files_ForceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Files_ForceActionPerformed
        try {
            UpdateValues();
        } catch (IOException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_Files_ForceActionPerformed
    private void Update_Table_Teacher(){
        try {
            DataManager a = new DataManager();
            Object TableColumns[] = {"Full Name", "Priority Subject", "Subject 1", "Subject 2", "Enabled"};
            Object Teachers[][] = a.Read_Teacher();
            
            DefaultTableModel model = new DefaultTableModel(Teachers, TableColumns);
            Tab_Teacher_Table.setModel(model);
            
        } catch (IOException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu Menu_Delete;
    private javax.swing.JMenuItem Menu_Delete_Section;
    private javax.swing.JMenuItem Menu_Delete_Subject;
    private javax.swing.JMenuItem Menu_Delete_Teacher;
    private javax.swing.JMenu Menu_Edit;
    private javax.swing.JMenuItem Menu_Edit_Section;
    private javax.swing.JMenuItem Menu_Edit_Subject;
    private javax.swing.JMenuItem Menu_Edit_Teacher;
    private javax.swing.JMenu Menu_Files;
    private javax.swing.JMenuItem Menu_Files_Begin;
    private javax.swing.JMenuItem Menu_Files_Exit;
    private javax.swing.JMenuItem Menu_Files_Force;
    private javax.swing.JMenuItem Menu_Files_Import;
    private javax.swing.JMenuItem Menu_Files_OpenSave;
    private javax.swing.JMenu Menu_New;
    private javax.swing.JMenuItem Menu_New_Section;
    private javax.swing.JMenuItem Menu_New_Subject;
    private javax.swing.JMenuItem Menu_New_Teacher;
    private javax.swing.JPopupMenu.Separator Separator;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JPanel Tab_Notes;
    private javax.swing.JPanel Tab_Subjects;
    private javax.swing.JPanel Tab_Teacher;
    private javax.swing.JScrollPane Tab_Teacher_Scroll;
    private javax.swing.JScrollPane Tab_Teacher_Scroll1;
    private javax.swing.JTable Tab_Teacher_Table;
    private javax.swing.JTable Tab_Teacher_Table1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
