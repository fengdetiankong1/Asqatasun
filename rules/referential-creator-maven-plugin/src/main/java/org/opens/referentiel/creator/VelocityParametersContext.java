/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opens.referentiel.creator;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alingua
 */
public class VelocityParametersContext {

    private List<String> classRule = new LinkedList();
    private String referentielLabel;
    private String classString;
    private String testCode;
    private String referentiel;
    private String packageString;
    private String destinationFolder;
    private Set<Integer> themes = new LinkedHashSet();

    public String getClassString() {
        return this.classString;
    }

    public void setClassString(String classString) {
        this.classString = classString;
    }

    public String getTestCode() {
        return this.testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    public String getPackageString() {
        return packageString;
    }

    public void setPackageString(String packageString) {
        this.packageString = packageString;
    }

    public String getReferentiel() {
        return referentiel;
    }

    public void setReferentiel(String referentiel) {
        this.referentiel = referentiel;
    }

    public String getReferentielLabel() {
        return referentielLabel;
    }

    public void setReferentielLabel(String referentielLabel) {
        this.referentielLabel = referentielLabel;
    }

    public List<String> getClassRule() {
        return classRule;
    }

    public void setClassRule(List<String> classRule) {
        this.classRule = classRule;
    }

    public Set<Integer> getThemes() {
        return themes;
    }

    public void setThemes(Set<Integer> themes) {
        this.themes = themes;
    }

    public String getDestinationFolder() {
        return destinationFolder;
    }

    public void setDestinationFolder(String destinationFolder) {
        this.destinationFolder = destinationFolder;
    }
}
