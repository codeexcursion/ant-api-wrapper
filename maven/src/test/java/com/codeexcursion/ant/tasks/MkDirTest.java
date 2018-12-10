/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeexcursion.ant.tasks;
import com.codeexcursion.ant.TestHelper;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Assert;
import org.apache.tools.ant.Project;
import org.junit.Test;
/**
 *
 * @author chris
 */
public class MkDirTest {
  
  @Test
  public void testMkdirAndDelete() {
    Project project = new Project();
    project.setName("Copy unit test.");
    
    String destDir = TestHelper.BASE_DIR + "/iWasMade";
    if(Files.exists(Paths.get(destDir))) {
      new Delete(project).setQuietC(true).setDirC(destDir).execute();
    }
    new Mkdir(project).setDirC(destDir).execute();
    Assert.assertTrue("Directory " + destDir + " should exist.", Files.exists(Paths.get(destDir)));

    new Delete(project).setDirC(destDir).execute();
    Assert.assertFalse("Directory " + destDir + " should not exist.", Files.exists(Paths.get(destDir)));
    
  }

  
}
