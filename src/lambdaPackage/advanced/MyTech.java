package lambdaPackage.advanced;

public class MyTech {
    private String batch;
    private String batchName;
    private int batchAverage;
    private int totalStudent;

    public MyTech(String batch, String batchName, int batchAverage, int totalStudent) {
        this.batch = batch;
        this.batchName = batchName;
        this.batchAverage = batchAverage;
        this.totalStudent = totalStudent;
    }

    public MyTech() {
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getBatchAverage() {
        return batchAverage;
    }

    public void setBatchAverage(int batchAverage) {
        this.batchAverage = batchAverage;
    }

    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }

    @Override
    public String toString() {
        return "TechPro{" +
                "batch='" + batch + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchAverage=" + batchAverage +
                ", totalStudent=" + totalStudent +
                '}';
    }
}
