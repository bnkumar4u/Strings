import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static final String EXAMPLE_TEST = "This is my small example "
            + "string which I'm going to " + "use for pattern matching.";



    public static void main(String[] arhs) {
        String s;

        s = "2 3 3";

        System.out.println(s.matches(".*"));

        String[] subStrings = s.split(" ");

        System.out.println(subStrings.length);

        for(String string :subStrings)
            System.out.println(string);

        System.out.println(EXAMPLE_TEST);

        System.out.println(EXAMPLE_TEST.matches("\\w.*"));
        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
        System.out.println(splitString.length);// should be 14
        for (String string : splitString) {
            System.out.println(string);
        }

        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));

        System.out.println("**************************************************************************************************************");

        final String EXAMPLE_TEST2 = "This2 is my small example string which I'm going to use for pattern matching.";

        System.out.println(EXAMPLE_TEST2);

        Pattern pattern = Pattern.compile("\\w+");

        // in case you would like to ignore case sensitivity,
        // you could use this statement:
        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(EXAMPLE_TEST2);

        // check all occurance

        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }

        // now create a new pattern and matcher to replace whitespace with tabs

        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher2 = replace.matcher(EXAMPLE_TEST2);
        System.out.println(matcher2.replaceAll("\t"));
    }
}
