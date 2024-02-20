class Student {
    String id;
    private int noOfSubjectsRegistered;
    String[] subjectCode;
    private int[] subjectCredits;
    private double[] gradeObtained;
    private double spi;

    public Student(String id, int noOfSubjectsRegistered, String[] subjectCode,
                   int[] subjectCredits, double[] gradeObtained) {
        this.id = id;
        this.noOfSubjectsRegistered = noOfSubjectsRegistered;
        this.subjectCode = subjectCode;
        this.subjectCredits = subjectCredits;
        this.gradeObtained = gradeObtained;
        this.spi = 0.0;
    }

    public void calculateSPI() {
        double totalCredits = 0.0;
        double weightedSum = 0.0;

        for (int i = 0; i < noOfSubjectsRegistered; i++) {
            totalCredits += subjectCredits[i];
            weightedSum += gradeObtained[i] * subjectCredits[i];
        }

        if (totalCredits > 0) {
            spi = weightedSum / totalCredits;
        }
    }

    public double getSpi() {
        return spi;
    }
}

public class lab6_1{
    public static void main(String[] args) {
        int n = args.length / 5;
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String idNo = args[i * 5];
            int subjects = Integer.parseInt(args[i * 5 + 1]);
            String[] codes = args[i * 5 + 2].split(",");
            int[] credits = new int[subjects];
            double[] grades = new double[subjects];

            for (int j = 0; j < subjects; j++) {
                credits[j] = Integer.parseInt(args[i * 5 + 3].split(",")[j]);
                grades[j] = Double.parseDouble(args[i * 5 + 4].split(",")[j]);
            }

            students[i] = new Student(idNo, subjects, codes, credits, grades);
            students[i].calculateSPI();
        }

        System.out.println("SPI for each student:");
        for (Student student : students) {
            System.out.printf("Student ID %s: SPI = %.2f%n", student.id, student.getSpi());
        }
    }
}
