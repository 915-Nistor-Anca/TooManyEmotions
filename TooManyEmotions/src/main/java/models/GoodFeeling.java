package models;

public class GoodFeeling implements Feeling {
    private String name;
    private String description;
    private int intensity;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getIntensity() {
        return intensity;
    }
}
