package com.myproject;

import javax.swing.SwingUtilities;

public class App 
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(StudentGradeTrackerGUI::new);
    }
}
