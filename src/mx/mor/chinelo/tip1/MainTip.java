/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.mor.chinelo.tip1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is a suggestion for get attributes and values from
 * Object/Pojo/Class.
 *
 * @author Marco Antonio Barrios Molina | Chinelo Fundator | www.chinelo.io
 */
public class MainTip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException {
        String packageName = "mx.mor.chinelo.tip1"; //Name where stay the classes.

        //<editor-fold defaultstate="collapsed" desc="Get class files from package.">
        URL root = Thread.currentThread().getContextClassLoader().getResource(packageName.replace(".", "/"));
        File[] files = new File(root.getFile()).listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".class");
            }
        });
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Get attributes from class/object.">
        for (File file : files) {
            String className = file.getName().replaceAll(".class$", "");
            if (className == null || className.isEmpty() || className.contains("MainTip")) {
                continue;
            }
            Class<?> cls = null;
            try {
                cls = Class.forName(packageName + "." + className);
                System.out.println("NameClass    " + cls.getCanonicalName());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainTip.class.getName()).log(Level.SEVERE, null, ex);
            }
            Object t = null;
            try {
                t = cls.newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(MainTip.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(MainTip.class.getName()).log(Level.SEVERE, null, ex);
            }
            Field properties[] = cls.getDeclaredFields();
            for (int i = 0; i < properties.length; i++) {
                Field field = properties[i];
                field.setAccessible(true);
                if (field.getName().equalsIgnoreCase("permission")) {
                    System.out.println("Name Atributte =>   " + field.getName());
                    HashMap<String, String> permisos = null;
                    try {
                        permisos = (HashMap<String, String>) field.get(t);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(MainTip.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for (Map.Entry<String, String> entry : permisos.entrySet()) {
                        System.out.println("Key =>   " + entry.getKey());
                        System.out.println("Value =>   " + entry.getValue());
                    }
                }
            }
            System.out.println("==================");
        }
        //</editor-fold>

    }

}
