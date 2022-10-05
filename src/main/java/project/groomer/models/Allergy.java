package project.groomer.models;

public enum Allergy {
    SAMPON("sampon"), GYÓGYSZER("gyógyszer"), ÉLELMISZER("élelmiszer"), TISZTÍTÓSZER("tisztítószer"), NONE("none");
    private String text;

    Allergy() {
    }

    Allergy(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
