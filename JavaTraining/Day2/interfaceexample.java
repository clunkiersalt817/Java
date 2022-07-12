package JavaTraining.Day2;

interface college {
    void studentDetails(int rollNo, String name);

    void facultyDetails(int empID, String name);
}

interface results {
    void exam(String subject);
}

class comDetails implements college, results {
    public void studentDetails(int rollNo, String name) {
        System.out.println(rollNo + "" + name);
    }

    public void facultyDetails(int empID, String name) {
        System.out.println(empID + "" + name);
    }

    public void exam(String subject) {
        System.out.println(subject);
    }
}

public class interfaceexample {
    public static void main(String... args) {
        comDetails cD = new comDetails();
        cD.studentDetails(123, "Kshitiz");
        cD.facultyDetails(55, "Chaudhary");
        cD.exam("English");
    }
}
