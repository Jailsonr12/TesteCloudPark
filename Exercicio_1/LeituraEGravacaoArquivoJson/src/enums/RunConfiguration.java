package enums;

public enum RunConfiguration {

    STOP(0),
    READ(1),
    WRITE(2);

    private int runNumber;

    RunConfiguration(int runNumber) {
        this.runNumber = runNumber;
    }

    public static RunConfiguration toRunConfiguration(int runNumber) {
        switch (runNumber) {
            case 1:
                return RunConfiguration.READ;
            case 2:
                return RunConfiguration.WRITE;
            default:
                return RunConfiguration.STOP;
        }

    }

}
