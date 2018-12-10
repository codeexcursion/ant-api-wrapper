/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeexcursion.ant.filters;

import java.util.Optional;

import com.codeexcursion.ant.util.PathsUtil;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/**
 *
 * @author chris
 */
public class TokenFilter extends org.apache.tools.ant.filters.TokenFilter {

  public TokenFilter(
    Project project
  ) {
	Optional.ofNullable(project).orElseThrow(() -> new BuildException("Task requires a valid project."));
	super.setProject(project);
  }

  
  /**
   * Encapsulates the parent addContainsString method.
   * @param token - String to filter for in resource.
   * @return this object.
   */  
  public TokenFilter addContainsStringC(String token) {
  	TokenFilter.ContainsString containsString = new TokenFilter.ContainsString();
  	containsString.setContains(token);
  	super.addContainsString(containsString);
    return this;
  }  
  
  /**
   * Encapsulates the parent addReplaceRegex method.
   * @param token - String to filter for in resource.
   * @return this object.
   */  
  public TokenFilter addReplaceRegexC(String pattern, String replaceWith) {
  	TokenFilter.ReplaceRegex replaceRegex = new TokenFilter.ReplaceRegex();
  	replaceRegex.setPattern(pattern);
  	replaceRegex.setReplace(replaceWith);
  	super.addReplaceRegex(replaceRegex);
    return this;
  }  
  
  

}