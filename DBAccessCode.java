
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class DBAccessCode {
    public static String g_url = "jdbc:mysql://localhost:3306/ml_loan_db1";
    public static String g_user = "root";
    public static String g_password = "root";    
    public static MainFrameUI mainframe = null;
    public static ArrayList <ArrayList> root_list =  new ArrayList<>();
    public static boolean g_UserMode = true;
}
