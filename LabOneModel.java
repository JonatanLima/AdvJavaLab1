public class LabOneModel {

    private String labName;
    private int labNumber;

    public LabOneModel(String labName, int labNumber) {
        setLabName(labName);
        setLabNumber(labNumber);
    }

    public void setLabName(String labName) {
        if (isValidLabName(labName)) {
            this.labName = labName;
        } else {
            throw new IllegalArgumentException("Invalid lab name");
        }
    }

    public void setLabNumber(int labNumber) {
        if (isValidLabNumber(labNumber)) {
            this.labNumber = labNumber;
        } else {
            throw new IllegalArgumentException("Invalid lab number");
        }
    }

    private boolean isValidLabName(String labName) {
        // Add your validation logic for lab name
        return labName != null && !labName.trim().isEmpty();
    }

    private boolean isValidLabNumber(int labNumber) {
        // Add your validation logic for lab number
        return labNumber > 0;
    }

    // Other methods and functionalities for your lab model
}
