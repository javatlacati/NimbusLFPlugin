package org.javapro.nimbuslf;

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

import javax.swing.UIManager;
import java.util.Arrays;

public class NimbusLookAndFeelApplicationComponent implements ApplicationComponent {
    @Override
    public void initComponent() {
        System.out.println("Substance component loaded");
        try {
            System.out.println("installed look and feels:");
            Arrays.stream(UIManager.getInstalledLookAndFeels()).map(UIManager.LookAndFeelInfo::getClassName)
                    .forEach(System.out::println);
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void disposeComponent() {
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "NimbusLookAndFeelApplicationComponent";
    }
}
