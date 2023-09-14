public class StringExercise {
    public static void main(String[] args) {

        String oneLine = "We don't need no education";

        System.out.println(oneLine);
        System.out.println(oneLine.replace("We don't need no education", "We don't need no thought control"));
        System.out.println(oneLine.replace("We don't need no education","Check \"this\" out!, \"s inside of \"s!"));
        System.out.println(oneLine.replace("We don't need no education","In windows, the main drive is usually C:\\"));
        System.out.println(oneLine.replace("We don't need no education","I can do backslashes \\, double backslashes \\\\," +
                "and the amazing triple backslash \\\\\\!"));

    }
}
