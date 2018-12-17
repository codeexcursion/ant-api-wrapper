/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeexcursion.ant.tasks.condition;

import java.util.Optional;

import com.codeexcursion.ant.util.PathsUtil;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/**
 *
 * @author chris
 */
public class FilesMatch extends org.apache.tools.ant.taskdefs.condition.FilesMatch {

  /**
   * Encapsulates the parent setFile1 method.
   * @param file1
   * @return this object
   */  
  public FilesMatch setFile1C(String file1) {
    super.setFile1(PathsUtil.getFile(file1));
    return this;
  }  

  /**
   * Encapsulates the parent setFile2 method.
   * @param file2
   * @return this object
   */  
  public FilesMatch setFile2C(String file2) {
    super.setFile2(PathsUtil.getFile(file2));
    return this;
  }  
  
  
}
