package org.fxmisc.richtext;

public class GenericStyledAreaBehaviorParameters {

    private boolean includeSelectAll = true;
    private boolean includeCopy = true;
    private boolean includePaste = true;
    private boolean includeCut = true;
    private boolean includeUndo = true;
    private boolean includeRedo = true;
    private boolean includeShiftZRedo = true;

    public GenericStyledAreaBehaviorParameters() {
    }

    public boolean isIncludeSelectAll() {
        return includeSelectAll;
    }

    public void setIncludeSelectAll(boolean includeSelectAll) {
        this.includeSelectAll = includeSelectAll;
    }

    public boolean isIncludeCopy() {
        return includeCopy;
    }

    public void setIncludeCopy(boolean includeCopy) {
        this.includeCopy = includeCopy;
    }

    public boolean isIncludePaste() {
        return includePaste;
    }

    public void setIncludePaste(boolean includePaste) {
        this.includePaste = includePaste;
    }

    public boolean isIncludeCut() {
        return includeCut;
    }

    public void setIncludeCut(boolean includeCut) {
        this.includeCut = includeCut;
    }

    public boolean isIncludeUndo() {
        return includeUndo;
    }

    public void setIncludeUndo(boolean includeUndo) {
        this.includeUndo = includeUndo;
    }

    public boolean isIncludeRedo() {
        return includeRedo;
    }

    public void setIncludeRedo(boolean includeRedo) {
        this.includeRedo = includeRedo;
    }

    public boolean isIncludeShiftZRedo() {
        return includeShiftZRedo;
    }

    public void setIncludeShiftZRedo(boolean includeShiftZRedo) {
        this.includeShiftZRedo = includeShiftZRedo;
    }
}
