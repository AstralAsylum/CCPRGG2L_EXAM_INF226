import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pattern pattern = null;
        Matcher match = null;
        boolean isValid = false;

        // ============================================================
        System.out.println("1. Password Validation");
        // (10 points)

        // Rules

        // 1. The password length should be greater than or equal to the total number of
        // letters in your surname.

        // 2. Any characters are allowed except the consonant letters in your surname.

        // 3. If your surname begins with a vowel, the password should begin with any
        // special character

        // 4. If your surname ends with a consonant, the password should end with any
        // digit.

        System.out.print("Enter Password: ");
        String password = scan.nextLine();

        // Provide the pattern
        pattern = Pattern.compile("^[^CRZcrz](?=.*\\D)(?=.*\\d)[\\D\\d]{4,}$");

        match = pattern.matcher(password);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Password is valid! ");
        } else {
            System.out.println("Password is invalid! ");
        }

        // ============================================================
        System.out.println("2. Personal Email Address Validation");
        // (10 points)

        // Note:
        // The prefix appears to the left of the @ symbol.
        // The domain appears to the right of the @ symbol. (e.g. gmail.com)

        // Rules

        // 1. The email domain should always end with "gmail.com" if your first name is
        // more than one.

        // 2. The email domain should always end with "ymail.com" if you only have one
        // first name.

        // 2. The email prefix should contain the last two digits of your student
        // number. This can appear anywhere in the prefix.

        // 3. The length of the email prefix should be at least 10 characters if the
        // last digit of your student number is an even number.

        // 4. The length of the email prefix should be at least 15 characters if the
        // last digit of your student number is an odd number.

        // 5. The email prefix should not contain any special characters except the
        // underscore and the dot.

        System.out.print("Enter Email: ");
        String email = scan.nextLine();

        // Provide regex pattern
        pattern = Pattern.compile("^(\\w{10,}[36])+@gmail.com");

        match = pattern.matcher(email);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Valid email!");
        } else {
            System.out.println("Invalid email!");
        }

        // ============================================================
        System.out.println("3. URL Validation");
        // (10 points)

        // Note:
        // URL's mainly consists of three parts.

        // https://www.facebook.com/settings

        // - The protocol. (e.g. http:// or https://)
        // - The domain name. (e.g. www.facebook.com)
        // - The path. (e.g. /settings)

        // Rules

        // 1. Both protocol and path are optional.

        // 2. The domain should contain your first name and last name.

        // 3. The domain should not contain any special characters except the minus/dash
        // and the dot.

        // Valid URL's
        // www.elizerponio.com
        // http://www.elizerponio.com
        // http://elizerponio.com.ph/aboutme
        // http://127.0.0.1
        // http://127.0.0.1/contact-us

        // Invalid URL's
        // httpelizerponio.com//
        // http:elizerponio.com
        // http://elizer-ponio
        // http://elizerponio.com.127.0.0.1/

        System.out.print("Enter URL: ");
        String url = scan.nextLine();

        // Provide regex pattern
        pattern = Pattern.compile("(^[https://]*)+(\\w{3})+.+(\\w)+.(\\w)");

        match = pattern.matcher(url);

        isValid = match.matches();

        if (isValid) {
            System.out.println("Valid URL!");
        } else {
            System.out.println("Invalid URL!");
        }

        // ============================================================
        System.out.println("4. Finding and retrieving files.");
        // (10 points)

        // Rules
        // 1. If the last character of your surname is a vowel, find and retrieve all
        // source
        // code files.

        // 2. If the last character of your surname is a consonant, find and retrieve
        // all non source code files.

        String myfiles = "report.pptx ,project2019.xlsx, assignment2020.docx, registration2020.txt, helloworld.py, snake.java, hacker.cpp";

        // Provide regex pattern
        pattern = Pattern
                .compile("\\w+((.pptx)|(.txt)|(.xlsx)|(.docx))");
        match = pattern.matcher(myfiles);

        boolean found = false;

        while (match.find()) {
            System.out.println("I found the text " + match.group());
            found = true;
        }
        if (!found) {
            System.out.println("No files found.");
        }

        // ============================================================
        System.out.println("5. Search and remove hashtag");
        // (10 points)

        String tweet = "I'd pet a million stray pit bulls before I'd eat a single pink-slimy McBite. #McDStories http://bit.ly/wd0BDe";

        // Instructions
        // 1. Remove the hashtag in the tweet

        // Provide the regex pattern
        tweet = tweet.replaceAll("[#]", "");

        System.out.println(tweet);

        // ============================================================
        System.out.println("6. Search and remove URL");
        // (10 points)

        tweet = "The oldest living survivor of the Japanese Attack on Pearl Harbor in 1941 celebrated his upcoming 105th birthday at the National World War II Museum in New Orleans. Joseph Eskenazi of Redondo Beach, California, boarded a train Friday for the journey. http://apne.ws/AayqsiC";

        // Instructions
        // 1. Remove the URL in the tweet

        // Provide the regex pattern
        tweet = tweet.replaceAll("(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)", "");

        System.out.println(tweet);

        // ============================================================
        System.out.println("7. Search and remove special characters");
        // (10 points)

        tweet = "Press On, three, was killed training this morning at Santa Anita – “musculoskeletal,” for now. He is the sixth dead horse at Cal tracks through the first three weeks of 2023. “Reform” is a ruse, “safe racing” a lie. Horseracing kills; it must end.";

        // Instructions
        // 1. Remove all special characters in the tweet.

        // Provide the regex pattern
        tweet = tweet.replaceAll("[^\\w\\s]", "");

        System.out.println(tweet);

        scan.close();
    }
}