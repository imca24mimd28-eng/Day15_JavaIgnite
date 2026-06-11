public class Main {
	public static void main(String[] args) {
        Classroom classroom = new Classroom();

        StudentThread s1 = new StudentThread(classroom, "Student 1");
        StudentThread s2 = new StudentThread(classroom, "Student 2");
        StudentThread s3 = new StudentThread(classroom, "Student 3");

        TeacherThread teacher = new TeacherThread(classroom);

        s1.start();
        s2.start();
        s3.start();

        try {
            Thread.sleep(3000); // Wait for a few seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        teacher.start();
    }
}

